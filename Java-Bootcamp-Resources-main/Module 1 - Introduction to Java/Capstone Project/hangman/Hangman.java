import java.util.*;

public class Hangman{
    
    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
        "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
        "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
        "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
        "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
        "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
        "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
        "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
        "wombat", "zebra"};

    public static String[] gallows = {
        "+---+\n" +
        "|   |\n" +
        "    |\n" +
        "    |\n" +
        "    |\n" +
        "    |\n" +
        "=========\n",

        "+---+\n" +
        "|   |\n" +
        "O   |\n" +
        "    |\n" +
        "    |\n" +
        "    |\n" +
        "=========\n",

        "+---+\n" +
        "|   |\n" +
        "O   |\n" +
        "|   |\n" +
        "    |\n" +
        "    |\n" +
        "=========\n",

        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|   |\n" +
        "     |\n" +
        "     |\n" +
        " =========\n",

        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|\\  |\n" + 
        "     |\n" +
        "     |\n" +
        " =========\n",

        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|\\  |\n" +
        "/    |\n" +
        "     |\n" +
        " =========\n",

        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|\\  |\n" + 
        "/ \\  |\n" +
        "     |\n" +
        " =========\n"};
    
    static Scanner scan = new Scanner(System.in);
    static int wrongAttempts = 0;
    static String missedWord = "";
    
    
    public static void main(String[] args) {
        String word = randomWord();
        int wordLen = word.length();
        char[] guessed = new char[wordLen];
        for(int i=0; i<wordLen; i++){
            guessed[i] = '_';
        }
        
        System.out.println("Hangman is ready!! Be careful with your guessings...");
        while(true){
            
            System.out.println("\n"+gallows[wrongAttempts]);
            if(wrongAttempts == 6){
                System.out.println("\nYou are dead... Hangman's patience exceed.");
                System.out.println("By the way, the word was: "+word);
                break;
            }
            
            System.out.print("Word:   ");
            printPlaceholders(guessed);
            System.out.println("\nMisses: " + missedWord);
            System.out.print("Guess: ");
            char guessLetter = scan.next().charAt(0);
            guessed = matchAndUpdate(guessed, word,  guessLetter);
            
            String guessedWord = String.valueOf(guessed);
            if(guessedWord.equals(word)){
                System.out.println("\nWo hooo !! You saved a life!");
                break;
            }

            if(wrongAttempts== 5){
                System.out.println("\t#----# WARNING: Last attempt! #----#");
            }
        }
    }


    public static String randomWord(){
        double index = Math.random()*words.length;
        String word = words[(int)index];
        return word;
    }
    
    
    public static void printPlaceholders(char[] placeholder){
        for(int i=0; i<placeholder.length; i++){
            System.out.print(placeholder[i]+" ");
        }
    }
    
    
    public static char[] matchAndUpdate(char[] guessed, String word,  char guessLetter){
        // System.out.println("The word:  "+word);
        // int idx = 0;
        boolean charNotFound = true;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            if(c==guessLetter && guessed[i] =='_'){
                guessed[i] = guessLetter;
                charNotFound = false;
                // idx = i;
                break;
            } 
        }
        
        if(charNotFound){
            wrongAttempts++;
            missedWord = missedWord + guessLetter;
        }
        return guessed;
    }
}

