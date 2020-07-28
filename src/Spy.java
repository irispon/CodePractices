import java.util.*;
public class Spy {

//https://programmers.co.kr/learn/courses/30/lessons/42578
    public int solution(String[][] clothes) {

    	HashMap<String, Integer> map;
    	map = new HashMap<>();
    	
    	System.out.println("clothes"+clothes.length);
       for(int i =0;i<clothes.length;i++) {
    	  
    	   map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);
    	   
       }
       
       int answer = 1;
       
       for(String key:map.keySet()) {
    	   
    	   answer*=map.get(key)+1;
    	   
       }
       answer-=1;

    	
        return answer;
    }
    

    
}
