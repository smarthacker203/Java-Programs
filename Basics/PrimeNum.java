import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 2; i < n-1; i++) {

            if(n%i==0){
                System.out.println("number is not prime");
            }else {
                System.out.println("number is prime");
            }
            
        }
    }
    
}
