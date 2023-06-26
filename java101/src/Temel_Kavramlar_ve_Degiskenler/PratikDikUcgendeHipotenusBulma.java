package Temel_Kavramlar_ve_Degiskenler;

import java.util.Scanner;

public class PratikDikUcgendeHipotenusBulma {
    public static void main(String[] args) {

        // Değişkenlerimizi Oluşturalım.
        int a, b;
        double c;

        // Kullanıcıdan verilerimizi alalım.
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz: ");
        a = girdi.nextInt();
        System.out.print("2. Kenarı Giriniz: ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs: " +c);
    }

}
