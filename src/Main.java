
public class Main {

	public static void main(String[] args) {
		
		int[] array= {1,2,3,4,5,6};

		
		
		CumulativeAdd.Change(array);

		System.out.println("��� �迭 ���");
		
		for(int i =0; i<array.length;i++) {
			
			System.out.print(array[i]+"  ");
			
			
		}
		
		
		int[] ex_array= {1,2,3,4,5,6};
		CumulativeAddEx.Change(ex_array);//
		
		System.out.println("\n�޸����̼� ���� ���");
		
		for(int i =0; i<array.length;i++) {
			
			System.out.print(ex_array[i]+"  ");
			
			
		}
			
	}

}
