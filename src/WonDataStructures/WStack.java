package WonDataStructures;

import java.util.Iterator;

public class WStack<Item> implements Iterable<Item> {

	private Item[] a = (Item[]) new Object[1];
	private int N =0;
	
	public boolean isEmpty() {return N==0;}
	public int size() {return N;}
	
	private void resize(int max) {
		Item[] temp = (Item[]) new Object[max];
		for(int i =0; i<N;i++) {
			temp[i] = a[i];
		}
		a=temp;
	}
	
	public void push(Item item) {
		if(N==(a.length*2/3)) {
			resize(2*a.length);
		}
		
		a[N++] = item;
	}
	
	public Item pop() {
		Item item;
		if(N>0) {
			item = a[--N];
			a[N]=null; //로이터링 문제 해결(참조되는 데이터가 계속해서 메모리를 점유하고 있는 문제를 해결)
		}else {
			
			item =null;
		}
		//언더플로우 에러 문제 해결
		return item;
	}
	
	
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		
		return new ReverseArrayIterator();
	}

	private class ReverseArrayIterator implements Iterator<Item> 
	{

		private int i =N;
		@Override
		public boolean hasNext() {
		return i>0;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			return a[--i];
		}
		
		
		
	}
}


