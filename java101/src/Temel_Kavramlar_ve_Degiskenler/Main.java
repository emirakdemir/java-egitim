package Temel_Kavramlar_ve_Degiskenler;

import java.util.Scanner;
//kullanıcıdan veri almak icin kullandık//

public class Main {
    public static void main(String[] args) {

        // Değişkenler ve Veri Tipleri //
        int numberOne,numberTwo=2,numberThree;
        numberOne = 1;
        numberThree = numberOne + numberTwo;
        System.out.println(numberOne);
        System.out.println(numberTwo);
        System.out.print(numberThree);

        int kisaKenar = 10, uzunKenar = 20;
        int alan = kisaKenar*uzunKenar;
        int cevre = 2*(kisaKenar*uzunKenar);
        System.out.println(alan);
        System.out.println(cevre);


        // Byte, Short, Int ve Long Veri Tipleri //
        byte vByte = 100;
        System.out.println(vByte);
        short vShort = 1000;
        System.out.println(vShort);
        int vInt = 10000;
        System.out.println(vInt);
        long vLong = 10000000;
        System.out.println(vLong);


        // Float ve Double Veri Tipleri //
        float vFloat = 1;
        System.out.println(vFloat);
        float vFloatf = 3.14f; //ondaklı sayı veri tiplerine tam sayı yazarsak hata almayız, otomatik ondaklıklı sayıya çeviriyor ama tam sayı olan veri tipine ondalıklı sayı yazarsak kabul etmeyecektir.
        System.out.println(vFloatf);
        double vDouble = 3.14;
        System.out.println(vDouble);
        double vDouble0 = 3; //3.0
        System.out.println(vDouble0);


        // Char ve Booelean Veri Tipleri //
        char vChar = 'b';
        System.out.println(vChar);
        char v2Char = 98; //ascii tablosunda b'ye denk geliyor.
        System.out.println(v2Char);
        char c1 = 'J';
        char c2 = 'A';
        char c3 = 'V';
        char c4 = 'A';
        System.out.println("" +c1+c2+c3+c4); // " koymazsak sayı olarak toplar.
        boolean dogru = true;
        boolean yanlis = false;
        System.out.println(dogru);
        System.out.println(yanlis);


        // String Veri Tipi //
        String vStr = "Java101 Patikasi";
        System.out.println(vStr);


        // Temel Operatörler //
        int a = 5, b = 2;
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b);

        int c = 7 ;
        int d = c;
        System.out.println(d);

        int e = 8, f = 1;
        // f = f + e;
        // f = f - e;
        // f = f * e;
        // f = f / e;
        // f = f % e;
        f += e;
        System.out.println(f);
        boolean sonuc = (1 == 5);
        System.out.println(sonuc);

        int g = 5, h = 2;
        boolean sonuc1 = g == h;
        System.out.println(sonuc1);
        boolean sonuc2 = g != h;
        System.out.println(sonuc2);

        int j = 5, k = 6, l = 5;
        boolean kosul1 = j == l;
        System.out.println(kosul1);
        boolean kosul2 = j >= k;
        System.out.println(kosul2);
        boolean sonucB = kosul1 && kosul2;
        System.out.println(sonucB);
        boolean sonucC = kosul1 || kosul2;
        System.out.println(sonucC);
        System.out.println(!sonucC);
        boolean sonucD = !((j == l) || (j >= k));
        System.out.println(sonucD);

        String strA = sonucB ? "Doğru" : "Değil";
        System.out.println(strA);
        int result = sonuc ? 1 : 0;
        System.out.println(result);


        // Kullanıcıdan Veri Alma //
        int m;
        Scanner input = new Scanner(System.in); //scanner sınıfını kullanabilmek icin.

        //System.out.println("A Sayısını Giriniz: ");
        //m = input.nextInt(); //neden nextInt? cünkü veri tipi int.
        //System.out.println(m); //bizim deger girmemizi bekliyor.

        //System.out.println("Bir Değer Giriniz: ");
        //double n = input.nextDouble();
        //System.out.println(n);

        System.out.println("Bir Str Giriniz: ");
        String strX = input.nextLine();
        System.out.println(strX);


    }
}