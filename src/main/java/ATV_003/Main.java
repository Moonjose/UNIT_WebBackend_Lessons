package ATV_003;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void FirstLesson() {
        LocalDateTime myDateTime = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
        System.out.println(myDateTime.format(myFormatObj));
    }

    public static void SecondLesson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digiteum número: ");
        double num = sc.nextDouble();
        System.out.println("A raiz quadrada de " + num + " é " + Math.sqrt(num));
    }

    public static void ThirdLesson() {
        int[][] matrix = {{3, 4, 8}, {9, 15, 3}, {10, 3, 9}};
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                matrix[i][k] *= 5;
                System.out.println(matrix[i][k]);
            }
        }

    }

    public static void FourthLesson() {
        Random r = new Random();
        int[] nums = { r.nextInt(101), r.nextInt(101), r.nextInt(101) };

        System.out.println("Números gerados: " + nums[0] + " " + nums[1] + " " + nums[2]);

        int min = nums[0];
        for (int elem: nums) {
            if (elem < min) {
                min = elem;
            }
        }
        System.out.println("Menor: " + min);
    }

    public static void FifthLesson() {
        int[] myVector = {10, 5, 25, 5, 1};
        System.out.println("Soma dos itens: " + recursiveSum(myVector, 0));
    }

    public static int recursiveSum(int[] vector, int index) {
        if (index >= vector.length) {
            return 0;
        }
        return vector[index] + recursiveSum(vector, index + 1);
    }
    public static void main(String[] args) {
        //FirstLesson();
        //SecondLesson();
        //ThirdLesson();
        //FourthLesson();
        FifthLesson();
    }
}
