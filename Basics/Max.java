public class Max {
    public static void main(String[] args) {
        int a = 45;
        int b = 67;
        int c = 24;

        if( a >= b && a >= c){
            System.out.println(a);
        }
        else if ( b >= a && b >= c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}
