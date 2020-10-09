package QuickSort;

import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.Exchanger;

import Compare.InsertComparable;


public class QuickSort<T extends Comparable<T>> {

	private final int CUTOFF=3;//변수가 별로 없어서 3으로 설정함.


	
public void sort(T[] elements,int low,int high) {

	if(high<=low) return;
//	int j = partition(elements, low, high);
	int j = medianOf3(elements,low,low+(high-low)/2,high);
	sort(elements,low,j-1);
	sort(elements,j+1,high);
	
	
}

private int partition(T[] elements,int low,int high) {
	if(high<=low+CUTOFF-1)
	{
		new InsertComparable<T>().sort(elements);//개선 1
	}
	int i = low, j=high +1;
	T v =elements[low];
	
	while(true) {
		while(less(elements[++i],v)) if(i==high)	break;
		while(less(v,elements[--j]))if(j==low) break;
		if(i>=j)break;
		exch(elements,i,j);
	
	}
	exch(elements,low,j);
	return j;

}

private int medianOf3(T[] elements, int low, int middle, int high) {

	threeSort(elements, low, middle, high);
	return partition(elements,low,high);
	
}



private void exch(T[] elements,int i, int j) {
	T tmp;
	tmp = elements[i];
	elements[i]=elements[j];
	elements[j]= tmp;
	
}
private void threeSort(T[] arr, int front, int mid, int rear){
	if(less(arr[front],arr[mid])) exch(arr,front,mid);
	if(less(arr[mid],arr[rear]))exch(arr,mid,rear);
	if(less(arr[front],arr[mid]))exch(arr, front, mid);


}
private boolean less(T o,T w) {
	
	return o.compareTo(w)<0;

}



private T select(T[] elements,int find)
{
	Shuffle.suffle(elements);
	int low = 0 , high = elements.length -1;
	int j=0;
	
	while(high>low) 
	{
		j = partition(elements, low, high);
		if(j<find) low = j+1;
		else if(j>find) high = j-1;
		else return elements[find];
		
	}

	
	
	return  elements[find];
}

public ArrayList<T> selects(T[] elements,int numbers)
{
	ArrayList<T> finds = new ArrayList<>();
	for(int i =0;i<numbers;i++) {
		finds.add(select(elements, i));
	}
	System.out.println("\n");
	for(T t:finds) {
		System.out.println(t);
	}
	
	return finds;
	
	
}



}
