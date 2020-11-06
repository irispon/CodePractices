package STBST;

import java.util.*;

public class BinarySearchTree<Key extends Comparable<Key>,Value> {

	private Node root;
	
	private class Node{
	//	private Node parent;//�߰�
		private Key key;
		private Value val;
		private Node left, right;
		private int count;
		public Node(Key key, Value val) {
			this.key = key;
			this.val = val;
		}

		
	}
	public void put(Key key,Value val) {
	//	System.out.println("put Key "+key);	
		root = put(root,key ,val);
//		System.out.println("put "+root.key);

	}
	private Node put(Node x, Key key, Value val) {
		
		if(x==null) 
		{
			return new Node(key,val);
		}
	//	System.out.println("put "+x.key);

		int cmp = key.compareTo(x.key);
		if(cmp<0) x.left=put(x.left,key,val); //x.key�� �� Ŭ ��
		else if(cmp>0)x.right = put(x.right,key,val);  //x.key�� �� ���� ��
		else if(cmp==0) x.val = val;//x.key �� ���� ��
		x.count =1+size(x.left)+size(x.right);

		
		return x;
	}
	
	private int size() {
		return size(root);
	}
	private int size(Node x) {
		if(x==null) return 0;
		return x.count;
	}
	public int rank(Key key) {
		return rank(key, root);
	}
	private  int rank(Key key,Node x) {
		if(x==null) return 0;
		int cmp =key.compareTo(x.key);
		if(cmp <0) return rank(key,x.left);
		else if(cmp>0)return 1+size(x.left)+rank(key,x.right);
		else if (cmp==0) return size(x.left);
		return -1;
	}
	public Value get(Key key) {
		Node x = root;
		while(x!=null) {
			int cmp = key.compareTo(x.key);
			if(cmp<0) x= x.left;
			else if(cmp>0) x= x.right;
			else if(cmp == 0) return x.val;
		}
		return null;
	}
	public Node getNode(Key key) {
		Node x = root;
		while(x!=null) {
			int cmp = key.compareTo(x.key);
			if(cmp<0) x= x.left;
			else if(cmp>0) x= x.right;
			else if(cmp == 0) return x;
		}
		return null;
	}
	
	public Iterable<Key> keys(){
		Queue<Key> q = new LinkedList<>();
		inorder(root,q);
		return q;
		
	}
	private void inorder(Node x, Queue<Key>q) {
		//��ȸ.
		if(x==null) return;
		inorder(x.left, q);//���(����)
		q.add(x.key);//����
		inorder(x.right, q);// ���(������=> ����) 
	}
	
	public void deleteMin() {
		root = deleteMin(root);
	}
	
	private Node deleteMin(Node x) {
		if(x.left==null) return x.right;
		x.left = deleteMin(x.left);//���.
		x.count =1+size(x.left)+size(x.right);
		return x;
	}
	public Key Maximum() {
		Node node=root;
		Value val=null;
		while(node.right!=null) {
			node = node.right;
		}
		return node.key;
	}
	
	public Key Minimum() {
		
		Node node=root;
		
		while(node.left!=null) {
			node = node.left;
		}
		return node.key;

	}
	public Node findMinNode(Node node) {
		
		
		Node tmp = node;
		while(node.left!=null) {
			tmp = node.left;
		}
		return tmp;

	}
	
	public Key Floor(Key key) {
		//�ٴ� �Լ� => �� �Ǽ� ������ �ִ� ���� => �־��� ���� �ȿ��� �ִ� ��.
		Node x = Floor(root,key);
		if(x==null) return null;
		
		return x.key;
	}
	
	private Node Floor(Node x,Key key) {

		if(x==null) return null;
		int cmp = key.compareTo(x.key);
		if(cmp==0) return x;
		if(cmp<0) return Floor(x.left,key);// key ���� ��庸��  ������ left(������)���� �̵�
		Node t = Floor(x.right,key); //������ ã������ �ش� ��忡�� ū ��(right) ã��
		if(t!=null) return t;
		else return x;
	}
	public Key Ceiling (Key key) {
		//õ�� �Լ� => �� �Ǽ� �̻��� �ּ� ����=>�־��� ���� ������ �ּ� ��
		Node x = Ceiling(root,key);
		if(x==null) return null;
		return x.key;
	}
	
	private Node Ceiling(Node x,Key key) {
	
		if(x==null) return null;
		int cmp = key.compareTo(x.key);
		if(cmp==0) return x;
		if(cmp>0) return Ceiling(x.right,key);
		Node t = Ceiling(x.left,key);
		if(t!=null) return t;
		else return x;
	}
	
	public void delete(Key key) {
		delete(root,key);

	}
	public Node delete(Node node,Key key) {
		Node tmp;
		if(getNode(key)==null) {
			System.out.println("�ش� ���� ã�� �� �����ϴ�.");
		}else if(node.key.compareTo(key)>0) {
			node.left=delete(node.left,key);
		}else if(node.key.compareTo(key)<0) {
			node.right =delete(node.right, key);
		}else {
			if(node.left!=null&&node.right!=null) {
				tmp = findMinNode(node.right);
				node.key =tmp.key;
				node.val =tmp.val;
				node.right = delete(node.right, tmp.key);
				//2���� ���� �ƴ� ���.
			
			}else{
				tmp = node;
				//
				if(node.left==null) {
					node = node.right;
				}else if(node.right==null) {
					node =node.left;
				}
				
			}
			
			
		}
		
		return node;
	}
	
}
