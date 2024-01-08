package lab1;
import java.util.Scanner;
public class l1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("введите имя ");
        String name = in.nextLine();

        System.out.printf("введите фамилия ");
        String name1 = in.nextLine();

        System.out.printf("введите отчество ");
        String name2 = in.nextLine();

        System.out.printf("Привет %s %s %s \n",name,name1,name2);


    }
}


