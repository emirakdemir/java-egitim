/*
Dairenin Alanını ve Çevresini Hesaplayan Program

Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev

Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
*/

package Temel_Kavramlar_ve_Degiskenler;
import  java.util.Scanner;

public class PratikOdevDaireninAlaniniveCevresiniHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını girin: ");
        double yaricap = scanner.nextDouble();

        double alan = 3.14 * yaricap * yaricap;
        double cevre = 2 * 3.14 * yaricap;

        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);

        System.out.print("Merkez açısının ölçüsünü girin: ");
        double aci = scanner.nextDouble();

        double dilimAlan = (3.14 * yaricap * yaricap * aci) / 360;
        System.out.println("Daire diliminin alanı: " + dilimAlan);
    }
}
