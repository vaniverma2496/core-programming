import java.util.Scanner;

public class largestNo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number1:");
        int number1 = input.nextInt();

        System.out.println("Enter the number2:");
        int number2 = input.nextInt();

        System.out.println("Enter the number3:");
        int number3 = input.nextInt();

        boolean firstLargest = (number1 > number2) && (number1 > number3);
        boolean secondLargest = (number2 > number1) && (number2 > number3);
        boolean thirdLargest = (number3 > number1) && (number3 > number1);

        System.out.println("Is the first number the largest? " + (firstLargest ? "Yes" : "no" ));
        
        System.out.println("Is the second number the largest? " + (secondLargest ? "Yes" : "no" ));
        
        System.out.println("Is the third number the largest? " + (thirdLargest ? "Yes" : "no" ));

    }

}
