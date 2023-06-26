/*
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.


Üçgenin Çevresi= 2𝑢
𝑢 = (a+b+c) / 2
Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

*/

package Temel_Kavramlar_ve_Degiskenler;

import java.util.Scanner;

public class PratikOdevUcgenAlaniHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üçgenin birinci kenar uzunluğunu girin: ");
        double a = scanner.nextDouble();

        System.out.print("Üçgenin ikinci kenar uzunluğunu girin: ");
        double b = scanner.nextDouble();

        System.out.print("Üçgenin üçüncü kenar uzunluğunu girin: ");
        double c = scanner.nextDouble();

        double u = (a + b + c) / 2;

        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin alanı: " + alan);
    }
}
