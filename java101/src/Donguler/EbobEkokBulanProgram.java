package Donguler;

import java.util.Scanner;

public class EbobEkokBulanProgram {
    public static void main(String[] args) {


/*
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz : ");
        int n2 = input.nextInt();

 */

/*
        for (int i = 1; i <= (n1*n2); i++){
            if (i % n1 == 0 && i % n2 == 0) {
                System.out.println(i);
                break;
            }
        }

 */

        /*
        int ebob = 1;

        // birim maliyeti = 18 döngü
        for (int i = 1; i <= n1; i++){
            if (n1 % i == 0 && n2 % i == 0){
                System.out.println(i);
                ebob = i;
            }
        }
        System.out.println("=======");

        // birim maliyeti = 14 döngü
        for (int k = n1; k >= 1; k--){
            System.out.println(k);
            if (n1 % k == 0 && n2 % k==0){
                ebob = k;
                System.out.println(ebob);
                break;
            }
        }

         */










        // odev - Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız //

        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz: ");
        int n2 = input.nextInt();

        int ebob = 1;
        int ekok = n1 * n2;

        // EBOB
        int i = 1;
        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        // EKOK
        int k = Math.max(n1, n2);
        while (true) {
            if (k % n1 == 0 && k % n2 == 0) {
                ekok = k;
                break;
            }
            k++;
        }

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
