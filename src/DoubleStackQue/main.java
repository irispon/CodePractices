package DoubleStackQue;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleStackQueFirst<Integer> queFirst = new DoubleStackQueFirst<>();
		
		queFirst.Enque(1);
		queFirst.Enque(2);
		queFirst.Enque(3);
		queFirst.Enque(4);
		
		System.out.println(queFirst.Deque());
		System.out.println(queFirst.Deque());
		System.out.println(queFirst.Deque());
		System.out.println(queFirst.Deque());
	}

}
