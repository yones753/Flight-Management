package Facades;

import Login.LoginToken;
import dao.*;
import poco.*;


public class AnonymousFacade extends FacadeBase {
    Customers customers = new Customers();
    Tickets tickets = new Tickets();
    LoginToken loginToken;


    public AnonymousFacade login(String username, String password) {
        int userRole = -1;
        AnonymousFacade anonymousFacade;
        LoginToken loginToken;
        User user = users.getUserByUsername(username);
        if (user == null) {
            System.out.println("User not exist in the system");
            return null;
        } else {
            if (password.equals(user._password)) {
                userRole = user._userRole;
            } else {
                System.out.println("Password not match !!!");
            }
        }

        switch (userRole) {
            case 1: {
                Administrator admin = administrators.getAdministratorsByUsername(user._username);
                loginToken = new LoginToken(admin._id, admin._firstName, userRole);
                anonymousFacade = new AdministratorFacade(loginToken);
                break;
            }
            case 2: {
                Customer custumer = customers.getCustomerByUsername(user._username);
                loginToken = new LoginToken(custumer._id, custumer._firstName, userRole);
                anonymousFacade = new CustomerFacade(loginToken);
                break;
            }
            case 3: {
                Airline_company airline = airlineCompanies.getAirlineByUsername(user._username);
                loginToken = new LoginToken(airline._id, airline._name, userRole);
                anonymousFacade = new AirlineFacade(loginToken);
                break;
            }
            default: {
                anonymousFacade = null;
            }
        }
        return anonymousFacade;
    }

    public boolean add_customer(Customer newCustomer, User newUser) {
        User user = users.getUserByUsername(newUser._username);
        if (user != null) {
            newCustomer._userId = user._id;
            try {
                customers.Add(newCustomer);
            } catch (Exception e) {
                e.printStackTrace();
                users.removeUserById(user._id);
            }
        }
        return false;
    }
}
