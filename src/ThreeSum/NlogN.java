package ThreeSum;
import java.util.*;

public class NlogN {

	public static void main(String[] args) {
		int[] numbers = {30,-40,-20,-10,40,0,10,5};	
		System.out.print("배열 상태 확인: ");
		for (Integer integer : numbers) {
	
			System.out.print(" "+integer);//현재 배열 상태
			
		}
		
		//정렬

		Arrays.sort(numbers);//double quick sort 사용 O(n) ~ O(n log n)
		
		System.out.print("\n정렬 후 배열 상태 확인: ");
		
		for (Integer integer : numbers) {
	
			System.out.print(" "+integer);//현재 배열 상태
			
		}
		
		System.out.print("\n\n");
		//pair 후 binary search
		
		int numberK;
		int count=0;
		for(int i =0; i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
			
				numberK=-(numbers[i]+numbers[j]);
			 if(0<Arrays.binarySearch(numbers, numberK)&&((numbers[i]<numbers[j])&&(numbers[j]<numberK))) {
				 System.out.println("페어: " +"("+numbers[i]+","+numbers[j]+","+numberK+")" );
				 count++;
				 
			 }
				
			}
			
			
		}
			
		 System.out.println("\n3-SUM 결과 "+count);
			
	}
	
	
}


