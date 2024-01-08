package lab3;
import java.util.Scanner;
public class l3_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = 0, b = 1, c, n;
        System.out.println("Ввод");
        n = in.nextInt();
        System.out.printf("%d ",b);
        for(int i=2;i<=n;i++){
            c = a + b;
            a = b;
            b = c;
            System.out.printf("%d ",c);

        }

    }

}


