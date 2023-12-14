package com.company;

public abstract class Vehicle {
    private boolean isActive;
    public abstract void drive();

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
