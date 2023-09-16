package driver;

import vehicle.AirPlane;

public class Hangar {
    protected String name;

    public Hangar(String name) {
        this.name = name;
    }

    public void store(AirPlane airPlane) {
        System.out.println("\nStoring the airplane - " + airPlane + " in " + '"' + name + '"');
        airPlane.go();
        airPlane.takeOff();
        airPlane.land();
    }

    @Override
    public String toString() {
        return "Hangar " +
                "name: " + name;
    }
}
