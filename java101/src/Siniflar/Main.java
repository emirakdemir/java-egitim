/*

// NESNE OLUŞTURMA VE SINIF METOTLARI //

package Siniflar;


public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.model = "Audi";
        audi.speed = 10;
        audi.increaseSpeed(20);
        audi.decreaseSpeed(10);
        audi.printSpeed();

        Car bmw = new Car();
        bmw.model = "BMW";
        bmw.speed = 20;
        bmw.increaseSpeed(20);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(60);
        bmw.increaseSpeed(100);
        bmw.printSpeed();

        Car mercedes = new Car();
        mercedes.model = "Mercedes";
        mercedes.speed = 30;
    }
}

 */


// CONSTRUCTOR (YAPICI) METOT KULLANIMI //

package Siniflar;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi", 10, "Blue");
       // audi.printInfo();
        /*
        Model 	:Audi
        Color 	:Blue
        Type 	:Sedan
        Speed 	:10
         */


        Car bmw = new Car();
        bmw.model = "BMW";
        bmw.speed = 20;


        Car mercedes = new Car();
        mercedes.model = "Mercedes";
        mercedes.speed = 30;

    }
}

