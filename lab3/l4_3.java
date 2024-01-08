package lab3;
import java.util.Scanner;
public class l4_3 {
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

        do {
            System.out.printf("%d ",a);
            a++;
        } while (a<=b);

    }

}
