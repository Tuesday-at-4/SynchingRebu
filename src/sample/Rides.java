/*package sample;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import javafx.beans.property.SimpleStringProperty;

public class Rides {
  private String passengerName;
  private String startTime;
  private String endTime;
  private String startLocation;
  private String endLocation;
  private int rideID;


  public Rides(String passName, String startT, String endT,String startLoc, String endLoc){
    this.passengerName = passName;
    this.startTime = startT;
    this.endTime = endT;
    this.startLocation = startLoc;
    this.endLocation = endLoc;
    Random rnd = new Random();
    this.rideID = rnd.nextInt(999999);
  }

  public String getPassengerName() {
    return passengerName;
  }

  public String getStartTime() {
    return startTime;
  }

  public String getEndTime() {
    return endTime;
  }

  public String getStartLocation() {
    return startLocation;
  }

  public String getEndLocation() {
    return endLocation;
  }

  public int getRideID() {
    return rideID;
  }
}
*/

package sample;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class Rides {
  private String passengerName;
  private LocalTime time_OfRide;
  private LocalDate date_OfRide;
  private String startLocation;
  private String endLocation;
  private int rideID;

  public Rides(String passName, LocalTime time, LocalDate Date, String startLoc, String endLoc) {
    this.passengerName = passName;
    this.date_OfRide = Date;
    this.time_OfRide = time;
    this.startLocation = startLoc;
    this.endLocation = endLoc;
    Random rnd = new Random();
    this.rideID = rnd.nextInt(999999);
  }

  public String getPassengerName() {
    return passengerName;
  }

  public LocalDate getDate_OfRide() {
    return date_OfRide;
  }

  public LocalTime getTime_OfRide() {
    return time_OfRide;
  }

  public String getEndLocation() {
    return endLocation;
  }

  public String getStartLocation() {
    return startLocation;
  }

  public int getRideID() {
    return rideID;
  }
}
