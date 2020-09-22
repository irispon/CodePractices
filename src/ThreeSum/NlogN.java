package ThreeSum;
import java.util.*;

public class NlogN {

	public static void main(String[] args) {
		int[] numbers = {30,-40,-20,-10,40,0,10,5};	
		System.out.print("�迭 ���� Ȯ��: ");
		for (Integer integer : numbers) {
	
			System.out.print(" "+integer);//���� �迭 ����
			
		}
		
		//����

		Arrays.sort(numbers);//double quick sort ��� O(n) ~ O(n log n)
		
		System.out.print("\n���� �� �迭 ���� Ȯ��: ");
		
		for (Integer integer : numbers) {
	
			System.out.print(" "+integer);//���� �迭 ����
			
		}
		
		System.out.print("\n\n");
		//pair �� binary search
		
		int numberK;
		int count=0;
		for(int i =0; i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
			
				numberK=-(numbers[i]+numbers[j]);
			 if(0<Arrays.binarySearch(numbers, numberK)&&((numbers[i]<numbers[j])&&(numbers[j]<numberK))) {
				 System.out.println("���: " +"("+numbers[i]+","+numbers[j]+","+numberK+")" );
				 count++;
				 
			 }
				
			}
			
			
		}
			
		 System.out.println("\n3-SUM ��� "+count);
			
	}
	
	
}


