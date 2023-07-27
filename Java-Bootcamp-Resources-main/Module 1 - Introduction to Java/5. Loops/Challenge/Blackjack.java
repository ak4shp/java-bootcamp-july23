import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        //Task 3 – Wait for the user to press enter.
        scan.nextLine();

        //Task 4 – Get two random cards.
        //       – Print them: \n You get a \n" + <randomCard> + "\n and a \n" + <randomCard>
        int randCardNum1 = drawRandomCard();
        int randCardNum2 = drawRandomCard();
        String randCard1 = cardString(randCardNum1);
        String randCard2 = cardString(randCardNum2);
        System.out.println("\n You get a \n" +randCard1 + "\n and a \n" +randCard2);


        //Task 5 – Print the sum of your hand value.
        //       – print: your total is: <hand value>
        int playerTotal = randCardNum1 + randCardNum2;
        System.out.println("Your total is: "+playerTotal);

        
        //Task 6 – Get two random cards for the dealer.
        //       – Print: The dealer shows \n" + <first card> + "\nand has a card facing down \n" + <facedown card>
        //       – Print: \nThe dealer's total is hidden
        int dealerCardNum1 = drawRandomCard();
        int dealerCardNum2 = drawRandomCard();
        String dealerCard1 = cardString(dealerCardNum1);
        String dealerCard2 = cardString(dealerCardNum2);
        String facedownCard = faceDown();
        System.out.println("\nThe dealer shows \n" +dealerCard1 + "\n and has a card facing down \n" +facedownCard);
        int dealerTotal = dealerCardNum1 + dealerCardNum2;
        
        
        //Task 8 – Keep asking the player to hit or stay (while loop).
        //       1. Every time the player hits
        //             – draw a new card.
        //             – calculate their new total.
        //             – print: (new line) You get a (new line) <show new card>.
        //             - print: your new total is <total>

        //       2. Once the player stays, break the loop. 
        boolean isHit = true;
        while(isHit){
            System.out.print("Please write 'hit' or 'stay': ");
            String hitStay = scan.nextLine();
            if(hitStay.equals("hit")){
                int nextCardNum = drawRandomCard();
                String nextCard = cardString(nextCardNum);
                playerTotal += nextCardNum;
                System.out.println("\n You get a \n"+nextCard);
                System.out.println("Your new total is "+playerTotal);
                if(playerTotal > 21){
                    System.out.println("Burst! You lose.");
                    System.exit(0);
                }
            } else if(hitStay.equals("stay")){
                System.out.println("\nThe dealer's cards are \n" +dealerCard1 + "\n and a \n" +dealerCard2);
                System.out.println("\nDealer's total is "+dealerTotal);
                dealerTotal = playDealer(dealerTotal);
                isHit = false;
            }
        }

        if(playerTotal > dealerTotal){
            System.out.println("\nPlayer wins!");
        } else{
            System.out.println("Dealer wins!");
        }

        
        //For tasks 9 to 13, see the article: Blackjack Part II. 
         scan.close();

    }

    
    public static int playDealer(int dealerTotal){
        while(dealerTotal<17){
            int dealerCardNum = drawRandomCard();
            String dealerCard = cardString(dealerCardNum);
            dealerTotal += dealerCardNum;
            System.out.println("\nDealer gets a \n"+dealerCard); 
            System.out.println("\nDealer's total is "+dealerTotal);
            if(dealerTotal>21){
                System.out.println("\nBurst... Dealer loses !");
                System.exit(0);
            }
        }
        return dealerTotal;
    }


    /** Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */
    public static int drawRandomCard() {
        int min = 1;
        int max = 14;
        return (int) ((Math.random() * (max - min)) + min);
    }


     /** Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */
    public static String cardString(int cardNumber){
        String card = ""; 
        switch (cardNumber) {
            case 1:    
                card="   _____\n"+
                    "  |A _  |\n"+ 
                    "  | ( ) |\n"+
                    "  |(_'_)|\n"+
                    "  |  |  |\n"+
                    "  |____V|\n";
                break;

            case 2:
                card="   _____\n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";
                break;
            
            case 3:
                card="   _____\n" +
                    "  |3    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____E|\n";
                break;
                
            case 4:
                card="   _____\n" +
                    "  |4    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  | o o |\n"+
                    "  |____h|\n";
                break;
                
            case 5:
                card="   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";
                break;
                
            case 6:
                card="   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";
                break;
                
            case 7:
                card="   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
                break;
                
            case 8:
                card="   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
                break;
                
            case 9:
                card="   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";
                break;
                
            case 10:
                card="   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
                break;
                
            case 11:
                card="   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";
                break;
                
            case 12:
                card="   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
                break;
                
            case 13: 
                card="   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";
                break;
        }
        return card;
    }




    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
    /** Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */
    }

