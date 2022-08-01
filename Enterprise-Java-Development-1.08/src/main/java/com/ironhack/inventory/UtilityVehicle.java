package com.ironhack.inventory;

public class UtilityVehicle extends Car{

    private boolean fourWheelDriver;


    public UtilityVehicle(int vinNumber, String make, String model, double mileage, boolean fourWheelDriver, int towingCapacity) {
        super(vinNumber, make, model, mileage);
        setFourWheelDriver(fourWheelDriver);

    }

    public boolean isFourWheelDriver() {
        return fourWheelDriver;
    }

    public void setFourWheelDriver(boolean fourWheelDriver) {
        this.fourWheelDriver = fourWheelDriver;
    }

}
