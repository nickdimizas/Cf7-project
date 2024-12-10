package gr.aueb.cf.askiseis;

import java.util.Scanner;

public class SquareRootMethod {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        System.out.println("Please insert an integer");
        num = in.nextInt();
        System.out.printf("%d square = %d\n", num, getSquare(num));
        in.close();
    }

    public static int getSquare(int i) {
        int result = 0;
        result = i * i;
//        result = (int) Math.pow(i , 2);
        return result;
    }
}
