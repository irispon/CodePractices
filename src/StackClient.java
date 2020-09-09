
import java.util.Iterator;

import WonDataStructures.*;

public class StackClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WStack<String> stack = new WStack<>();
		
		System.out.println("isEmpty? "+stack.isEmpty());
		
		stack.push("test");
		stack.push("my");
		stack.push("stack");
		stack.push("haha");
	
		System.out.println("PoP : "+stack.pop());
		
		System.out.println("isEmpty? "+stack.isEmpty());
		System.out.println("Size? "+stack.size());
		Iterator<String> iterator = stack.iterator();
		
		while( iterator.hasNext() )

		{

			System.out.println(iterator.next());

		}




		
		System.out.println(stack.pop());//에러 테스트

	}

}
