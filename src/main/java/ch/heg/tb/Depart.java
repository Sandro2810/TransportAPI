package ch.heg.tb;

import java.util.List;

//données de depart
public class Depart {

  private String departure;
  private String departureTimestamp;

  //depart d'une station
  private Station station;

  //getter & setter
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

  //format heure de depart
  public String heuredepart(){
    String date[] = getDeparture().split("T");
    String heure[] = date[1].split("\\+");

    return heure[0];
  }

  //affichage
  @Override
  public String toString() {
    return "Départ à " +  heuredepart() + " depuis " + station;
  }
}
