package Donguler;

import java.util.Scanner;

public class OdevFibonacciSerisi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisi icin eleman sayisini girin: ");
        int elemanSayisi = scanner.nextInt();

        int sayi1 = 0, sayi2 = 1;

        System.out.print(elemanSayisi + " Elemanli Fibonacci Serisi: ");

        for (int i = 1; i <= elemanSayisi; i++) {
            System.out.print(sayi1 + " ");

            int toplam = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = toplam;
        }

    }
}




/*
Fibonacci serisi icin eleman sayisini girin: 9

9 Elemanli Fibonacci Serisi: 0 1 1 2 3 5 8 13 21
 */