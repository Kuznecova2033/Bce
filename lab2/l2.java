package lab2;
import java.util.Scanner;
public class l2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("Ввод");
        a = in.nextInt();


        if (a % 5 == 2 && a % 7 == 1) {
            System.out.println("делится");

        }
        else{
            System.out.println("не делится");
        }
    }


}


