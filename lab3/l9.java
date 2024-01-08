package lab3;
import java.util.Random;
import java.util.Scanner;
public class l9 {
    public static void main(String[] args) {
        int min=0;
        Scanner id = new Scanner(System.in);

        System.out.println("Введите размер массива");

        int size = id.nextInt();

        System.out.println("Размер массива равен "+ size);

        int[] nums = new int[size];

        Random random = new Random();
        for (int i = 0 ; i < nums.length ; i++ ){

            nums[i] = random.nextInt(10);

            System.out.println("Элемент массива ["+i+"] = " + nums[i]);
            if (i==0) {
                min = nums[i];
            }
            if (nums[i]< min) {
                min = nums[i];
            }
        }
        System.out.println("\n");
        for (int i = 0 ; i < nums.length ; i++ ){
            if (min==nums[i]) {
                System.out.println("минимальный элемент:["+i+"] = " + nums[i]);
            }
        }
    }
}


