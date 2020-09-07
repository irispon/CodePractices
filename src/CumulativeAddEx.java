
public class CumulativeAddEx {


	
	public static void Change(int[]integerArr) {
		
		int[] memory = new int[integerArr.length];
		
		memory[0] = integerArr[0];
		for(int i =0; i<integerArr.length;i++) {
			
			integerArr[i]= Add(integerArr,memory, i);
			
		}
	}
		
		 static int Add(int[] integerArr,int[] memory, int size){
				
			    if(size>0) {
			    	
			
			    	memory[size]=integerArr[size]+memory[size-1];
			    	
			    }
			 	    	
			    			    	
			    	return memory[size];
			      
		 
			}
	
}
