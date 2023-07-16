package Diziler;

public class ForEach {
    public static void main(String[] args) {
        String[] cars = {"BMW","Mercedes","Audi"};
        for (String str : cars){
            System.out.println(str);
        }

        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        for(int i = 0; i < matris.length; i++){
            for (int k = 0; k < matris[i].length; k++){
                System.out.println(matris[i][k]);
            }

        for (int[] row : matris){
            for (int col: row){
                System.out.println(col + " ");
            };
            System.out.println();
        }

        }
    }
}
