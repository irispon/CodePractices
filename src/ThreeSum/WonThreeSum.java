package ThreeSum;
import java.util.*;
public class WonThreeSum {
	
	public static void main(String args[]) {
		
		//goal은 이전 예제와 같이 0으로 잡았습니다.
		
		int[] numbers = {30,-40,-20,-10,40,0,10,5};
		
		HashMap<Integer, Integer> map = new HashMap<>();

		int rest;
		
		for(int n:numbers) map.put(n, n);
		
	
		
		for(int i =0;i<numbers.length;i++) {
			for(int j =i+1;j<numbers.length;j++) {
				rest = -(numbers[i]+numbers[j]);
				if(((numbers[i]<numbers[j])&&(numbers[j]<rest))&&rest==map.getOrDefault(rest, -1)){
					System.out.print("("+numbers[i]+","+numbers[j]+","+rest+")"+"\n");
				}
				
			}
		}

			
			
		}
		
		/*
		정답
		페어: (-40,0,40)
		페어: (-40,10,30)
		페어: (-20,-10,30)
		페어: (-10,0,10)
		 */
		
		
	}
