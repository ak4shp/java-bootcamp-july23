public class HighScore {
    public static void main(String[] args) {
        
        int highScore = 0;
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.5).
        int[] scores = {generateRandom(), generateRandom(), generateRandom(), generateRandom(), generateRandom(), generateRandom(), generateRandom(), generateRandom(), generateRandom(), generateRandom()};

        System.out.print("Here are the scores: " + scores);
        for(int i = 0; i<10; i++){
            if(scores[i]>=highScore){
                highScore = scores[i];
            }
        }   
        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
        
    }    

    public static int generateRandom(){
        int min = 0;
        int max = 49999;
        return (int) ((Math.random() * (max - min)) + min);
    }

}
