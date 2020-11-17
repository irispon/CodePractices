package Graph;
import WonDataStructures.WStack;

public class DepthFirstPaths
{
	boolean[] marked;
	int[] edgeTo;
	private int s;
	//dfs ���(��ŷ �� ���� �ٽ� �Ȱ�.), ���� �̿�? ���� ����.
	/*x���� ����. x���� ������ ��� üũ. ��ŷ�� �ȵǾ� ������ �ش� ���� �ű�� ������ ��� üũ �ݺ� */
	
	public DepthFirstPaths(Graph G, int s) {
	
		marked =  new boolean[G.V()];//��� �� ��ŭ ��ŷ.
		edgeTo=new int[G.E()];//���� �� ��ŭ �Ҵ�
		for(int i =0;i<edgeTo.length;i++) {
			edgeTo[i]=-1; //-1 �ʱ�ȭ
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
		WStack<Integer> stack = new WStack<>();//������ �����߾��� Stack.
		int node=v;
		for(;edgeTo[node]!=0;) 
		{
			if(edgeTo[node]==-1) {
				System.out.println("�߸��� �˻��Դϴ�."+node);
				return null; //�߸��� �˻�.
			}
			stack.push(node);//Z=>Y=>X
			node = edgeTo[node];
			stack.push(node);//�̵� ���� ��
		}
			stack.push(edgeTo[node]);//�� ���� ��(���� 0)
			
		//���۳�忡�� v������ ���� ��� ã��

		return stack;
	}
	private void dfs(Graph G,int v) {
		marked[v]= true;//���� ��� =true(��ŷ)
		for(int w:G.adj(v)) {
			if(!marked[w]) {//��ŷ�� �ȵǾ� ������.
				edgeTo[w]=v;//v=>w
				dfs(G,w);//w���� �ٽ� �ݺ�.
				
				
			}
		}
	}

}
