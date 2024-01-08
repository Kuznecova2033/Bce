package lab3;
import java.util.Scanner;
public class l7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char [] a = new char []{'a','c','e','g','i','k','m','o','q','s'};

        int b ;
        b = in.nextInt();

        for(int i=0; i<b; i++) {
            System.out.printf("%c ",a[i]);

        }
        System.out.printf("\n");
        b--;
        for(int i=b; i>=0 ; i--){
            System.out.printf("%c ",a[i]);
        }
    }

}
