import java.util.*;
import java.io.*;


public class MainE {
	
	static byte[][] board;
	
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		
		int M = in.nextInt();
		int N = in.nextInt();
		
		in.nextLine();
		
		board = new byte[M][N];
		
		for(int i = 0; i < M; i++){
			String s = in.nextLine();
			for (int j = 0; j < N; j++){
				board[i][j]  = (byte) (s.charAt(j) == 'X' ? 2 : 0);
			}
		}
		//printBoard();
		
		boolean done = false;
		
		for (int x = 0; x < N; x++){
			if (board[0][x] != 2){
				fill(x, 0);
				done = true;
				break;
			}
			if (board[board.length-1][x] != 2){
				fill(x, board.length-1);
				done = true;
				break;
			}
		}
		
		if (!done){
			for (int y = 0; y < M; y++){
				if (board[y][0] != 2){
					fill(0, y);
					break;
				}
				if (board[y][board[0].length-1] != 2){
					fill(board[0].length-1, y);
					break;
				}
			}
		}
		
		
		
		
		
		for(int i = 0; i < M; i++){
			for (int j = 0; j < N; j++){
				if(board[i][j] == 0){
					count++;
				}
			}
		}
		
		System.out.print(count);
		
	}
	
	static int count = 0;
	public static void fill(int x, int y){
		
		board[y][x] = 1;
		//count++;
		for (int dx = -1; dx <= 1; dx++){
			for(int dy = -1; dy <= 1; dy++){
				if (!(dx ==0 && dy == 0) && canMove(x+dx, y+dy)){
					fill(x + dx, y + dy);
				}
			}
		}
	}
	
	public static boolean canMove(int x, int y){
		return (x >= 0) && x < board[0].length && y >=0 && y < board.length && board[y][x] == 0;
	}
	
	private static void printBoard(){
		for(int i = 0; i < board.length; i++){
			System.out.println(Arrays.toString(board[i]));
		}
	
	}
	
}