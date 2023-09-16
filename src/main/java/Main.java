/**
 * @author Farida Fatali
 * Practice for my Udemy lesson "Object-Oriented and Functional Programming in Java"
 * Flyer Hierarchy using Interface, Abstraction and Inheritance in Java
 */

import driver.*;
import vehicle.*;

public class Main {
    public static void main(String[] args) {
        SeaPlane seaPlane = new SeaPlane('"' + "Enrique Brown's SeaPlane" + '"');

        Pilot pilot = new Pilot("Enrique Brown");
        pilot.drive(seaPlane);

        Hangar hangar = new Hangar("Special Hangar");
        hangar.store(seaPlane);

        Harbour harbour = new Harbour("Las-Vegas Harbour");
        harbour.enter(seaPlane);

        UniversalDriver universalDriver = new UniversalDriver("Steven Richard");
        universalDriver.drive(seaPlane);

        System.out.println("-------------------------------------------------------");

        Boat boat = new Boat('"' + "Tom Verdun's Boat" + '"');

        Pilot pilot1 = new Pilot("Tom Verdun");
        pilot1.drive(boat);

        Harbour harbour1 = new Harbour("Dominic Harbour");
        harbour1.enter(boat);

        UniversalDriver universalDriver1 = new UniversalDriver("Rodger Mandala");
        universalDriver1.drive(boat);

    }
}