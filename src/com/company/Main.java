package com.company;
import java.util.ArrayList;
import java.util.Collections;
public class Main {

    public static void main(String[] args) {

         ArrayList<Car>   cars      = new ArrayList<>();

          Car a = new Car();
          a.setYear(2005);
          a.setBrand("D");
          a.setModel("N");

        Car b = new Car();
        b.setYear(2013);
        b.setBrand("F");
        b.setModel("Q");

        Car c = new Car();
        c.setYear(2008);
        c.setBrand("C");
        c.setModel("P");

        Car d = new Car();
        d.setYear(2000);
        d.setBrand("A");
        d.setModel("M");


          Collections.sort(cars);

    }
}
