package Login;

import Facades.*;

//enum Role {
//    Admin,
//    Customer,
//    Airline
//}

public class LoginToken {
    public int id;
    public String name;
    public int role;

    public LoginToken(int id, String name, int role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

}