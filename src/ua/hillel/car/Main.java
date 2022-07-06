package ua.hillel.car;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Wheel[] myWheels = new Wheel[4];
        for (int i = 0; i < myWheels.length; i++) {
            myWheels[i] = new Wheel();
            myWheels[i].setMaterial("aluminium");
            myWheels[i].setSize(26);
        }

        Chassis myChassis = new Chassis();
        myChassis.setWheels(myWheels);
        myChassis.setWidth(10);
        myChassis.setHeight(15);
        myChassis.setLength(30);
        myChassis.setClearance(25);

        Transmission myTransmission = new Transmission();
        myTransmission.setType("automatic");

        Engine myEngine = new Engine();
        myEngine.setFuelConsumption(8);
        myEngine.setPower(100);
        myEngine.setTorque(150);
        myEngine.setType("externals combustion");

        Car myCar = new Car();
        myCar.setColor("white");
        myCar.setModel("volvo");
        myCar.setChassis(myChassis);
        myCar.setTransmission(myTransmission);
        myCar.setEngine(myEngine);

        System.out.println("My car - " + myCar.getColor() + " " + myCar.getModel() + "," + " consist of:");
        System.out.println("Engine:" + "\n" +
                "type: " + myEngine.getType() + "\n" +
                "power: " + myEngine.getPower() + "\n" +
                "torque: " + myEngine.getTorque() + "\n" +
                "fuel consumption: " + myEngine.getFuelConsumption());
        System.out.println("Transmission: " + myTransmission.getType());
        System.out.println("Chassis: " + "\n" +
                "wigth: " + myChassis.getWidth() + "\n" +
                "height: " + myChassis.getHeight() + "\n" +
                "length: " + myChassis.getLength() + "\n" +
                "clearance: " + myChassis.getClearance());
        System.out.println("Wheels: ");
        for (int i = 0; i < myWheels.length; i++) {
            System.out.println("Wheel #" + i + ": " +
                    "material: " + myWheels[i].getMaterial() + ", " +
                    "size: " + myWheels[i].getSize());
        }
    }
}