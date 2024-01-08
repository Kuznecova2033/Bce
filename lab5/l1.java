package lab5;
import java.util.Scanner;
public class l1 {
    private char a;

    public void set(char newValue) {
        a = newValue;
    }

    public int getCode() {
        int code = (int) a;
        return code;
    }

    public void description() {
        System.out.printf("Character: %c (code: %d)", a, getCode());
    }

    public static void main(String[] args) {
        l1 one = new l1();
        one.set('a');
        one.description();
    }

}





