import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // See Learn the Part for detailed instructions.
        System.out.println( "Let's play Rolling Java. Type anything to start.");
        String dummy = scan.nextLine();

        String homeMsg ="\nGreat, here are the rules:\n\n"
                + "\t- If you roll a 6, the game stops.\n"
                + "\t- If you roll a 4, nothing happens.\n"
                + "\t- Otherwise, you get 1 point.\n\n"
                + "You must collect at least 3 points to win. Enter anything to roll:";

        System.out.println(homeMsg);
        dummy = scan.nextLine();

        int score = 0;
        boolean isRoll = true;

        while(isRoll){
            int diceRoll = rollDice();
            String rollMsg = "";
            if(diceRoll == 6){
                rollMsg = "End of game.";
                isRoll = false;
                // System.out.println("\nYou rolled a "+diceRoll+". End of game.");
            } else if(diceRoll == 4){
                rollMsg = "Zero point. Keep rolling";
                // System.out.println("\nYou rolled a "+diceRoll+". Zero point. Keep rolling");
            } else{
                rollMsg = "One point. Keep rolling";
                score++;
                // System.out.println("\nYou rolled a "+diceRoll+". One point. Keep rolling");
            }
            System.out.println("\nYou rolled a "+diceRoll+". "+rollMsg);
        }

        String endMsg = "";
        if(score >=3){
            endMsg = "Wow, that's lucky. You win!";
        } else{endMsg = "Tough luck, you lose :(";}
        
        System.out.println("\nYour score is "+score);
        System.out.println(endMsg);

        scan.close();
    }
    

    public static int rollDice(){
        double randNum = (Math.random() * 6) + 1;
        return (int) randNum;
    }
}
