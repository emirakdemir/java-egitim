package Kosullu_ifadeler_ve_Kod_Bloklari;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        /*
        // Pratik //
        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        }else if (heat >= 5 && heat <= 25){
            if (heat <= 15) {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if (heat >= 10) {
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        } else if (heat > 25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

         */

        // Odev //

        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat >= 5 && heat < 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (heat >= 15 && heat < 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else if (heat >= 25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
