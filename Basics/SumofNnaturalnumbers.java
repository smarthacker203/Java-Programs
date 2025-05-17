import java.util.Scanner;

/**
 * SumofNnaturalnumbers
 */
public class SumofNnaturalnumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int sum = 0;

        int i = 1;

        while (i <= n) {

            sum = sum + i;

            i++;

        }

        System.out.println(sum);
    }
}