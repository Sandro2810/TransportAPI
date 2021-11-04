package ch.heg.tb;

import java.util.List;

public class Depart {

  private String departure;
  private String departureTimestamp;

  private Station station;

  public String getDeparture() {
    return departure;
  }

  public void setDeparture(String departure) {
    this.departure = departure;
  }

  public String getDepartureTimestamp() {
    return departureTimestamp;
  }

  public void setDepartureTimestamp(String departureTimestamp) {
    this.departureTimestamp = departureTimestamp;
  }

  public Station getStation() {
    return station;
  }

  public void setStation(Station station) {
    this.station = station;
  }

  public String heuredepart(){
    String date[] = getDeparture().split("T");
    String heure[] = date[1].split("\\+");

    return heure[0];
  }

  @Override
  public String toString() {
    return "Départ à " +  heuredepart() + " depuis " + station;
  }
}
