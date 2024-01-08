package lab1;
import java.util.Scanner;
public class l2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("введите имя ");
        String name = in.nextLine();

        System.out.printf("введите возраст ");
        int age = in.nextInt();

        System.out.printf("%s %d \n",name,age);
    }
}


