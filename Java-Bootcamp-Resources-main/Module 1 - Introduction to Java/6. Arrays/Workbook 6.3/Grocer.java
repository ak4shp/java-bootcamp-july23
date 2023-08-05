public class Grocer {
    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.3).
        String[] items = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("\nDo you sell coffee?");
        
        for(int i=0; i<items.length; i++){
            if(items[i].equals("coffee")){
                System.out.println("\nWe have that in aisle: "+i); 
            }
        } 
    }
}
