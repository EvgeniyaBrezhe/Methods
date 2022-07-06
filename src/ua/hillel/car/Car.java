package ua.hillel.car;

public class Car {
    private Chassis chassis;
    private Transmission transmission;
    private Engine engine;
    private String color;
    private String model;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Chassis getChassis(Chassis myChassis) {
        return chassis;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }
}
