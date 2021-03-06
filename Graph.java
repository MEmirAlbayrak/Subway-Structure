public class Graph {


		private int numOfNodes;
	    private boolean directed;
	    private boolean weighted;
	    private float[][] matrix;


	    private boolean[][] isSetMatrix;

	    public Graph(int numOfNodes, boolean directed, boolean weighted) {

	        this.directed = directed;
	        this.weighted = weighted;
	        this.numOfNodes = numOfNodes;

	        // Simply initializes our adjacency matrix to the appropriate size
	        matrix = new float[numOfNodes][numOfNodes];
	        isSetMatrix = new boolean[numOfNodes][numOfNodes];
	    }
	    
	    public void addEdge(int source, int destination, float weight) {

			float valueToAdd = weight;
		
			if (!weighted) {
				valueToAdd = 1;
			}
		
			matrix[source][destination] = valueToAdd;
			isSetMatrix[source][destination] = true;
		
			if (!directed) {
				matrix[destination][source] = valueToAdd;
				isSetMatrix[destination][source] = true;
			}
		}
	   
	    
	 
	    public void printEdges() {
	        for (int i = 1; i < numOfNodes; i++) {
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
	    }
	}
 

