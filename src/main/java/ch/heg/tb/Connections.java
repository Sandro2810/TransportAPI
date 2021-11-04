package ch.heg.tb;

import java.util.List;

public class Connections {
  private Depart from;
  private Arrivee to;

  @Override
  public String toString() {
    return from +
        " - " + to + "\n";
  }
}
