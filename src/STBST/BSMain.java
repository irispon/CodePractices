package STBST;

public class BSMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree<Character, Integer> bst =new BinarySearchTree<>();
		bst.put('A', 2);
		bst.put('B', 8);
		bst.put('E', 8);
		bst.put('C', 8);
		bst.put('K', 8);
		for(char key:bst.keys()) {
			System.out.println("순회 확인: "+key);
		}
		System.out.println("최소키 "+bst.Minimum()+"  "+ "최대키 "+bst.Maximum());
		System.out.println("C value 찾기: "+bst.get('C'));

		System.out.println("E 삭제 ");
		bst.delete('E');
	
		for(char key:bst.keys()) {
			System.out.println("순회 확인: "+key);
		}
		
		System.out.println("Floor 확인 입력 G: "+bst.Floor('G'));
		System.out.println("Celling 확인 입력 G: "+bst.Ceiling('G'));
	}

}
