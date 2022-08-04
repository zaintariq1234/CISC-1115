package com.carsimulator;
public class Cars {   // the public class is cars
    private static final int CAR_FUEL_LIMIT = 15;
    private int speed;  // using the data type int for the speed
    private String make;  // using the data type String for the Make
    private int yearModel; // Using the data type int for the yearModel

    private Odometer odometer; // odometer
    private FuelGauge fuelGauge;   //FuelGauge

    public Cars( Odometer odometer, String make, FuelGauge fuelGauge,int yearModel) {
        // Constructors accepting model,make, FuelGauge and odometer
        speed = 0;
        this.make = make;
        this.yearModel = yearModel;

        this.odometer = odometer;
        this.fuelGauge = fuelGauge;
    }



    public int getSpeed() {  // using the data type int to getspeed
        return speed;  // returning speed
    }

    public String getMake() {
        return make;  // returning make
    }

    public int getYearModel() {   // using the data type int to getYearModel
        return yearModel;   // returning year model
    }


    public void accelerate() { // acceleration
        this.speed += 5;
    }



    public void fillTank(){
        //Fill up the car
        System.out.println("Filling cars Fuel Tank.");
        for(int fuelIndex = 1; fuelIndex <= CAR_FUEL_LIMIT; fuelIndex++)
        {
            this.getFuelGauge().incrementFuelLevel();
            System.out.println(this.getFuelGauge().getFuelLevel());
        }
    }


    public void brake() {   // breaking
        if (this.speed <= 0) {    // using an if statement
            System.out.println("The Car Has  Stopped."); // printing out that the car has stopped
        } else {   // using an else statement
            this.speed -= 5;
        }
    }

    public FuelGauge getFuelGauge() {
        return fuelGauge;   // returns FuelGauge
    }

    public Odometer getOdometer() {
        return odometer; // returns odometer
    }
}



