package Donguler;

public class ContinueBreakKomutlari {
    public static void main(String[] args) {
        /*
        for (int i = 1; i<=10; i++){
            if (i==5){
                System.out.println("i değeri 5'tir");
                break;
            }
            System.out.println(i);
        }

         */

        /*
        for (int i =1; i<=10; i++){
            if (i == 5){
                continue;
            }
            System.out.println(i);
        }

         */

        int i = 1;
        while (i <= 10){
            i++;
            if (i%2   == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
