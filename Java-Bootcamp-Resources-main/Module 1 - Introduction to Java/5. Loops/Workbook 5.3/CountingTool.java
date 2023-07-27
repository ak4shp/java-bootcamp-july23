import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Write a number: ");
        int num = scan.nextInt();
        // See Learn the Part for the instructions.
        System.out.println("Here is the counting !");
        for(int i = 0; i <=num; i++){
            System.out.print(i + " ");
        }
        scan.close();
    }
}
