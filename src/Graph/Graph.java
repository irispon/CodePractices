package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
	private int V;
	//private List<Integer>[] adj;
	private Map<Integer, List<Integer>> adj;//������ Graph�� ������ ���ڷ� �����־ �ణ ����ý��ϴ�.
	private int E=0;
	
	/*
	public Graph(int V) 
	{
		
		this.V= V;
		adj =new List[V];
		for(int v=0;v<V;v++) {
			adj[v] = new ArrayList<Integer>();
		}
	}
	 */
	public Graph() 
	{
		adj= new HashMap<>();
		V=0;
		
	}
	
	void addEdge(int v, int w)
	{
		if(!adj.containsKey(v)) 
		{
			//v ��尡 ������ v��� ����
			adj.put(v, new ArrayList<Integer>());
			V++;
		}
		if(!adj.containsKey(w)) 
		{
			//w ��尡 ������ w��� ����
			adj.put(w, new ArrayList<Integer>());
			V++;
		}
		adj.get(v).add(w);
		adj.get(w).add(v);
		E++;
	}//���߿� delete �߰��� ������ ��
	
	
	Iterable<Integer> adj(int v){
		
		return adj.get(v);
	}
	
	int V() //vertex ����
	{
		return V;
	}
	int E()//edge ���� 
	{
		E=0;
		for(List<Integer> list :adj.values()) {
			E+=list.size();
		}
		return E/2;
	}
	
	/*�� ����� ����(degree)�� �ش� ��忡 ����� ������ ��(Ȥ�� ���� ����ġ�� ��).*/
	public static int degree(Graph G,int v) //�־��� ������ ����
	{
		int degree = 0;
		for(int w:G.adj(v)) degree++;
		return degree;
		
	}
	public static int maxDegree(Graph G) //�ִ� ����
	{
		int max = 0;
		for(int v =0; v<G.V(); v++) {
			if(degree(G,v)>max) {
				max = degree(G,v);
			}
		}
		return max;
	}

	public static double averageDegree(Graph G)//��� ����
	{
		return 2.0*G.E()/G.V();
	}
	public static int numberOfSelfLoops(Graph G) //��ȯ�Ǵ� �׷��� ����.(�ڱ� �ڽ����� ���ƿ��� ��)
	{
		int count =0;
		for(int v=0;v<G.V();v++) {
			for(int w:G.adj(v)) {
				if(v==w) count++;
			}
		}
		return count/2;//1=>0 0=>1 �ι� �����۱� ������ 2�� ����.
	}
	public String toString() {
		String s =V+" vertices,"+E()+"edges\n";
		for(int v=0;v<V;v++) 
		{
			s+=v+": ";
			for(int w:this.adj(v))
				s+=w+" ";
			s+="\n";
		}
		return s;
		//���߿� ��Ʈ������ ���°� ���� ��
	}
	
	//. search �ʿ�?
}
