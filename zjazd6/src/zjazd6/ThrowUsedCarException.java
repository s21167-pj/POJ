package zjazd6;

/*
    Author: Marcel Pankanin  
    ThrowUsedCarException class implemented in Java
    Date: 25.05.2020
*/
public class ThrowUsedCarException {

    public static void main(String[] args) throws UsedCarException {
        final int MAXCARS = 7;
        UsedCar[] carArray = new UsedCar[MAXCARS];
        try {
            carArray[0] = new UsedCar("1234", "Ford", 2001, 76, 100);
            carArray[1] = new UsedCar("1234", "Honda", 2016, 32544, 100000);
            //  carArray[2] = new UsedCar("4321", "Toyota", 1990, 48124, 132);
            //    carArray[3] = new UsedCar("3211", "Other", 2016, -666, 132320);
            //    carArray[4] = new UsedCar("9876", "Ford", 2001, 2137, -333);
            carArray[5] = new UsedCar("6782", "Porsche", 2000, 73200, 13233);
            //  carArray[6] = new UsedCar("12345", "Chrysler", 2006, 4234, 5255);

        } catch (UsedCarException e) {
            System.out.println(e.getMessage());
        }


        for (int i = 0; i < carArray.length; i++) {
            if (carArray[i] != null) {
                System.out.println(carArray[i].toString() + "is valid car");
            }

        }
    }
}