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
			System.out.println("��ȸ Ȯ��: "+key);
		}
		System.out.println("�ּ�Ű "+bst.Minimum()+"  "+ "�ִ�Ű "+bst.Maximum());
		System.out.println("C value ã��: "+bst.get('C'));

		System.out.println("E ���� ");
		bst.delete('E');
	
		for(char key:bst.keys()) {
			System.out.println("��ȸ Ȯ��: "+key);
		}
		
		System.out.println("Floor Ȯ�� �Է� G: "+bst.Floor('G'));
		System.out.println("Celling Ȯ�� �Է� G: "+bst.Ceiling('G'));
	}

}
