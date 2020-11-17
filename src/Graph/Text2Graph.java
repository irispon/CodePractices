package Graph;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Text2Graph {

	
	static String DEFAULTPATH =Text2Graph.class.getResource("").getPath();
	public static Graph Make(String Name) 
	{
		String[] split;
		Graph graph = new Graph();
		try(FileReader fr = new FileReader(Text2Graph.DEFAULTPATH+Name);
			    BufferedReader br = new BufferedReader(fr);){
			  String line = "";
			  int lineNum=0;
			  while((line = br.readLine()) != null) {
			    System.out.println(line); 
			    lineNum++;
			    split= line.split(" ");//string split
			    if(split.length==2) {
				   graph.addEdge(Integer.parseInt(split[0]), Integer.parseInt(split[1]));//�׷��� �߰�
			    }else {
			    	System.out.println("�׷��� ����� ���� �ʽ��ϴ�. ����: "+lineNum);
			    }
		
			  }
			} catch (FileNotFoundException e) {
			  e.printStackTrace();
			} catch (IOException e) {
			  e.printStackTrace();
			} catch (Exception e) {
				// TODO: handle exception
			  e.printStackTrace();//�Ƹ� parseInt ���� ������ �ַ� ���⼭ ���� ��.
			}
		
		return graph;
	}
}
