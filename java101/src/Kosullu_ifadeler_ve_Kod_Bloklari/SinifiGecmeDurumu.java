package Kosullu_ifadeler_ve_Kod_Bloklari;

import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
       /*
        // Pratik //

        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz. ");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        double avarage = (mat + fizik + turkce + kimya + muzik) / 5;
        if (avarage <= 55){
            System.out.println("Sınıfta Kaldınız, seneye tekrar görüşmek üzere! :)");
        }else{
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        }
        System.out.println("Ortalamanız: " + avarage);

        */

        // Odev //

        int mat, fizik, turkce, kimya, muzik;
        int notSayisi = 0;
        int toplamNot = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100) {
            toplamNot += mat;
            notSayisi++;
        }

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplamNot += turkce;
            notSayisi++;
        }

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            toplamNot += fizik;
            notSayisi++;
        }

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplamNot += kimya;
            notSayisi++;
        }

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplamNot += muzik;
            notSayisi++;
        }

        double ortalama = (double) toplamNot / notSayisi;
        if (notSayisi > 0) {
            if (ortalama <= 55) {
                System.out.println("Sınıfta Kaldınız, seneye tekrar görüşmek üzere! :)");
            } else {
                System.out.println("Tebrikler, sınıfı geçtiniz!");
            }
            System.out.println("Ortalamanız: " + ortalama);
        } else {
            System.out.println("Geçerli not girilmediği için ortalama hesaplanamadı.");
        }
    }
}
