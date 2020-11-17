package Graph;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GraphMain {

	public static void main(String[] args) {
		
		String[] split;
		
		Graph graph = Text2Graph.Make("tinyG.txt");//Text=> Graph
		
		System.out.println("\n"+graph.toString());
		DepthFirstPaths paths = new DepthFirstPaths(graph, 0);
		
		System.out.println("edgeTo 확인");
		int count =0;
		for(int i:paths.edgeTo) 
		{
			System.out.println("node"+count+": "+i);
			count++;
		}
		System.out.println("PathTo 4 확인");

		for(int i:paths.pathTo(4)) {
			System.out.print(" => "+i);
			
		}
		
		
	}


}
