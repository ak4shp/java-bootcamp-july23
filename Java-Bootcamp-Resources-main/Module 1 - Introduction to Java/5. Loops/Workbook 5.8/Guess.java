import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        int num = 3;   
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();
        //See Learn the Part for detailed instructions.
        
        while(num != guess){
            System.out.print("Guess again: ");
            guess = scan.nextInt();
        }

        System.out.println("You Got it!");
        scan.close();
    }

}
