package lab3;
import java.util.Scanner;
public class l4_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.println("Ввод");
        a = in.nextInt();
        b = in.nextInt();
        if( b < a ) {
            c = a;
            a = b;
            b = c;
        }

        for(; a<=b ; a++ ) {
            System.out.printf("%d ",a);
        }

    }

}
