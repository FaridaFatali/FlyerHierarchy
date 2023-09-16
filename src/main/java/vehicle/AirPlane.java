package vehicle;

public class AirPlane extends AbstractVehicle implements Flyer {

    public AirPlane(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        System.out.println("Airplane has turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Airplane has turned off.");
    }

    @Override
    public void go() {
        System.out.println("Airplane is going.");
    }

    @Override
    public void stop() {
        System.out.println("Airplane has stopped.");
    }

    @Override
    public void takeOff() {
        System.out.println("Airplane is taking off.");
    }

    @Override
    public void fly() {
        System.out.println("Airplane is flying.");
    }

    @Override
    public void land() {
        System.out.println("Airplane is landing.");
    }

    @Override
    public String toString() {
        return "AirPlane " +
                "name: " + name;
    }
}
