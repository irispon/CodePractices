
import java.util.Arrays;
import java.util.HashMap;

public class Marathon {

//https://programmers.co.kr/learn/courses/30/lessons/42576?language=java
	
    public String FirstSolution(String[] participant, String[] completion) {
    	Arrays.sort(participant);
    	Arrays.sort(completion);
     
        
        for(int i =0;i<participant.length-1;i++){
           if(!participant[i].equals(completion[i])) {
        	   
        	   return participant[i];
           }
        	
        }
   
        return participant[participant.length-1];
    }
	
    
    public String OtherSolution(String[] participant, String[] completion) {
    	
    	HashMap<String,Integer> hash = new HashMap<>();
    	
    	
    	for(int i =0;i<completion.length;i++) {
    		
    		hash.put(completion[i],hash.getOrDefault(completion[i], 0)+1 );
    	}
     

    	for(int i =0;i<participant.length;i++) {
    		
				try {
							
						hash.put(participant[i], hash.get(participant[i])-1);
						if(hash.get(participant[i])<0)return participant[i];
	    						
					}
				catch (Exception e) 
				{
					return participant[i];
					
				}
	
    	}
    	
        	
    	return "";

    }
}
	

