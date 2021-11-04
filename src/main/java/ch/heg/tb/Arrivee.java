package ch.heg.tb;

import java.util.List;

public class Arrivee {

  private String arrival;
  private String arrivalTimestamp;

  private Station station;

  public String getArrival() {
    return arrival;
  }

  public void setArrival(String arrival) {
    this.arrival = arrival;
  }

  public String getArrivalTimestamp() {
    return arrivalTimestamp;
  }

  public void setArrivalTimestamp(String arrivalTimestamp) {
    this.arrivalTimestamp = arrivalTimestamp;
  }

  public Station getStation() {
    return station;
  }

  public void setStation(Station station) {
    this.station = station;
  }

  public String heureArrivee(){
    String date[] = getArrival().split("T");
    String heure[] = date[1].split("\\+");

    return heure[0];
  }

  @Override
  public String toString() {
    return "Arrivée à " + station + " à " +  heureArrivee();
  }
}
