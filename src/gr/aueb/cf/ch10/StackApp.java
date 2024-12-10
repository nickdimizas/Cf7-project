package gr.aueb.cf.ch10;

public class StackApp {
    static int[] myStack = new int[50];
    static int top = -1;              //deixnei sto teleutaio stoixeio

    public static void main(String[] args) {
        int num;

        try {
            push(1);
            push(2);
            push(3);
            num = pop();
            System.out.println("Popped num: " + num);
            printStack();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void push(int num) throws Exception {
        try {
            if (isFull()) throw new Exception("Error. Stack i full");
            myStack[++top] = num;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw e;
        }
    }

    public static int pop() throws Exception {
        try {
            if (isEmpty()) throw new Exception("Error. Stack is Empty");
            return myStack[top--];
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public  static boolean isEmpty() {
        return top == -1;
    }

    public static boolean isFull() {
        return top == myStack.length - 1;
    }

    public static void printStack() throws Exception {
        try {
            if (isEmpty()) {
                throw new Exception("Stack is Empty");
            }
            for (int i = 0; i <= top; i++) {
                System.out.print(myStack[i] + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
