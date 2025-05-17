import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            int m = n * i;

            System.out.println(n + " x " + i + " = " + m );
            
        }
    }
    
}
