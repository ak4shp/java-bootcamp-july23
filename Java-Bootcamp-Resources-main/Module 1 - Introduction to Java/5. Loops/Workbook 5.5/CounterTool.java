import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

       // See detailed instructions on Learn the Part.
        System.out.print("\n1. Count by: ");
        int step = scan.nextInt();
        System.out.print("2. Start: ");
        int start = scan.nextInt();
        System.out.print("3. End: ");
        int end = scan.nextInt();

        for(int i = start; i<=end; i+=step){
            System.out.print(i + " ");
        }

        scan.close();
    }
}
