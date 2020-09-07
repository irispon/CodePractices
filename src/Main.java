
public class Main {

	public static void main(String[] args) {
		
		int[] array= {1,2,3,4,5,6};

		
		
		CumulativeAdd.Change(array);

		System.out.println("재귀 배열 출력");
		
		for(int i =0; i<array.length;i++) {
			
			System.out.print(array[i]+"  ");
			
			
		}
		
		
		int[] ex_array= {1,2,3,4,5,6};
		CumulativeAddEx.Change(ex_array);//
		
		System.out.println("\n메모리제이션 적용 출력");
		
		for(int i =0; i<array.length;i++) {
			
			System.out.print(ex_array[i]+"  ");
			
			
		}
			
	}

}
