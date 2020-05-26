package zjazd6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Author: Marcel Pankanin  
    UsedCar class implemented in Java
    Date: 25.05.2020
*/
public class UsedCar {
    private int year;
    private double price;
    private double mileage;
    private String make;
    private String vin;

    public UsedCar(String vin, String make, int year, double mileage, double price) throws UsedCarException {
        List<String> makeList = Arrays.asList("Honda", "Toyota", "Chrysler", "Other", "Ford");

        if (vin.length() != 4) {
            throw new UsedCarException("VIN is invalid");
        }
        if (!makeList.contains(make)) {
            throw new UsedCarException("Make is invalid");
        }
        if (year < 1997 || year > 2017) {
            throw new UsedCarException("Year is invalid");
        }
        if (mileage < 0) {
            throw new UsedCarException("Mileage is invalid");
        }
        if (price < 0) {
            throw new UsedCarException("Price is invalid");
        }
        this.vin = vin;
        this.make = make;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "UsedCar[" +
                "year=" + year +
                ", price=" + price +
                ", mileage=" + mileage +
                ", make='" + make + '\'' +
                ", vin=" + vin +
                ']';
    }
}
