/*
Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.

Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir. Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir). Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik bir matris olur. Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.

Örneğin aşağıdaki 2x3’lik A matrisinin transpozu (devriği), 2x3’lük bir A^T matrisidir.





Senaryo
Matris :
2    3    4
5    6    4
Transpoze :
2    5
3    6
4    4


Matris :
1    2    3
4    5    6
Transpoze :
1    4
2    5
3    6
 */
package Diziler;

import java.util.Scanner;

public class OdevMatrisTranspozunuBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrisin satır sayısını girin: ");
        int satirSayisi = scanner.nextInt();

        System.out.print("Matrisin sütun sayısını girin: ");
        int sutunSayisi = scanner.nextInt();

        int[][] matris = new int[satirSayisi][sutunSayisi];

        System.out.println("Matrisin elemanlarını girin:");
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                System.out.print("[" + (i + 1) + "][" + (j + 1) + "]: ");
                matris[i][j] = scanner.nextInt();
            }
        }

        int[][] transpoz = new int[sutunSayisi][satirSayisi];

        // Transpozunu alma
        for (int i = 0; i < sutunSayisi; i++) {
            for (int j = 0; j < satirSayisi; j++) {
                transpoz[i][j] = matris[j][i];
            }
        }

        System.out.println("Transpoze:");
        for (int i = 0; i < sutunSayisi; i++) {
            for (int j = 0; j < satirSayisi; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
