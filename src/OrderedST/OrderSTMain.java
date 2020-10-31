package OrderedST;

import java.util.Iterator;

public class OrderSTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		OrderST<Character, Integer> st = new OrderST<>();
		st.put('B', 3);
		st.put('A', 5);
		st.put('E', 8);
		st.put('F', 1);
		st.put('R', 4);
		System.out.println("사이즈: "+st.size());//size 테스트
		System.out.println("get 테스트 A: "+st.get('A'));
		System.out.println("get 테스트 B: "+st.get('B'));
		System.out.println("get 테스트 F: "+st.get('F'));
		
		Iterator<Character> it = st.keys().iterator();
		System.out.println("이터레이터 테스트");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
			
		}
		
		st.delete('B');
		System.out.println("삭제  테스트");
		it = st.keys().iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
			
		}
		
		System.out.println("\n최대 삭제");
		st.deleteMax();
		it = st.keys().iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
			
		}
		
		System.out.println("\n최소 삭제");
		st.deleteMin();
		it = st.keys().iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
			
		}
		
	}

}
