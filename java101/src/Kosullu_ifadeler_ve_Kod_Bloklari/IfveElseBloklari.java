package Kosullu_ifadeler_ve_Kod_Bloklari;

public class IfveElseBloklari {
    public static void main(String[] args) {
        /*
        int a = 20, b = 20;
        boolean compare = a == b;
        //String str = compare ? "Eşittir" : "Eşit Değildir";
        //System.out.println(str);
        //System.out.println(compare);

        if(compare){
            a = 50;
            System.out.println("A sayısı : " + a);
            System.out.println("Eşittir");
        }else{
            System.out.println("Eşit Değildir");
        }

        System.out.println("Program Bitti");

         */

        int a = 10, b = 20, c = 1;
/*
        if (a < b && a < c) {
            System.out.println("A en küçük sayıdır.");
        }else if ((b < a) && (b < c)) {
            System.out.println("B en küçük sayıdır.");
        }else if ((c < a) && (c < b)) {
            System.out.println("C en küçük sayıdır.");
        }

 */

        if (a < b){
            if (a < c){
                if (a == 10){
                    System.out.println("A sayısı 10'dur");
                }
                System.out.println(" a en küçüktür.");
            }else{
                System.out.println("a sayısı c'den büyüktür.");
            }
        }
    }
}
