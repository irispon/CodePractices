package QuickSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Assertions;

public class QuickSelectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] aux = new Integer[100];
		QuickSort<Integer> sort = new QuickSort<Integer>();

		for(int i =0; i<100;i++) {
			
			aux[i]=i+1;
		
		}
		Shuffle.suffle(aux);
		for(int element:aux) {
			System.out.print(element+" ");
		}
		System.out.println();
		
		ArrayList<Integer> list =sort.selects(aux, 3);
		
		
		
		Set<Integer> expected = new HashSet<>();
		
		Collections.addAll(expected, 1,2,3);
		
		Set<Integer> actual = new HashSet<>();
		
		for(int element:list) {
			actual.add(element);
		}
		
		Assertions.assertEquals(expected, actual);			
	}

}
