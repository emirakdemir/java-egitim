package Kosullu_ifadeler_ve_Kod_Bloklari;

import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");

        int dogumYili = input.nextInt();
        input.close();

        String[] cinZodyagi = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz",
                "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};

        int indeks = dogumYili % 12;
        String zodyakBurcu = cinZodyagi[indeks];

        System.out.println("Çin Zodyağı Burcunuz: " + zodyakBurcu);
    }
}
