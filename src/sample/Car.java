package sample;

public class Car extends Vehicles {
    //field variable
    private String carDealership;
    private double mileage;

    //we could create more constructors

    //getter/setters
    public String getCarDealership() {
        return carDealership;
    }

    public void setCarDealership(String carDealership) {
        this.carDealership = carDealership;
    }


    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

}
