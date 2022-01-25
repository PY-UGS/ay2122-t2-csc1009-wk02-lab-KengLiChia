import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a year: ");
            int year = input.nextInt();

            String zodiac = zodiac(year);
            System.out.println(zodiac);
        }
    }
    
    public static String zodiac(int year){ //method which return strings.
        int zodiacFormula = year%12;

        switch (zodiacFormula) {
            case 0:
                return "monkey";
            case 1:
                return "rooster";
            case 2:
                return "dog";
            case 3:
                return "pig";
            case 4:
                return "rat";
            case 5:
                return "ox";
            case 6:
                return "tiger";
            case 7: 
                return "rabbit";
            case 8:
                return "dragon";
            case 9:
                return "snake";
            case 10:
                return "horse";
            default:
                return "sheep";
        }
    }       
}
