import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        //Task 1 – Ask the user: how many historical figures will you register?
        //       – Store the value.
        int numOfFig = scan.nextInt();
        scan.nextLine();
        //Task 2 – Create a 2D array with a variable number of rows, and 3 values per row.         
        
        String[][] histFig = new String[numOfFig][3];
        //Watch out for the nextLine() pitfall. 
        // Task 3 
        for (int i=0; i<numOfFig; i++){
            System.out.println("\n\tFigure " + (i+1)); 

            System.out.print("\t - Name: ");
            String name = scan.nextLine(); 
            histFig[i][0] = name;  

            System.out.print("\t - Date of birth: ");
            String dob = scan.nextLine();
            histFig[i][1] = dob;

            System.out.print("\t - Occupation: ");
            String occupation = scan.nextLine();
            histFig[i][2] = occupation; 

            System.out.print("\n");

        }
        
        System.out.println("These are the values you stored:"); 
        //Task 4: call print2DArray. 
        print2DArray(histFig);

        System.out.print("\nWho do you want information on? ");  
        String query = scan.nextLine();
        // Task 5: Let the user search the database by name. If there's a match:
        for(int i=0; i<numOfFig; i++){
            String k = histFig[i][0];
            if(k.equals(query)){
                System.out.println("\t Name: " + histFig[i][0]);
                System.out.println("\t Date of birth: "+histFig[i][1]);
                System.out.println("\t Occupation: "+histFig[i][2]);
            }
        }
        scan.close();
    }

    /**
     * Function name: print2DArray
     * @param array (String[][])
     * 
     * Inside the function
     *  1. print the database
     *     • a tab of space precedes each row.
     *     • each value in database has one space from the other value. 
     *     • print a new line.
     */
    public static void print2DArray(String[][] values){
        for(int i=0; i<values.length; i++){
            System.out.println(values[i][0]+" "+values[i][1] +" "+values[i][2]);
        }
    }
}
