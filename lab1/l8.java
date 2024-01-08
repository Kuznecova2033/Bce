package lab1;
import java.util.Scanner;
public class l8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("введите число ");
        int age1 = in.nextInt();

        System.out.printf("введите второе число ");
        int age = in.nextInt();
        age= age1+age;

        System.out.printf(" Сумма чисел = %d  \n", age);
    }
}


