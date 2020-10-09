package QuickSort;

import StdRandom.StdRandom;

public class Shuffle {
	public static void suffle(Object[]a) {
		int N = a.length;
		for (int i = 0; i < N; i++) { 
			int r = StdRandom.uniform(i + 1);
			Object tmp = a[i];
			a[i] = a[r];
			a[r] = tmp;}
	}
}
