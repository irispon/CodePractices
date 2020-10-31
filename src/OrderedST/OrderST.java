package OrderedST;

import java.util.Iterator;

public class OrderST<Key extends Comparable<Key>,Value>  {
	
private Key[] keys;
private Value[] values;
private int cap;
private int size=0;

public OrderST() {
	this(20);	
}
public OrderST(int size) {
	this.cap=size;
	keys =(Key[]) new Comparable[this.cap];
	values =(Value[]) new Comparable[this.cap];
}
void put(Key key, Value val) {
	
	if(size>=cap) {
		reSize();
	}
	int rank = rank(key);
	
	for(int i=size;i>rank;i-- ) {
		keys[i]=keys[i-1];
		values[i]=values[i-1];
	}
	keys[rank]=key;
	values[rank]=val;
	size++;
	
}

private void reSize() {
	cap =cap*2;
	Key[] tmpk =(Key[]) new Comparable[cap] ;
	Value[] tmpv=(Value[]) new Comparable[cap] ;
	for(int i =0;i<cap;i++) {
		tmpk[i]=keys[i];
		tmpv[i]=values[i];
		
	}
	keys = tmpk;
	values = tmpv;

}

public Value get(Key key) {
	if(isEmpty())return null;
	int i = rank(key);
	if(i<size&& keys[i].compareTo(key)==0) return values[i];
	else return null;

}

public void delete(Key key) {
	if(size<=0) {
		return;
	}else if(contains(key)) {
		int rank = rank(key);
		System.out.println("\n»èÁ¦: "+key);
		for(int i=rank;i<size-1;i++) {
			
			keys[i]=keys[i+1];
			values[i]=values[i+1];
		}
		deleteMax();
		
	}
	
	

	
}
public boolean contains(Key key) {
	if(keys[rank(key)].compareTo(key)==0) {
		return true;
	}
	return false;
}
public boolean isEmpty() {
	if(size==0) {
		return true;
	}
	return false;
}
public int size() {
	return size;
}
public Key min() {
	return keys[0];
}
public Key max() {
	return keys[size-1];
}
private int rank(Key key) {
	int lo = 0,hi =size-1;
	while(lo<=hi) {
		int mid = lo +(hi-lo)/2;
		int cmp = key.compareTo(keys[mid]);
		if(cmp<0)	hi=mid -1;
		else if(cmp>0)lo = mid +1;
		else if(cmp==0) return mid;
	}
	return lo;
}
public Key select(int k) {
	return keys[k];
}
public void deleteMin() {
	if(size<=0) {
		return;
	}
	for(int i =1;i<size;i++) {
		keys[i-1]=keys[i];
		values[i-1]=values[i];
	}
	size--;
}
public void deleteMax() {
	size--;
	keys[size]=null;
	values[size]=null;

}
public int size(Key lo, Key hi) {
	if(contains(lo)&&contains(hi)) {
		return rank(hi)-rank(lo);
	}
	return 0;
}
public Iterable<Key> keys(Key lo, Key hi){
	return new STiterator();
}
public Iterable<Key> keys(){
	return new STiterator();
}

private class STiterator implements Iterable<Key>,Iterator<Key>
{
	private int i=0;
	private int N =size;
	private Key key;
	@Override
	public boolean hasNext() {
	
	return i<N;
	}

	@Override
	public Key next() {
		// TODO Auto-generated method stub
		this.key =keys[i];
		i++;
		
		return this.key;
	}

	@Override
	public Iterator<Key> iterator() {
		// TODO Auto-generated method stub
		return this;
	}
	
	
	
}

}


