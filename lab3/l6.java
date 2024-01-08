package lab3;
import java.util.Scanner;

public class l6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a,b[],c=0;
        a = in.nextInt();
        b = new int [a];
        for (int i=0;c<a;i++) {
            if (i%5==2) {
                b[c]=i;
                c++;
            }
        }
        for (int i=0;i<a;i++) {
            System.out.printf("%d ",b[i]);
        }
    }

}
