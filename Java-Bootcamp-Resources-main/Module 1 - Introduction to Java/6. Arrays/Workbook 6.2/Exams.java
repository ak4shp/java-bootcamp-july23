public class Exams {
    public static void main(String[] args){
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.2).
        String[] students = {"Harry", "Neville", "Ron", "Hermione", "Seamus"}; 
        System.out.println("It's time to take your 5th years exams. Please, take your seats.\n");
        
        for(int i=0; i<students.length; i++){
            System.out.println(students[i]+", you will take seat "+i);
        }
        // Compare your result to what's on Learn the Part.

    }
}
