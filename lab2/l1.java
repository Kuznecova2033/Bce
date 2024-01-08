package lab2;
import java.util.Scanner;
public class l1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.println("Ввод");
        a = in.nextInt();
        b = 3 ;

        if (a % 3 == 0) {
            System.out.println("делится");

        }
        else{
            System.out.println("не делится");
        }
    }

}



