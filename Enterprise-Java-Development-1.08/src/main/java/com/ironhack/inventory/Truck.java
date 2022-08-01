package com.ironhack.inventory;

public class Truck extends Car{

    private int towingCapacity;

    public Truck(int vinNumber, String make, String model, double mileage, int towingCapacity) {
        super(vinNumber, make, model, mileage);
        setTowingCapacity(towingCapacity);
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
}
