package lab2;
import java.util.Scanner;
public class l5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("Ввод");
        a = in.nextInt();
        a = (a / 1000) % 10;
        System.out.printf("%d \n",a);

    }


}
