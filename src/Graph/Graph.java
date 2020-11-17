package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
	private int V;
	//private List<Integer>[] adj;
	private Map<Integer, List<Integer>> adj;//기존의 Graph가 고정된 숫자로 닫혀있어서 약간 열어봤습니다.
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
			//v 노드가 없으면 v노드 생성
			adj.put(v, new ArrayList<Integer>());
			V++;
		}
		if(!adj.containsKey(w)) 
		{
			//w 노드가 없으면 w노드 생성
			adj.put(w, new ArrayList<Integer>());
			V++;
		}
		adj.get(v).add(w);
		adj.get(w).add(v);
		E++;
	}//나중에 delete 추가도 괜찮을 듯
	
	
	Iterable<Integer> adj(int v){
		
		return adj.get(v);
	}
	
	int V() //vertex 숫자
	{
		return V;
	}
	int E()//edge 숫자 
	{
		E=0;
		for(List<Integer> list :adj.values()) {
			E+=list.size();
		}
		return E/2;
	}
	
	/*한 노드의 차수(degree)란 해당 노드에 연결된 엣지의 수(혹은 엣지 가중치의 합).*/
	public static int degree(Graph G,int v) //주어진 정점의 차수
	{
		int degree = 0;
		for(int w:G.adj(v)) degree++;
		return degree;
		
	}
	public static int maxDegree(Graph G) //최대 차수
	{
		int max = 0;
		for(int v =0; v<G.V(); v++) {
			if(degree(G,v)>max) {
				max = degree(G,v);
			}
		}
		return max;
	}

	public static double averageDegree(Graph G)//평균 차수
	{
		return 2.0*G.E()/G.V();
	}
	public static int numberOfSelfLoops(Graph G) //순환되는 그래프 차수.(자기 자신으로 돌아오는 거)
	{
		int count =0;
		for(int v=0;v<G.V();v++) {
			for(int w:G.adj(v)) {
				if(v==w) count++;
			}
		}
		return count/2;//1=>0 0=>1 두번 가느앟기 때문에 2로 나눔.
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
		//나중에 스트링빌더 쓰는게 좋을 듯
	}
	
	//. search 필요?
}
