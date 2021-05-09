import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		DLinkedList M1B = new DLinkedList();
		
		DLinkedList M1A = new DLinkedList();
		
		
		
		M1B.append("BAGCILAR");
		M1B.push("BAGCILAR MEYDAN");
		M1B.push("UCYUZLU");
		M1B.push("MENDERES ");
		M1B.push("ESENLER");
		M1B.push("OTOGAR M1A/M1B");
		M1B.push("KOCATEPE");
		M1B.push("SAGMALCILAR");
		M1B.push("BAYRAMPASA-MALTEPE");
		M1B.push("TOPKAPI-ULUBATLI");
		M1B.push("EMNIYET-FATIH");
		M1B.push("AKSARAY");
		M1B.push("YENIKAPI");
		
		M1A.append("ATATURK HAVALIMANI");
		M1A.push("ATATURK HAVALIMANI");
		
		
		
		
		
		
		M1B.printlist(M1B.head);
		
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
