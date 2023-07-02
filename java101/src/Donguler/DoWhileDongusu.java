/*
Do-while döngüsünün çalışma mantığı while döngüsü ile aynıdır ,
fakat while döngüsünde parantez içerisindeki koşul sağlandığı sürece kod bloğu çalışacaktır.
Ama Do-while döngüsünde durum false olsa bile döngü en az bir kere çalışacaktır.
Bu tür durumlar için Do-while kullanılır.
 */

package Donguler;

import java.util.Scanner;

public class DoWhileDongusu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pass;
        boolean askPassword = true;

        do {
            System.out.print("Şifre Giriniz: ");
            pass = input.nextInt();
            if (pass == 123){
                System.out.println("Doğru");
            }else {
                System.out.println("Yanlış");
            }
        } while (askPassword);
    }
}
