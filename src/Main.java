import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //New scanner created.
        Scanner inp = new Scanner(System.in);

        //Variables defined.
        int a = 0;
        int b = 1;
        int c;

        //Data retrieved from user.
        System.out.print("Enter number : ");
        int n = inp.nextInt();

        //Fibonacci sequence is always starting with 0 and 1 that's why we printed 0 and 1 first.
        System.out.print("The fibonacci sequence is: " + a + ", " + b);

        //Continuation of the fibonacci sequence printed.
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }

    }
}