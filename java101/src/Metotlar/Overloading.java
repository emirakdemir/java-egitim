/*
Java'da, iki veya daha fazla metot, parametreler açısından farklılık gösteriyorsa
(farklı sayıda parametre, farklı türde parametre veya her ikisi) aynı isime sahip olabilir.
Bu duruma metotlarda "Overloading" yani aşırı yüklenme işlemi denir.
 */

package Metotlar;

public class Overloading {
    static void print(){
        System.out.println("Parametresiz Metot");
    }

    static void print(double a){
        System.out.println("Parametreler double:" +a);
    }

    static int print(int a, int b){
        return a +b;
    }

    static int print(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        print();
        print(12);
        System.out.println(print(2,3));
        System.out.println(print(2,3,4));
    }
}
