package Kosullu_ifadeler_ve_Kod_Bloklari;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
       /*
       // Pratik //
        String userName, password;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız: ");
        userName = inp.nextLine();

        System.out.println("Şifreniz: ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız!");
        }else {
            System.out.println("Bilgileriniz Yanlış!");
        }

        */

        // Odev //
        String dogruKullaniciAdi = "patika";
        String dogruSifre = "java123";
        String girilenKullaniciAdi, girilenSifre;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz: ");
        girilenKullaniciAdi = input.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        girilenSifre = input.nextLine();

        if (girilenKullaniciAdi.equals(dogruKullaniciAdi) && girilenSifre.equals(dogruSifre)) {
            System.out.println("Giriş Yaptınız!");
        } else {
            System.out.println("Bilgileriniz Yanlış!");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır): ");
            String secim = input.nextLine();

            if ("Evet".equalsIgnoreCase(secim)) {
                System.out.print("Yeni şifrenizi giriniz: ");
                String yeniSifre = input.nextLine();

                if (yeniSifre.equals(girilenSifre)) {
                    System.out.println("Şifre oluşturuldu.");
                } else {
                    dogruSifre = yeniSifre;
                    System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        }
    }
}
