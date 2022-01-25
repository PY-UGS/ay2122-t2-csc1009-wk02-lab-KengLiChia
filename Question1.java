import java.util.Scanner;

public class Question1 {

    //public static final double PI = 3.14159; //value cannot be changed alternative method
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");

        float pi = 3.14159f;

        float radius = input.nextFloat();
        input.close();
        float area = radius*radius*pi;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}

