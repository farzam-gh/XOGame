import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] in;
		int t=sc.nextInt();
		while(t>0){
		    int v=sc.nextInt();
		    int e=sc.nextInt();
		    in=new int[e*3];
		    for(int i=0;i<e*3;i++){
		        in[i]=sc.nextInt();
		    }//end of for i
		    solve(in,v,e);
		    t--;
		}//end of while
	}//end of main
	static void solve(int[] in,int v,int e){
	    Graph g=new Graph(v);
	    for(int i=0;i<e*3;i++){
	        g.addEdge(in[i],in[++i]);
	        g.vertices.get(i-2).weight=in[++i];
	    }//end of for i
	        for(Integer x:g.vertices)
	            System.out.println(g.vertices.get(x).id+" : "+
	            g.vertices.get(x).weight);
	}//end of solve
}//end

class Node{
    int id;
    int weight;
    HashSet<Integer> adj=new HashSet<>();
    Node(int id){
        this.id=id;
    }//end of constructor
    public void addEdge(int e){
        adj.add(e);
    }//end of addEdge
}//end of Node

class Graph{
   ArrayList<Integer>vertices=new ArrayList<>();
   Graph(int v){
      for(int i=0;i<v;i++)
        vertices.add(new Node(i));
   }//end of constructor
   public void addEdge(int s,int d){
       vertices.get(s).addEdge(d);
   }//end of addEdge
    
}//end of Graph