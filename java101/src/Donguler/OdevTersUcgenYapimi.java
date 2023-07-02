/*
Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

Örnek
Basamak Sayısı : 10
 */

package Donguler;

import java.util.Scanner;

public class OdevTersUcgenYapimi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısı: ");

        int basamak = input.nextInt();

        for (int i = basamak; i >= 1; i--) {
            for (int j = 1; j <= basamak - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
    *******************
     *****************
      ***************
       *************
        ***********
         *********
          *******
           *****
            ***
             *
 */
