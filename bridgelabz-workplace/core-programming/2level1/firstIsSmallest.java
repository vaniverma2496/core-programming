import java.util.Scanner;

public class firstIsSmallest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter numer1: ");
        int number1 = input.nextInt();
        
        System.out.println("Enter number2: ");
        int number2 = input.nextInt();
        
        System.out.println("Enter number3: ");
        int number3 = input.nextInt();
        

        boolean smallest = (number1 < number2) && (number1 < number3);

        System.out.println(" is first number is smallest? " + (smallest ? "yes" : "no"));

        input.close();
    }
}
