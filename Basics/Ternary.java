import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();
        String report = (marks >= 33)? "pass" : "fail";

        System.out.println(report);
    }
    
}
