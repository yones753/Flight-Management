package poco;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.*;

public class Flight implements Ipoco{

    //DATA
    public int _id;
    public int _airlineCompanyId;
    public int _originCountryId;
    public int _destinationCountryId;
    public Timestamp _departureTime; //LocalDateTime String
    public Timestamp _landingTime;  //'2202-12-03 12:00:00'
    public int _remainingTickets;

    //Func
    public Flight(){}

    public Flight(int _id){
        this._id = _id;
    }

    public Flight( int _airlineCompanyId, int _originCountryId, int _destinationCountryId, Timestamp _departureTime, Timestamp _landingTime, int _remainingTickets) {
        this._airlineCompanyId = _airlineCompanyId;
        this._originCountryId = _originCountryId;
        this._destinationCountryId = _destinationCountryId;
        this._departureTime = _departureTime;
        this._landingTime = _landingTime;
        this._remainingTickets = _remainingTickets;
    }


    public Flight(int _id, int _airlineCompanyId, int _originCountryId, int _destinationCountryId, Timestamp _departureTime, Timestamp _landingTime, int _remainingTickets) {
        this._id = _id;
        this._airlineCompanyId = _airlineCompanyId;
        this._originCountryId = _originCountryId;
        this._destinationCountryId = _destinationCountryId;
        this._departureTime = _departureTime;
        this._landingTime = _landingTime;
        this._remainingTickets = _remainingTickets;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "_id=" + _id +
                ", _airlineCompanyId=" + this._airlineCompanyId +
                ", _originCountryId=" + this._originCountryId +
                ", _destinationCountryId=" + this._destinationCountryId +
                ", _departureTime=" + this._departureTime +
                ", _timeLanding=" + this._landingTime +
                ", _remainingTickets=" + this._remainingTickets +
                '}';
    }
}
