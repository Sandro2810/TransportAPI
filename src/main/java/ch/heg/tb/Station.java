package ch.heg.tb;

import java.util.List;

//Données correspondantes des stations
public class Station {

  private String id;
  private String name;

  //coordonnées d'une station
  private Coordinate coordinate;


  //affiche nom de la station
  @Override
  public String toString() {
    return name;
  }
}
