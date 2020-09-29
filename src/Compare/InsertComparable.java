package Compare;

public class InsertComparable<T extends Comparable<T>> {

	public void sort(T[]data) {
		
		T key;
		int j;
	
		for(int i =1;i<data.length;i++) 		
		{
	
			key = data[i];
			for(j =i-1;j>=0;j--) 
			{
				if(less(data[j],key)) 
				{
					data[j+1] = data[j];
					
					
				}else {
					
					break;
				}
				
				
				
			}
			
			data[j+1]=key;
			
		}
		
		
	}
		
	
	private boolean less(T o,T w) {
		
		
		return o.compareTo(w)<0;
	}
}
