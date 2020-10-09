package QuickSort;

import java.util.ArrayList;
import java.util.Arrays;

import Sort.RandGenerate;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Character[] random = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T'};
		Shuffle.suffle(random);//Knuth shuffle 사용
		
		
		
		System.out.println("정렬 전");
		for(char d:random) {
			
			System.out.print(d+" ");
		}
		
		
		QuickSort<Character> sort = new QuickSort<>();
		sort.sort(random, 0, random.length-1);
		
		System.out.print("\n정렬 후\n");
		
		for(char d:random) {
			
			System.out.print(d+" ");
		}
		
		
		Shuffle.suffle(random);//Knuth shuffle 사용
		ArrayList<Character> select =sort.selects(random, 4);

		
	}
}
