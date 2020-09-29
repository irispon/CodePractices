package Merge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character[] a = {'M','E','R','G','E','S','O','R','T','E','X','A','M','P','L','E'};
		Character[] b = new Character[a.length];
		
//		Integer[] ia = {1,2,3,8,0,4,7,9};
//		Integer[] ib = new Integer[ia.length];
		
		System.out.println(a.length);
		
		MergeSort sort = new MergeSort();
		
		sort.sort(a, b, 0, a.length-1);
		
		for(char ch:a) {
			
			System.out.print(" "+ch);
		}
		
		System.out.println();
	}

}
