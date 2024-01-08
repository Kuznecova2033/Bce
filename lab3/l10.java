package lab3;
import java.util.Random;
import java.util.Scanner;

public class l10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp;
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        System.out.println("Размер массива равен "+ size);
        int[] nums = new int[size];
        Random random = new Random();
        for (int i = 0 ; i < nums.length ; i++ ){
            nums[i] = random.nextInt(10);
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println("сортировка: \n");

        for (int i = 0; i < size; i++) {
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);
        }


    }
}


