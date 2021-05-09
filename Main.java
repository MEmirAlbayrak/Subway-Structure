import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		DLinkedList M1 = new DLinkedList();
		
		DLinkedList M2 = new DLinkedList();
		
		
		
		M1.append("KÝRAZLI");
		M1.push("BAÐCILAR");
		M1.push("ATAÞEHÝR");
		M1.push("BEÞÝKTAÞ ");
		M1.push("ARNAVUTKÖY");
		M1.printlist(M1.head);
		
	       int V = 5;
	        ArrayList<ArrayList<Integer> > adj
	                    = new ArrayList<ArrayList<Integer> >(V);
	         
	        for (int i = 0; i < V; i++)
	            adj.add(new ArrayList<Integer>());
	 
	        // Adding edges one by one
	        Graph.addEdge(adj, 0, 1);
	        Graph.addEdge(adj, 0, 4);
	        Graph.addEdge(adj, 1, 2);
	        Graph.addEdge(adj, 1, 3);
	        Graph.addEdge(adj, 1, 4);
	        Graph.addEdge(adj, 2, 3);
	        Graph.addEdge(adj, 3, 4);
	         
	        Graph.printGraph(adj);
		
<<<<<<< Updated upstream
		dlist.append("USKUDAR");
		dlist.push("KADIKIY");
		dlist.push("ATASEHIR");
		dlist.push("BESIKTAS ");
		dlist.push("ARNAVUTKOY");
		dlist.printlist(dlist.head);
=======
>>>>>>> Stashed changes
		
		

	}

}
