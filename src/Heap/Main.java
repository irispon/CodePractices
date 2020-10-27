package Heap;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinHeap<Integer> heap = new MinHeap<>();


		heap.insert(9);
		heap.insert(10);
		heap.insert(5);
		heap.insert(7);
		heap.insert(8);
		heap.insert(3);
		heap.insert(4);
	//	heap.delMin();
		System.out.print("Èü ±¸Á¶: ");
		for(int i:heap) 
		{
			System.out.print(i+" ");
		}

		System.out.println("\n\ndelMin ½ÇÇà");
		System.out.println(heap.delMin());
		System.out.println(heap.delMin());
		System.out.println(heap.delMin());
		System.out.println(heap.delMin());
		System.out.println(heap.delMin());
		System.out.println(heap.delMin());
		System.out.println(heap.delMin());
	}

}
