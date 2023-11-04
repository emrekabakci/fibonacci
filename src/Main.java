import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int c;

        System.out.print("Enter number : ");
        int n = inp.nextInt();

        System.out.print("The fibonacci sequence is: " + a + ", " + b);

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }

    }
}