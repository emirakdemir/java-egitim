package Donguler;

import java.util.Scanner;

public class UsluSayiHesaplayanProgram {
    public static void main(String[] args) {
/*
        // pratik //

        int n,k;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        n = input.nextInt();
        System.out.print("Üs olacak sayı: ");
        k = input.nextInt();
        int total = 1;

        int i = 1;
        while (i <= k){
            total *=n;
            i++;
        }
        System.out.println("Cevap: " + total);

 */

        // odev - Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.//

        int n, k;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        n = input.nextInt();
        System.out.print("Üs olacak sayı: ");
        k = input.nextInt();
        int total = 1;

        for (int i = 1; i <= k; i++) {
            total *= n;
        }

        System.out.println("Cevap: " + total);
    }
}
