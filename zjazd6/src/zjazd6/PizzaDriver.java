package zjazd6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
    Author: Marcel Pankanin  
    PizzaDriver class implemented in Java
    Date: 25.05.2020
*/
public class PizzaDriver {
    public static void main(String[] args) {
        Pizza[] pizzaSpam = new Pizza[40];
        pizzaSpam[0] = new PizzaDeluxe(100, "Margherita", 21, 40, true, "Sauce");
        pizzaSpam[1] = new PizzaDeluxe(200, "Marinara", 34, 30, false, "Ham");
        pizzaSpam[2] = new PizzaDeluxe(300, "Quattro Stagioni", 15, 40, true, "Shrimp");
        pizzaSpam[3] = new PizzaDeluxe(400, "Carbonara", 19);
        pizzaSpam[4] = new PizzaDeluxe(500, "Frutti di Mare", 28);
        pizzaSpam[5] = new PizzaDeluxe(600, "Quattro Formaggi", 41);
        pizzaSpam[6] = new PizzaDeluxe(700, "Crudo", 22);
        pizzaSpam[7] = new PizzaDeluxe(800, "Napoletana", 31);
        pizzaSpam[8] = new PizzaDeluxe(900, "Pugliese", 45, 30, true, "Salami");
        pizzaSpam[9] = new PizzaDeluxe(1000, "Montanara", 12, 30, false, "Olives");
        pizzaSpam[10] = new PizzaDeluxe(1100, "Emiliana", 32, 40, true, "Ham");
        pizzaSpam[11] = new PizzaDeluxe(1200, "Romana", 48, 40, false, "Pepperoni");
        pizzaSpam[12] = new PizzaDeluxe(1300, "Schiacciata", 39);
        pizzaSpam[13] = new PizzaDeluxe(1400, "Prosciutto e Funghi", 20);
        pizzaSpam[14] = new PizzaSpecial(1500, "Braccio di Ferro", 41, 30, false, "Tuna");
        pizzaSpam[15] = new PizzaSpecial(1600, "Sarda", 33, 40, true, "Egg");
        pizzaSpam[16] = new PizzaSpecial(1700, "Tonno", 12, 30, true, "Sauce");
        pizzaSpam[17] = new PizzaSpecial(1800, "Valtellina", 10);
        pizzaSpam[18] = new PizzaSpecial(1900, "Gorgonzola", 34, 40, false, "Ham");
        pizzaSpam[19] = new PizzaSpecial(2000, "Calzone", 25);
        pizzaSpam[20] = new PizzaSpecial(2100, "Pizza al Pesto", 22);
        pizzaSpam[21] = new PizzaSpecial(2000, "Mediterranea", 54);
        pizzaSpam[22] = new PizzaSpecial(1900, "Ortolana", 23);
        pizzaSpam[23] = new PizzaSpecial(1800, "Diavola", 45, 30, false, "Shrimp");
        pizzaSpam[24] = new PizzaSpecial(1700, "Contadina", 21, 40, false, "Ham");
        pizzaSpam[25] = new PizzaSpecial(1600, "Parmigiana", 33, 30, true, "Ham");
        pizzaSpam[26] = new PizzaSpecial(1500, "Capricciosa", 23, 40, false, "Olives");
        pizzaSpam[27] = new PizzaSpecial(1400, "Ricotta e Spinaci", 45);
        pizzaSpam[28] = new PizzaWoogy(1300, "Mare e Monti", 52, 30, false, "Sauce");
        pizzaSpam[29] = new PizzaWoogy(1200, "Padana", 19, 40, true, "Ham");
        pizzaSpam[30] = new PizzaWoogy(1100, "Tedesca", 26, 40, true, "Olvies");
        pizzaSpam[31] = new PizzaWoogy(1000, "Tirolese", 23, 30, true, "Sauce");
        pizzaSpam[32] = new PizzaWoogy(900, "Boscaiola", 24, 40, false, "Sauce");
        pizzaSpam[33] = new PizzaWoogy(800, "Campagnola", 41);
        pizzaSpam[34] = new PizzaWoogy(700, "Vegetariana", 34);
        pizzaSpam[35] = new PizzaWoogy(600, "Bufalina", 32);
        pizzaSpam[36] = new PizzaWoogy(500, "Bolonasge", 21);
        pizzaSpam[37] = new PizzaWoogy(400, "Sweet", 46, 30, false, "Ham");
        pizzaSpam[38] = new PizzaWoogy(300, "Potato", 16, 40, true, "Olives");
        pizzaSpam[39] = new PizzaWoogy(200, "Basic", 18, 30, true, "Something");

        Arrays.sort(pizzaSpam);
        for (int i = 0; i < pizzaSpam.length; i++) {
            System.out.println(pizzaSpam[i]);
        }
    }

}

