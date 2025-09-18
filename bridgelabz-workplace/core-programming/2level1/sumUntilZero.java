import java.util.Scanner;

public class sumUntilZero {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double total = 0.0;
        double number;

        System.out.println("Enter a number (0 to stop): ");
        number = input.nextDouble();

        while(number != 0){
            total += number;
            System.out.println("Enter the number (0 to stop): ");
            number = input.nextDouble();
        }
        System.out.println("The total sum is: " + total);

        input.close();
    }    
}
