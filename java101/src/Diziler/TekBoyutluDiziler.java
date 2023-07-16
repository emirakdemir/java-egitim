package Diziler;

public class TekBoyutluDiziler {
    public static void main(String[] args) {

        /*
        double[] list = new double[5];
        list[0] = 10;
        list[1] = 20;
        list[2] = 30;
        System.out.println(list[0]);

         */


        String[] days = {"Pazartesi","Salı","Çarşamba","Perşembe","Cuma"};
        String[] weekendDays = new String[]{"Cumartesi","Pazar"};
        System.out.println(weekendDays[0]);
        System.out.println(days.length);

        for (int i = 0; i <= (days.length -1); i++){
            System.out.println(days[i]);
        }
    }
}
