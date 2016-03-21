import java.util.*;
import java.io.*;
import java.math.BigInteger;


public class Main {
	
	
	static boolean canWin = false;
	static boolean other = false;
	
	static char lanceC;
	
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		
		
		lanceC = in.next().charAt(0);
		in.nextLine();
		
		char[][] board = new char[3][3];
		for (int i = 0; i < 3; i++){
			String s = in.nextLine();
			for (int j = 0; j < 3; j++){
				board[i][j] = s.charAt(j);
			}
		}
		
		//System.out.println(status(board));
		
		if(true){
			//return;
		}
		//System.out.println(Arrays.deepToString(board));
		
		explore(board, lanceC);
		if(other==false && canWin == false){
			System.out.println("YES");
		}
		if (other == true){
			System.out.println("NO");
		}else {
			if (canWin == true){
				System.out.println("YES");
			}
		}
		//System.out.println(amt);
	}
	
	private static void explore(char[][] board, char player){
		if (canWin) return;
		
		//System.out.println(Arrays.deepToString(board));
		
		char c = status(board);
		if (lanceC == c){
			other = true;
			return;
		}else if (c == (lanceC == 'X' ? 'O' : 'X')){
			canWin = true;
			return;
		}
		
		for(int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				if (board[i][j] == '.'){
					char[][] copy = copy(board);
					copy[i][j] = player;
					explore(copy, player == 'X' ? 'O' : 'X');
				}
			}
		}
	}
	
	private static char status(char[][] board){
		if (board[0][0] == board[1][1] && board[0][0] == board[2][2]){ 
			//System.out.println("Left Diag");
			return board[0][0];
		}
		if (board[2][0] == board[1][1] && board[2][0] == board[0][2]){
			//System.out.println("Right Diag");
			return board[2][0];
		}
		
		for (int y = 0; y < 3; y++){
			if (board[y][0] == board[y][1] && board[y][0] == board[y][2]){ 
				//System.out.println("Row wins");
				return board[y][0];
			}
		}
		
		for (int x = 0; x < 3; x++){
			if (board[0][x] == board[1][x] && board[0][x] == board[2][x]){
				//System.out.println("Column wins");
				return board[0][x];
			}
		}
		
		return '.';
	}
	
	private static char[][] copy(char[][] board){
		char[][] copy = new char[3][3];
		for(int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				copy[i][j] = board[i][j];
			}
		}
		return copy;
	}
	
}
