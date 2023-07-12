package Siniflar;

class Car {
    // Nitelikler
    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    Car(String model, int speed, String color){
        this.model = model;
        this.speed = speed;
        this.color = color;
        this.type = "Sedan";
        this.speedLimit = 180;
        System.out.println("Parametreli Kurucu metodu oluştu !");
    }

    Car(){
        System.out.println("Boş Kurucu metodu oluştu !");
    }
    void increaseSpeed(int increment) {
        if ((speed + increment) < speedLimit){
            this.speed += increment;
        }
    }

    void decreaseSpeed(int decrease) {
        if (this.speed > 0) {
            this.speed -= decrease;
        }
    }

    void printSpeed() {
        System.out.println(model + " Hızınız : " + this.speed);
    }

    void printInfo(){
        System.out.println("Model \t:" + this.model);
        System.out.println("Color \t:" + this.color);
        System.out.println("Type \t:" + this.type);
        System.out.println("Speed \t:" + this.speed);
    }
}
