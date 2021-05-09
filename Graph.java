import java.util.ArrayList;

public class Graph {

	  // A utility function to add an edge in an
    // undirected graph
	 private int numOfNodes;
	    private boolean directed;
	    private boolean weighted;
	    private float[][] matrix;

	    /*
	     This will allow us to safely add weighted graphs in our class since
	     we will be able to check whether an edge exists without relying
	     on specific special values (like 0)
	    */
	    private boolean[][] isSetMatrix;

	    public Graph(int numOfNodes, boolean directed, boolean weighted) {

	        this.directed = directed;
	        this.weighted = weighted;
	        this.numOfNodes = numOfNodes;

	        // Simply initializes our adjacency matrix to the appropriate size
	        matrix = new float[numOfNodes][numOfNodes];
	        isSetMatrix = new boolean[numOfNodes][numOfNodes];
	    }
	    
	    public void addEdge(int source, int destination) {

	        int valueToAdd = 1;

	        if (weighted) {
	            valueToAdd = 0;
	        }

	        matrix[source][destination] = valueToAdd;
	        isSetMatrix[source][destination] = true;

	        if (!directed) {
	            matrix[destination][source] = valueToAdd;
	            isSetMatrix[destination][source] = true;
	        }
	    }
	   
	    
	 
	    public void printEdges() {
	        for (int i = 0; i < numOfNodes; i++) {
	            System.out.print("Node " + i + " is connected to: ");
	            for (int j = 0; j < numOfNodes; j++) {
	                if (isSetMatrix[i][j]) {
	                    System.out.print(j + " ");
	                }
	            }
	            System.out.println();
	        }
	    }
	    public boolean hasEdge(int source, int destination) {
	        return isSetMatrix[source][destination];
	    }

	    public Float getEdgeValue(int source, int destination) {
	        if (!weighted || !isSetMatrix[source][destination])
	            return null;
	        return matrix[source][destination];
	    }// ...
	}
 

