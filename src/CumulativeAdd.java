
public class CumulativeAdd {

	public static void Change(int[]integerArr) {

		int[] tmp=integerArr.clone();

		
		for(int i =0; i<integerArr.length;i++) {
			
			integerArr[i]= Add(tmp ,i);
			
		}
		
		
		
	}
	 static int Add(int[] integerArr ,int size){
		
	    if(size==0) {
	    	
	
	    	return integerArr[size];
	    	
	    }
	    else{
	    	
	    	
	    	
	    	return integerArr[size]+Add(integerArr, size-1);
	  
	    
	    }
 
	}
	
}
