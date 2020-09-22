package ThreeSum;
import java.util.*;
public class WonThreeSum {
	
	public static void main(String args[]) {
		
		//goal�� ���� ������ ���� 0���� ��ҽ��ϴ�.
		
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
		����
		���: (-40,0,40)
		���: (-40,10,30)
		���: (-20,-10,30)
		���: (-10,0,10)
		 */
		
		
	}
