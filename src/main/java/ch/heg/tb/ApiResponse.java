package ch.heg.tb;

import java.util.List;

public class ApiResponse {

  //connections
  private List<Connections> connections;

  //Setters and getters


  public String toString() {

    String trajets = "";
    
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
