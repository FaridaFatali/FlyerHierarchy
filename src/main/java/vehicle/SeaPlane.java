package vehicle;

public class SeaPlane extends AirPlane implements Floatable {
    public SeaPlane(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        System.out.println("SeaPlane has been turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("SeaPlane has been turned off.");
    }

    @Override
    public void go() {
        System.out.println("SeaPlane is going.");
    }

    @Override
    public void stop() {
        System.out.println("SeaPlane has stopped.");
    }

    @Override
    public void takeOff() {
        System.out.println("SeaPlane is taking off.");
    }

    @Override
    public void fly() {
        System.out.println("seaPlane is flying.");
    }

    @Override
    public void land() {
        System.out.println("SeaPlane is landing.");
    }

    @Override
    public void floatNow() {
        System.out.println("SeaPlane is floating now.");
    }

    @Override
    public void park() {
        System.out.println("SeaPlane is parking.");
    }

    @Override
    public String toString() {
        return "SeaPlane " +
                "name: " + name;
    }
}