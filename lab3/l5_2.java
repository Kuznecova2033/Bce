package lab3;
import java.util.Scanner;
public class l5_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a,b=1,c=0,d=0;
        System.out.println("Ввод");
        a = in.nextInt();


        while(a!=d) {



            if (b%5==2 && b%3==1) {
                c += b;
                d++;
                System.out.printf("%d ",b);
            }
            b++;
        }
        System.out.printf("\n%d ",c);

    }

}
