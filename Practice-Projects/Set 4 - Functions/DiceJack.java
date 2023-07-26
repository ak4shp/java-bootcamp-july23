import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Dice Jack !");
        System.out.println("Choose three numbers (1-6):");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int userSum = num1 + num2 +num3;

        int dice1 = rollDice();
        int dice2 = rollDice();
        int dice3 = rollDice();
        int diceSum = dice1 + dice2 + dice3;

        int diff = userSum - diceSum;
        String result = "You lose !!";
        if(diff > 0 && diff < 3){
            result = "You win!";
        }
        System.out.println("Dice -> ("+dice1+", "+dice2+", "+dice3+")");
        System.out.println("Dice sum = "+diceSum+", Number sum = "+userSum);
        System.out.println(result);
        scan.close();
    }


    public static int rollDice(){
        double randNum = (Math.random() * 6) + 1;
        return (int) randNum;
    }
}
