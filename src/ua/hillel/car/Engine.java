package ua.hillel.car;

public class Engine {
    private String type;
    private int power;
    private int torque;
    private int fuelConsumption;

    public void setType(String type) {
        this.type = type;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    public int getTorque() {
        return torque;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }
}
