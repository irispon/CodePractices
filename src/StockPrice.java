
public class StockPrice {

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int second=0;
        int pivot = -1;
        
        for(int i =prices.length-1;i>=0;i--) {
        	
        	if(i==prices.length-1) {
        		
        		answer[i]=0;
        		
        		
        	}else {
        			
            	if(prices[i]>pivot) {
            		
            		answer[i]=1;
            		
            	}else {
            		
            		answer[i]=1+second;
            	
            	}
            	
            	second++;
        		
        	}

        	pivot = prices[i];
            
        }
        return answer;
    }
    
}
