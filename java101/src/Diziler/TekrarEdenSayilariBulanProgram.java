package Diziler;

import java.util.Arrays;

public class TekrarEdenSayilariBulanProgram {
    /*
    // pratik //
    static boolean isFind(int[] arr, int value){
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 2, 9, 10 ,21, 1, 33, 9, 1};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length; j++){
                if (( i != j) && (list[i] == list[j])){
                    if (!isFind(duplicate, list[i])){
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        for (int value: duplicate){
            if (value != 0){
                System.out.println(value);
            }
        }
    }

     */

    // ÖDEV - Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yaz
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 2, 9, 10, 10, 21, 1, 33, 9, 1};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0) { // Sadece çift sayıları kontrol etmek için
                for (int j = i + 1; j < list.length; j++) {
                    if (list[i] == list[j] && !isFind(duplicate, list[i])) {
                        duplicate[startIndex] = list[i];
                        startIndex++;
                        break;
                    }
                }
            }
        }

        System.out.print("Tekrar eden çift sayılar : ");
        for (int value : duplicate) {
            if (value != 0) {
                System.out.println(value);
            }
        }
    }
}
