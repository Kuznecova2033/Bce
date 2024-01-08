package lab2;
import java.util.Scanner;
public class l3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("Ввод");
        a = in.nextInt();
        a = a / 4;

        if ( a < 10) {
            System.out.println("+");

        }
        else{
            System.out.println("-");
        }
    }


}


