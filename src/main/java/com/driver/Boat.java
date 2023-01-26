package com.driver;

public class Boat implements WaterVehicle{
    private String name;
    private int capacity;

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }

    @Override
    public String getVehicleName() {
        return name;
    }
}
