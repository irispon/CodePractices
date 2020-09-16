package DoubleStackQue;

import java.util.Stack;

public class DoubleStackQueFirst<E> {

	private Stack<E> enQueStack;
	private Stack<E> decQueStack;
	
	public DoubleStackQueFirst() {
		enQueStack = new Stack<>();
		decQueStack = new Stack<>();
		

	}
	
	public void Enque(E item) {
		
		enQueStack.push(item);
		
	}
	
	public E Deque() {
		
		

		if(decQueStack.empty()) {
			
		
			int size = enQueStack.size();
			for (int i=0; i<size;i++) {
			
				decQueStack.push(enQueStack.pop());
				
			}
			
			
		}
		
		return decQueStack.pop();
		
		
		
	}
	
}
