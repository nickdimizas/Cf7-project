package gr.aueb.cf.ch1;

public class DateApp {
    public static void main(String[] args) {
        int day = 5;
        int month = 12;
        int year = 2022;

        System.out.printf("%02d/%02d/%d" ,day, month, year % 100);
    }
}
