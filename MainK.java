import java.util.*;
import java.io.*;


public class MainK {
	
	private static class State {
		int location;
		int moves;
		State(int location, int moves){
			this.location = location;
			this.moves = moves;
		}
	}
	
	static Queue<State> q= new LinkedList<State>();
	static int m;
	
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		m = in.nextInt();
		
		//int[] villages = 
		for (int i = 0; i < n-2; i++){
			
		}
		
		
	}
	
	static boolean done = false;
	
}