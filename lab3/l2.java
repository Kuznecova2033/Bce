package lab3;
import java.util.Scanner;
public class l2 {
    public static void main(String[] args) {
        String a = new String();
        Scanner in = new Scanner(System.in);
        System.out.println("Ввод");
        a = in.nextLine();
        switch(a) {
            case "пн":
                System.out.println("1");
                break;
            case "вт":
                System.out.println("2");
                break;
            case "ср":
                System.out.println("3");
                break;
            case "чт":
                System.out.println("4");
                break;
            case "пт":
                System.out.println("5");
                break;
            case "сб":
                System.out.println("6");
                break;
            case "вс":
                System.out.println("7");
                break;
            default:
                System.out.println("ошибка");

        }

    }

}
