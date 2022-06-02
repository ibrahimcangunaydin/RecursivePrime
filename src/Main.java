import java.util.Scanner;

public class Main {

    static boolean RecursivePrime(int a, int b) {

        if (a <= 2) {
            return a == 2 ? true : false;
        } else if (a % b == 0 && a != b) {
            return false;
        } else if (a == b) {
            return true;
        }
        return RecursivePrime(a, b + 1);

    }

    public static void main(String[] args) {

        int number;
        boolean output;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number to check: ");
        number = inp.nextInt();

        output = RecursivePrime(number, 2);

        if (output) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

    }
}
