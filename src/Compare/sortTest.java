package Compare;

import java.util.Arrays;

import Sort.RandGenerate;

public class sortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] random = RandGenerate.GetIntegerDatas(10);
		

		Integer[] randomPack = Arrays.stream(random).boxed().toArray(Integer[]::new); 
		
		System.out.println("정렬 전");
		for(int d:randomPack) {
			
			System.out.print(d+" ");
		}
		
		
		InsertComparable<Integer> sort = new InsertComparable<>();
		sort.sort(randomPack);
	
		
		System.out.println("\n정렬 후");
		for(int d:randomPack) {
			
			System.out.print(d+" ");
		}
		
	}

}
