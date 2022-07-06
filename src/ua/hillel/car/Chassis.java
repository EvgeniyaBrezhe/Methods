package ua.hillel.car;

public class Chassis {
    private Wheel[] wheels;
    private int width;
    private int height;
    private int length;
    private int clearance;

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setClearance(int clearance) {
        this.clearance = clearance;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getClearance() {
        return clearance;
    }
}
