import java.util.Scanner;

public class TicTacToe {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
		char[][] ticBoard = {
			{'_', '_', '_'},
			{'_', '_', '_'},
			{'_', '_', '_'}};
		String res = "\n It's a Tie"	;

		System.out.println("\nLet's play tic tac toe");
		printBoard(ticBoard);	

		for(int i=1; i<10; i++){
			if(i%2 != 0){   // X turn
				System.out.println("\nTurn X ->");
				int[] userChoice = askUser(ticBoard);
				ticBoard[userChoice[0]][userChoice[1]] = 'X';
			} else {
				System.out.println("\nTurn O ->");
				int[] userChoice = askUser(ticBoard);
				ticBoard[userChoice[0]][userChoice[1]] = 'O';
			}

			printBoard(ticBoard);	
			int score = checkWin(ticBoard);
			if(score==3){
				res = "\nX Wins.";
				break;
			} else if(score==-3){
				res = "\nO Wins.";
				break;
			}
		}
		System.out.println(res);
		System.out.println("\nDid you enjoy? Let's play again.");
        scan.close();
        }


    /** Task 2 - Write a function that prints the board.
     * Function name - printBoard()
     * @param board (char[][])
     * 
     * Inside the function:
     *   1. print a new line.
     *   2. print the board.
     *      • separate each row by two lines. 
     *      • each row precedes a tab of space
     *      • each character in the grid has one space from the other character
     */        
	public static void printBoard(char[][] board){
		for(int i=0; i<board.length; i++){
			System.out.print("\n\n\t" );
			for(int j=0; j<board[i].length; j++){
				System.out.print(board[i][j]+"   ");
			}
		}
		System.out.println();
	}


   /** Task 4 - Write a function that lets the user choose a spot
     * Function name – askUser
     * @param board (char[][] board)
     * @return spot (int[])
     * 
     * Inside the function
     *   1. Asks the user: - pick a row and column number: 
     *   2. Check if the spot is taken. If so, let the user choose again.
     *   3. Return the row and column in an int[] array.
     * 
     */
	public static int[] askUser(char[][] board){
		int[] place = new int[2];
		System.out.print("\tpick a row and column number: ");
		while(true){
			int p1 = scan.nextInt();
			int p2 = scan.nextInt();
			scan.nextLine();
			if(!(p1>=0 && p1<=2 && p2>=0 && p2<=2)){
				System.out.print("\nInvalid numbers! Choose again: ");
				continue;
			} 
			if(board[p1][p2] != '_'){
				System.out.print("\nAlready taken! Choose again: ");
				continue;
			} else{
				place[0] = p1;
				place[1] = p2;
				return place;
			}
		}
	}


    /** Task 6 - Write a function that determines the winner
     * Function name - checkWin 
     * @param board (char[][])
     * @return count (int)
     * 
     * Inside the function:
     *   1. Make a count variable that starts at 0.
     *   2. Check every row for a straight X or straight O (Task 7).
     *   3. Check every column for a straight X or straight O (Task 8).
     *   4. Check the left diagonal for a straight X or straight O (Task 9).
     *   5. Check the right diagonal for a straight X or straight O (Task 10).
     */
	public static int checkWin(char[][] board){
		int count = 0;
		
		for(int i=0; i<board.length; i++){
			if((board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == 'X') 
			|| (board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X')
			|| (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') 
			|| (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')) {
				count = 3;
				break;
			} else if((board[0][i] == 'O' && board[1][i] == 'O' && board[2][i] == 'O') 
			|| (board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == 'O')
			|| (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') 
			|| (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')) {
				count = -3;
				break;
			}
		}
		return count;
	}
}
