package Kosullu_ifadeler_ve_Kod_Bloklari;

public class SwitchCaseYapisi {
    public static void main(String[] args) {
        int day = 4;

        switch (day){
            case 1:
                System.out.println("Bugün Pazartesi");
                System.out.println("Program Bitti");
                break;
            case 2:
                System.out.println("Bugün Salı");
                break;
            case 3:
                System.out.println("Bugün Çarşamba");
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız");
        }
    }
}
