public class HighScore {
    public static void main(String[] args) {
        int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};
        
        int highScore = 0;
        int seatNumber = 0;
        System.out.print("Here are the scores: ");    
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
            if (scores[i] > highScore) {
                highScore = scores[i];
                seatNumber = i;
            }
        }
        
       
        System.out.println("\n\nThe highest score is: " + highScore + ". Impressive!");
        
        // TODO : See instructions on Learn the Part (Workbook 6.6)
        System.out.println("It's the person in seat: "+(seatNumber+1)+". Give a cookie!");

    }
    
    public static int randomNumber() {
        double randomDouble = Math.random() * 50000;
        int randomInt = (int)randomDouble;
        return randomInt;
    }
}
