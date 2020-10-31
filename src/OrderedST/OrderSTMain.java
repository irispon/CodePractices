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
		System.out.println("������: "+st.size());//size �׽�Ʈ
		System.out.println("get �׽�Ʈ A: "+st.get('A'));
		System.out.println("get �׽�Ʈ B: "+st.get('B'));
		System.out.println("get �׽�Ʈ F: "+st.get('F'));
		
		Iterator<Character> it = st.keys().iterator();
		System.out.println("���ͷ����� �׽�Ʈ");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
			
		}
		
		st.delete('B');
		System.out.println("����  �׽�Ʈ");
		it = st.keys().iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
			
		}
		
		System.out.println("\n�ִ� ����");
		st.deleteMax();
		it = st.keys().iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
			
		}
		
		System.out.println("\n�ּ� ����");
		st.deleteMin();
		it = st.keys().iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
			
		}
		
	}

}
