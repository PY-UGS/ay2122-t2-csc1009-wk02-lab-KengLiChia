import java.util.Scanner;

/**
 * Question2
 */
public class Question2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter three numbers: ");

            float[] num = new float[4];

            for (int i = 0; i < 3; i++) {
                num[i] = input.nextFloat();
                num[3] += num[i]; //total of num1, num2, num3
            }
            
            num[3]/=3;
            System.out.println("The average of " + num[0] + " " + num[1] + " " + num[2] + " is " + num[3]);

        }
    }
}