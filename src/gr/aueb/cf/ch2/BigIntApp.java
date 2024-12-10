package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * BigInteger class demo.
 */
public class BigIntApp {
    public static void main(String[] args) {
        //Declarations and Initializations
        BigInteger bigNum1 = new BigInteger("123456789987654321");
        BigInteger bigNum2 = new BigInteger("23456789098765432");
        BigInteger result;

        //Commands
        result = bigNum1.add(bigNum2);

        //Printing the result
        System.out.printf("%,d", result);

    }
}
