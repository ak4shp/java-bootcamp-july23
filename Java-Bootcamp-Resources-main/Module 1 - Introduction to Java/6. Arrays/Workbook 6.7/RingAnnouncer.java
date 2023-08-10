public class RingAnnouncer {
    public static void main(String[] args) {
        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
        int wins = 0;
        int losses = 0;
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.7).
        for (String status : record) {
            if(status.equals("WIN")){
                wins++;
            } else if(status.equals("LOSS")){
                losses++;
            }
        }
        System.out.println("\nWith a professional record of "+wins+" Wins and "+losses+" losses.");
        System.out.println("She is the pride of oracle: Java Fury!");


    }
}
