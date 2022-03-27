package poco;

public class User implements Ipoco{
    //DATA
    public int _id;
    public String _username;
    public String _password;
    public String _email;
    public int _userRole;

    //FUNC
    public User(){}

    public User(String _username, String _password, String _email, int _userRole) {
        this._username = _username;
        this._password = _password;
        this._email = _email;
        this._userRole = _userRole;
    }

    public User(int _id, String _username, String _password, String _email, int _userRole) {
        this._id = _id;
        this._username = _username;
        this._password = _password;
        this._email = _email;
        this._userRole = _userRole;
    }

    @Override
    public String toString() {
        return "Users{" +
                "_id=" + _id +
                ", _username='" + this._username + '\'' +
                ", _password='" + this._password + '\'' +
                ", _email='" + this._email + '\'' +
                ", _userRole=" + this._userRole +
                '}';
    }
}
