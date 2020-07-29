import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

//https://programmers.co.kr/learn/courses/30/lessons/42588?language=java
public class TranssMissionTower {
	
    public int[] solution(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> answerList = new ArrayList<>();
        
        for(int i =0;i<heights.length;i++) {
        	stack.push(heights[i]);
            	
        }
              
      
        for(int i=heights.length-1;i>=0;i--) {
        	int pivot = stack.pop();
        	if(i!=0) {
        		
            	for(int j=stack.size()-1;j>=0;j--) {
            		if(pivot<heights[j]) {
            			
            			answerList.add(j+1);
            			break;
            		}else if(j==0) {
            			
            			answerList.add(0);
            			break;
            		}
        		
        	}
	
        	}else {
        		
        		answerList.add(0);
        		
        	}
        	
        }
        
        Collections.reverse(answerList);
        int[] answer = answerList.stream().mapToInt(i->i).toArray();

       for(int i=0;i<answer.length;i++) {
    	   System.out.print(answer[i]+" ");
       }
        return answer;
    }
    
}
