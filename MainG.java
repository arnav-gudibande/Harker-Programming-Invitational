import java.util.*;
import java.io.*;


public class MainG {
	
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		char current = ' ';
		int count = 0;
		
		String sum = "";
		for (int i = 0; i < str.length(); i++){
			if (str.charAt(i) == current){
				count++;
			}else {
				if (current != ' '){
					sum += current+""+count;
				}
				
				current = str.charAt(i);
				count = 1;
			}
		}
		
		sum += current+""+count;
		
		System.out.println(sum);
		
	}
	
}