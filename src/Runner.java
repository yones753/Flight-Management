
import Facades.*;
import connectionsDB.pgAdminConnection;
import dao.*;
import poco.*;

import java.sql.*;
import java.util.*;
import java.util.function.Consumer;

import java.sql.Connection;

public class Runner {
    public static void test() {

        AnonymousFacade anonymousFacade = new AnonymousFacade();
        AnonymousFacade client = null;
        AdministratorFacade admin = null;
        CustomerFacade customer = null;
        AirlineFacade airline = null;


//        anonymousFacade.create_new_user(new User("EL AL Airline","elal123","elal@gmail.com",3));
//         client = anonymousFacade.login("el al Airline", "elal123");
//         client = anonymousFacade.login("ARKIA Airline", "arkia123");
//         client = anonymousFacade.login( "Hodi", "hodi123");
//          client = anonymousFacade.login( "tarek", "tarek123");
//           client = anonymousFacade.login( "Admin", "admin123");


        if (client instanceof AdministratorFacade) {
            admin = ((AdministratorFacade) client);
        } else if (client instanceof CustomerFacade) {
            customer = ((CustomerFacade) client);
        } else {
            airline = ((AirlineFacade) client);
        }

//        System.out.println(customer);
//        System.out.println(airline);
//        System.out.println(admin);



        /////////////////////////Anonymous////////////////////////////////////
//        User newUser = new User("hodi", "hodi123", "hodi@gmail.com", 3);
//        anonymousFacade.create_new_user(newUser);
//        Customer newCustomer = new Customer("Hodi", "Zoubi", "naura", "05721434421", "4527 0301 1212 1445", 1);
//        anonymousFacade.add_customer(newCustomer,newUser);

//        System.out.println(anonymousFacade.get_all_countries());


        /////////////////////////Admin////////////////////////////////////
        //=============================addCustomer===================
//        User newUser = new User("tarek", "tarek123", "tarek@gmail.com", 3);
//        anonymousFacade.create_new_user(newUser);
//        Customer newCustomer = new Customer("Tarek", "Derawe", "Natanya", "0520434345", "0218 0303 1212 1445", 1);
//        admin.add_customer(newCustomer,newUser);
        //==============================addCountry==================
//        Country country = new Country("Morocco");
//        admin.add_country(country);
        //===============================addAirline========================
//        User newUser = new User("el al Airline", "elal123", "elal@gmail.com", 1);
//        anonymousFacade.create_new_user(newUser);
//        Airline_company newAirline = new Airline_company("EL AL Airline",12,1);
//        admin.add_airline(newAirline,newUser);
        //===============================addAdmin========================
//        User newUser = new User("admin4", "admin3123", "admin4@gmail.com", 3);
//        anonymousFacade.create_new_user(newUser);
//        Administrator newAdministrator = new Administrator("Admin2","admin2",1);
//        admin.add_administrator(newAdministrator, newUser);
        //===============================getAllCustomer========================
//        System.out.println(admin.get_all_customers());
        //===============================remove Admin========================
//        Administrator administrator = new Administrator(54,"koko","momo",146);
//        admin.remove_administrator(administrator);
        //===============================remove Airline========================
//        Airline_company airlineCompany = new Airline_company(29,"el al",4,150);
//        admin.remove_airline(airlineCompany);
        //===============================remove Customer========================
//        Customer c = new Customer(51,"yoy","momo","koko",
//                "5433", "66456",112);
//        admin.remove_customer(c);

//        Administrators administrators = new Administrators();
//        System.out.println(administrators.getAdministratorsById(40));
//        System.out.println(administrators.getAdministrators());


        /////////////////////////Airline company////////////////////////////////////
        //===============================update airline flight========================
//        Airline_company newAirline = new Airline_company(27, "ARKIA Airline", 12, 131);
//        airline.update_airline(newAirline);
        //===============================add flight========================
//        Flight f = new Flight(1,30, 12,
//                8, Timestamp.valueOf("2022-03-27 00:00:00"),
//                Timestamp.valueOf("2022-03-28 02:10:00"), 160);
//        System.out.println(airline.add_flight(f));
//        //===============================update flight========================
//        Flight updateFlight = new Flight(33, 29, 8, 14, Timestamp.valueOf("2020-12-20 20:00:00"), Timestamp.valueOf("2020-12-21 22:00:00"), 200);
//        airline.update_flight(updateFlight);
//        //===============================remove flight========================
//        Flight f = new Flight(30,27,4,4,
//                 Timestamp.valueOf("2022-12-12 00:00:00"),Timestamp.valueOf("2022-12-12 00:00:00"),125);
//          airline.remove_flight(f);
//        //===============================get my flight========================
//        System.out.println( airline.get_my_flights());


        /////////////////////////Customer////////////////////////////////////
//        //===============================get my tickets========================
//        System.out.println(customer.get_my_tickets());
//        //===============================add ticket========================
//        Flight flight = new Flight(35);
//        Ticket t = new Ticket(1,35,1);
//        customer.add_ticket(t);
//        //===============================remove ticket========================
//        Ticket ticket = new Ticket(61,30,51);
//        System.out.println(customer.remove_ticket(ticket));
//        //===============================Update customer========================
//        Customer updateCustomer = new Customer(66, "Tarek", "Derawe", "Tel aviv", "054324432", "0543 4334 2321 3345", 121);
//        System.out.println(customer.update_customer(updateCustomer));


        /////////////////////////FlightsDAO////////////////////////////////////
//        Flights flights = new Flights();
        // ALL function take Date + 00:00:00 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//        System.out.println(flights.getFlightsByLandingDate(Timestamp.valueOf("2022-03-29 00:00:00")));
//        System.out.println(flights.getFlightsByDepartureDate(Timestamp.valueOf("2022-03-29 00:00:00")));
//        System.out.println(flights.getFlightsByParameters(11,12,Timestamp.valueOf("2022-03-29 00:00:00")));
//        System.out.println(flights.getFlightsByOriginCountryId(11));
//        System.out.println(flights.getFlightsByDestinationCountryId(11));
//        System.out.println(flights.get_flights_by_airline_id(23));
//        Customer customer1 = new Customer(100);
//        System.out.println(flights.getFlightsByCustomer(customer1));
//        System.out.println(flights.get_departure_flights(8));
//        System.out.println(flights.get_arrival_flights(11));

        /////////////////////////airlineCompanyDAO////////////////////////////////////
//        Airline_companies airline_companies = new Airline_companies();
//        System.out.println(airline_companies.get_airline_by_parameters(11,12));

    }
}
