package driver;

import vehicle.*;

public class Pilot extends AbstractDriver {

    public Pilot(String name) {
        super(name);
    }

    @Override
    public void drive(Vehicle vehicle) {
        vehicle.turnOn();
        fly(vehicle);
    }

    public void fly(Vehicle vehicle) {
        if (vehicle instanceof AirPlane airPlane) {
            System.out.println("\nFlying an Airplane - " + airPlane);
            airPlane.turnOff();
            airPlane.takeOff();
            airPlane.fly();
            airPlane.land();
            airPlane.turnOff();
        } else {
            vehicle.turnOn();
            vehicle.go();
            vehicle.stop();
            vehicle.turnOff();
        }
    }
}
