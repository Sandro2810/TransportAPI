package ch.heg.tb;

import java.util.List;

//reponse de l'API
public class ApiResponse {

  //connections
  private List<Connections> connections;

  //Setters and getters


  //affichage
  public String toString() {

    String trajets = "";

    //parcours toutes les connections si limit > 1
    for (int i=0; i<connections.size(); i++) {
      trajets += " -  " + connections.get(i).toString();
    }

    return trajets;
  }


  //locations
  /*
  private List<Station> stations;

  //Setters and getters

  public String toString() {
    return "ApiResponse [data=" + stations + "]";
  }

   */

}
