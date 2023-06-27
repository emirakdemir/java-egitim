package Kosullu_ifadeler_ve_Kod_Bloklari;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");

        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " bir artık yıldır!");
        } else {
            System.out.println(year + " bir artık yıl değildir!");
        }
        scanner.close();
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                return true;
            }
        }
        return false;
    }
}
