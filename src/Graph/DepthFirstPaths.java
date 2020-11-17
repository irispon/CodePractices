package Graph;
import WonDataStructures.WStack;

public class DepthFirstPaths
{
	boolean[] marked;
	int[] edgeTo;
	private int s;
	//dfs 재귀(마킹 된 곳을 다시 안감.), 스택 이용? 스택 형식.
	/*x에서 시작. x에서 인접한 노드 체크. 마킹이 안되어 있으면 해당 노드로 옮기고 인접한 노드 체크 반복 */
	
	public DepthFirstPaths(Graph G, int s) {
	
		marked =  new boolean[G.V()];//노드 수 만큼 마킹.
		edgeTo=new int[G.E()];//간선 수 만큼 할당
		for(int i =0;i<edgeTo.length;i++) {
			edgeTo[i]=-1; //-1 초기화
		}
		
		dfs(G,s);
	}
	
	boolean hasPathTo(int v) {
	
		if(edgeTo[v]==-1||edgeTo[v]==0) {
			return false;
		}
		return true;
	}
	
	Iterable<Integer> pathTo(int v)
	{
		WStack<Integer> stack = new WStack<>();//옛날에 구현했었던 Stack.
		int node=v;
		for(;edgeTo[node]!=0;) 
		{
			if(edgeTo[node]==-1) {
				System.out.println("잘못된 검색입니다."+node);
				return null; //잘못된 검색.
			}
			stack.push(node);//Z=>Y=>X
			node = edgeTo[node];
			stack.push(node);//이동 후의 값
		}
			stack.push(edgeTo[node]);//맨 위의 값(보통 0)
			
		//시작노드에서 v번으로 가는 노드 찾기

		return stack;
	}
	private void dfs(Graph G,int v) {
		marked[v]= true;//시작 노드 =true(마킹)
		for(int w:G.adj(v)) {
			if(!marked[w]) {//마킹이 안되어 있으면.
				edgeTo[w]=v;//v=>w
				dfs(G,w);//w에서 다시 반복.
				
				
			}
		}
	}

}
