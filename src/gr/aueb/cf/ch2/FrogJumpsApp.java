package gr.aueb.cf.ch2;

/**
 * Calculates how many jumps a frog needs
 * to do to reach from X to Y (jump distance=D).
 * X = 10
 * Y = 85
 * D = 30
 *
 * Jumps = 3
 *
 */
public class FrogJumpsApp {
    public static void main(String[] args) {
        int target = 85;
        int start = 10;
        int hop = 30;
        int jumps = 0;

        //Calculates jumps
        jumps = (int) Math.ceil((target - start) / (double) hop);

        System.out.println("Jumps: " + jumps);
    }
}
