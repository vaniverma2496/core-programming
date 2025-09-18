import java.util.Scanner;
public class rocketLaunch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number for countdown: ");
        int counter = input.nextInt();

        while(counter >= 1){
            System.out.println(counter);
            counter--;
        }
        System.out.println("Launch");

        input.close();
    }
}
