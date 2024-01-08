package lab3;
import java.util.Scanner;


public class l3_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = 0,i=2, b = 1, c, n;
        System.out.println("Ввод");
        n = in.nextInt();
        System.out.printf("%d ",b);

        do {

            c = a + b;
            a = b;
            b = c;
            System.out.printf("%d ",c);
            i++;

        }while (i<=n);

    }

}



