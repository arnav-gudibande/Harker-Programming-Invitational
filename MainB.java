import java.util.*;
import java.io.*;

public class MainB {
	
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		
		int limit = in.nextInt();
		
		Map<Long, Boolean> map = new HashMap<Long, Boolean>();
		
		for(int i=0; i<limit; i++) {
			long val = in.nextLong();
			if (map.containsKey(val) && map.get(val)){
				System.out.print(val);
				return;
			}
			map.put(val, true);
		}
		
		System.out.print("NONE");
	}
	
}






