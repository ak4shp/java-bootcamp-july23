import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Dice Jack !");
        System.out.println("Choose three numbers (1-6):");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        boolean check1 = areLessThan1(num1, num2, num3);
        boolean check2 = areGreaterThan6(num1, num2, num3);
        
        if(check1 || check2){
            System.out.println("Chosen number out of range.(Range 1-6)");
            System.exit(0);
        }
        
        int dice1 = rollDice();
        int dice2 = rollDice();
        int dice3 = rollDice();
        
        int userSum = num1 + num2 +num3;
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


    public static boolean areLessThan1(int num1, int num2, int num3){
        return (num1 < 1 || num2 < 1 || num3 < 1);
    }

    
    public static boolean areGreaterThan6(int num1, int num2, int num3){
        return (num1 > 6 || num2 > 6 || num3 > 6);
    }


    public static int rollDice(){
        double randNum = (Math.random() * 6) + 1;
        return (int) randNum;
    }
}
