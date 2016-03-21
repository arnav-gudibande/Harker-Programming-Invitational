import java.util.*;
import java.io.*;


public class MainJ {
	
	static int[] times;
	static int[] points;
	static int R;
	
	private static class Shot implements Comparable{
		int time;
		int p;
		double rating;
		
		Shot(int time, int p){
			this.time = time;
			this.p = p;
			rating = ((double)p)/(time+R);
		}
		
		public int compareTo(Object o){
			Shot other = (Shot) o;
			double x = other.rating - rating;
			if (x > 0){
				return 1;
			}else if(x == 0){
				return 0;
			}else{
				return -1;
			}
		}
		
		
	}
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int S = in.nextInt();
		R = in.nextInt();
		
		Shot[] shots = new Shot[N];
		
		for(int i = 0; i < N; i++){
			shots[i] = new Shot(in.nextInt(), in.nextInt());
		}
		
		Arrays.sort(shots);
		
		int points = 0;
		
		for (int i = 0; i < N; i++){
			Shot s = shots[i];
			if(S == 0){
				break;
			}
			
			if (s.time > S){
				continue;
			}
			
			points += s.p;
			S -= s.time;
			S -= R;
			
		}
		
		System.out.println(points);
	}
	
	
}