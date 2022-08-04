package com.carsimulator;
public class FuelGauge {   // Class is fuelGauge
    protected double FUELLEVEL;  // using the data type double for the fuelLevel

    public FuelGauge() {
        FUELLEVEL = 0.0;
    }
    public void setFuelLevel(double fuelLevel) {
        this.FUELLEVEL = fuelLevel;
    }
    public double getFuelLevel() { // Using the data type double to get the Fuel Level
        return FUELLEVEL;  // returning the fuel level
    }
    public void incrementFuelLevel() {    // incrementing the Fuel Level by 1
        if (FUELLEVEL >= 15) {  // using an if statement
            System.out.println(" Fuel Tank is Full"); // printing out that the tank is full
        } else  // using an else statement
            FUELLEVEL += 1;
    }
    public void decrementFuelLevel() {   // decrementing the Fuel Level by 1
        double fraction = 1 + Math.random(); // using Math.random
        if (FUELLEVEL <= 0) {  // using an if statment  if fuel level is less than or equal to zero it
            // will display that the fuel tank is empty
            System.out.println("The Fuel Tank is empty!!"); // prinitng  out that the fuel tank is empty
        } else  // using an else statement
            FUELLEVEL -= fraction;
    }
}
