package STBST;

import java.util.*;

public class BinarySearchTree<Key extends Comparable<Key>,Value> {

	private Node root;
	
	private class Node{
	//	private Node parent;//추가
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
		if(cmp<0) x.left=put(x.left,key,val); //x.key가 더 클 때
		else if(cmp>0)x.right = put(x.right,key,val);  //x.key가 더 작을 때
		else if(cmp==0) x.val = val;//x.key 와 같을 때
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
		//순회.
		if(x==null) return;
		inorder(x.left, q);//재귀(왼쪽)
		q.add(x.key);//저장
		inorder(x.right, q);// 재귀(오른쪽=> 왼쪽) 
	}
	
	public void deleteMin() {
		root = deleteMin(root);
	}
	
	private Node deleteMin(Node x) {
		if(x.left==null) return x.right;
		x.left = deleteMin(x.left);//재귀.
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
		//바닥 함수 => 각 실수 이하의 최대 정수 => 주어진 벨류 안에서 최대 값.
		Node x = Floor(root,key);
		if(x==null) return null;
		
		return x.key;
	}
	
	private Node Floor(Node x,Key key) {

		if(x==null) return null;
		int cmp = key.compareTo(x.key);
		if(cmp==0) return x;
		if(cmp<0) return Floor(x.left,key);// key 값이 노드보다  작으면 left(작은쪽)으로 이동
		Node t = Floor(x.right,key); //조건을 찾았으면 해당 노드에서 큰 값(right) 찾기
		if(t!=null) return t;
		else return x;
	}
	public Key Ceiling (Key key) {
		//천장 함수 => 각 실수 이상의 최소 정수=>주어진 벨류 이후의 최소 값
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
			System.out.println("해당 노드는 찾을 수 없습니다.");
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
				//2개가 널이 아닌 경우.
			
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
