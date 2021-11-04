package ch.heg.tb;

import java.util.List;

//donnees de base de la requette
//connections regroupe depart et arrivee
public class Connections {
  private Depart from;
  private Arrivee to;


  //Temps de trajet
  public String tempsTrajet(){
    //calcul du timestamp (secondes)
    int tempsTrajet = Integer.valueOf(this.to.getArrivalTimestamp()) - Integer.valueOf(this.from.getDepartureTimestamp());

    return String.valueOf(tempsTrajet/60);
  }

  @Override
  public String toString() {
    return from +
        " - " + to + " Temps de trajet : "+ tempsTrajet() + " min " +"\n";
  }
}
