/*
While döngüsü Java'nın temel yapı taşlarından bir tanesidir.
While terimini yazdıktan sonra yanına bir parantez açılıp kapatılır ve bu parantezler arasına boolean bir değer girilir.
Sonrasında bir süslü parantez açılıp kapatılır ve bunun içine kod bloğu yazılır.
Bu parantezler içindeki değer doğru(true) olduğu sürece döngü dönmeye devam eder ve kod bloğu çalışır.

While döngüsü söz dizimi şu şekildedir ;
while(kosul){
   //kod bloğu
}
Burada belirtilen koşul, boolean bir ifadedir.
Bu koşul true olduğu sürece döngü devam eder. Koşul false olursa döngü sonlanır.
Koşul ifadesi parantez içine yazılır.
Eğer döngüye girecek kod tek satırdan oluşuyorsa blok açmaya gerek yoktur; fakat birden fazla satırdan oluşuyorsa mutlaka blok açılmalıdır.

int i = 1;
while (i <= 5) {
   System.out.print(i + ',');
   i++;
}
Bu Java'da While kullanımı örneğinde, i değeri 5'e eşit ve küçük olduğu sürece döngü çalışmaya devam edecektir ve çıktısı şu şekilde olacaktır ; 1,2,3,4,5,

Döngülerin içeriği olmak zorunda değildir. Bazı durumlarda döngüye girecek kod olmasa bile döngüye girebiliriz. Aşağıdaki örneği inceleyelim:

int left = 100, right = 200;
while (++left < --right);
System.out.println("100 ile 200'ün ortası: " + left);
Bu algoritma, 100 ile 200’ün arasında tam ortada bulunan sayıyı bulmamızı sağlar. Kodu çalıştırdığımızda çıktısı şu şekilde olur:

100 ile 200'ün ortası: 150
Gördüğünüz üzere, içeriği olmasa bile bazı durumlarda döngüler fayda sağlayabilir.

Yani while döngüsü genellikle işlemin kaç kez tekrar edeceği bilinmediği durumda kullanılır. Örneğin: müşterinin hesabına giriş şifresini kaç kez yanlış gireceğini bilemeyiz. Bu nedenle bu tarz durumlarda "while" döngüsü tercih edilir hemen aşağıdaki örnekte olduğu gibi.

Scanner scanner = new Scanner(System.in);
String customerPassword = "12345";
boolean passwordSuccessfull = false;

while(!passwordSuccessfull) {

	System.out.println("Hesap şifrenizi giriniz:");
	String typedPassword = scanner.next();

    if(customerPassword.contentEquals(typedPassword)) {
		passwordSuccessfull = true;
		System.out.println("Sisteme başarılı giriş yaptınız!");
	}
}
Java programla dilinde while döngüleri yapacağımız işin ne zaman biteceğiniz bilmediğimiz durumlarda kullanışlı olabilmektedir.
 */
package Donguler;

import java.util.Scanner;

public class WhileDongusu {
    public static void main(String[] args) {
        /*
        int i = 1;
        int k;
        System.out.println("Program Başladı.");
        while (i <= 5) {
            System.out.println(i);
            i++;

            k = 1;
            while (k <= 10){
                System.out.print(k +",");
                k++;
            }
            System.out.println();

            i++;
        }
        System.out.println("Program Bitti.");

         */

        /*
        int left = 100, right = 200;
        while (++left < --right);

        System.out.println(left);

         */

        int password;
        boolean isPasswordSucces = false;

        Scanner input = new Scanner(System.in);

        while (!isPasswordSucces){
            System.out.print("Şifre Giriniz: ");
            password = input.nextInt();
            if (password == 123){
                System.out.println("Doğru");
                isPasswordSucces = true;
            }else {
                System.out.println("Yanlış");
            }
        }

    }
}
