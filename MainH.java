import java.util.*;
import java.io.*;


public class MainH {
	
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
		
		m = in.nextInt();
		
		q.add(new State(0, 1));
		while(q.size() > 0){
			explore(q.remove());
		}
		
	}
	
	static boolean done = false;
	
	static void explore(State s){
		if(done) return;
		
		if(s.location == m){
			System.out.println(s.moves-1);
			done = true;
			return;
		}
		
		q.add(new State(s.location-s.moves, s.moves + 1));
		q.add(new State(s.location+s.moves, s.moves + 1));
	}
	
}