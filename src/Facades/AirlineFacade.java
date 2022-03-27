package Facades;

import Login.LoginToken;
import dao.*;
import poco.*;

import java.util.List;

public class AirlineFacade extends AnonymousFacade {

    public AirlineFacade(LoginToken loginToken) {
        System.out.println("<<<<<<<<<<<<<<<<<<<< Welcome " + loginToken.name + " >>>>>>>>>>>>>>>>>>>>>>>>>");
        super.loginToken = loginToken;
    }

    public List<Flight> get_my_flights() {
        List<Flight> list = null;
        list = flights.get_flights_by_airline_id(loginToken.id);
        return list;
    }

    public boolean update_airline(Airline_company airline) {
        if (loginToken.id == airline._id) {
            if (super.countries.isExist(airline._countryId)) {
                Airline_company airlineUpdate = new Airline_company(airline._id,airline._name,airline._countryId,airline._userId);
                return airlineCompanies.Update(airlineUpdate, airline._id);
            } else {
                System.out.println("Country id not exist");
            }
        }else {
            System.out.println("Token not match");
        }
        return false;
    }

    public boolean add_flight(Flight flight) {
        if (loginToken.id == flight._airlineCompanyId) {
            if (flight._remainingTickets > 0 &&
                    super.flights.isAlreadyExist(flight) &&
                    super.flights.validTime(flight) &&
                    super.flights.validCountries(flight)) {
                return flights.Add(flight);
            } else {
                System.out.println("Can't add this ticket, check your input");
            }
        } else {
            System.out.println("Not authorized");
        }
        return false;
    }

    public boolean update_flight(Flight flight) {
        if (loginToken.id == flight._airlineCompanyId) {
            if (flight._remainingTickets > 0 &&
                    super.flights.isAlreadyExist(flight) &&
                    super.flights.validTime(flight) &&
                    super.flights.validCountries(flight)) {
                return flights.Update(flight, flight._id);
            } else {
                System.out.println("Can't update this ticket, check your input");
            }
        } else {
            System.out.println("Not authorized");
        }
        return false;
    }

    public boolean remove_flight(Flight flight) {
        boolean flag = false;
        var list = get_my_flights();
        if (loginToken.id == flight._airlineCompanyId) {
            for (var f : list) {
                if (f._id == flight._id) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                return flights.Remove(flight._id);
            } else {
                System.out.println("Token not match or this airline don't have this ticket");
            }
        } else {
            System.out.println("Token not match");
        }
        return false;
    }

}
