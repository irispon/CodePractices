package Heap;

import java.util.ArrayList;
import java.util.Iterator;

public class MinHeap<T extends Comparable<T>> implements Iterable<T>{

	ArrayList<T> pq = new ArrayList<>(10);//배열 대신 어레이리스트 사용.
	int taile=0;
	public MinHeap(){
		pq.add(null);//array[0]=null;
	}
	public void insert(T data) {
		taile++;
	
		pq.add(data);
		swim(taile);
		
	}
	
	private void swim(int k) {
		while(k>1&& less(pq.get(k/2),pq.get(k))) {
			exch(k/2,k);
			k=k/2;
		}
	}
	
	public T delMin() {
		T min = pq.get(1);
		exch(1,taile--);
		sink(1);
		pq.remove(taile+1);
		
		return min;
	}

	
	
	private void sink(int pos) {
		while(2*pos<=taile)
		{
			int j = 2*pos;//child
		   if(j<taile&&less(pq.get(j),pq.get(j+1)))j++;
			if(!less(pq.get(pos),pq.get(j))) break;
			exch(pos,j);
			pos=j;
			
		}
		
	}
	
	private boolean less(T i, T k) {
		
		return i.compareTo(k)>0;
	}
	
	private void exch(int i,int k) {
		T tmp;
		tmp = pq.get(i);
		pq.set(i, pq.get(k));
		pq.set(k, tmp);
	//	System.out.println("변환"+pq.get(i)+" " +pq.get(k)+ "  "+i +" "+k);
		
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new HeapIterator();
	}
	
	private class HeapIterator implements Iterator<T> 
	{

		private int i =1;
		@Override
		public boolean hasNext() {
		return i<pq.size();
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			return pq.get(i++);
		}
		
		
		
	}
}
