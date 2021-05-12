import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Dijkstras {

	public static DijkstrasGraph g = new DijkstrasGraph();

	public static void addGraph(){
		g.addVertex('1', Arrays.asList(new Vertex('2', 1), new Vertex('3', 1)));
		g.addVertex('2', Arrays.asList(new Vertex('1', 1), new Vertex('6', 1), new Vertex('7', 1)));
		g.addVertex('3', Arrays.asList(new Vertex('1', 1), new Vertex('7', 1)));
		g.addVertex('4', Arrays.asList());
		g.addVertex('5', Arrays.asList());
		g.addVertex('6', Arrays.asList(new Vertex('2', 1)));
		g.addVertex('7', Arrays.asList(new Vertex('2', 1), new Vertex('3', 1)));
	}
	public static void LineCR(){

		addGraph();
		Scanner scn = new Scanner(System.in);
		Character[] lines = {'1','2','3','6','7'};
		//boolean correction = false;
		Character start = 'a';
		Character end = 'b';
		//while(!correction){
			System.out.println("Enter Start Line:");
			start = scn.next().charAt(1);
			System.out.println("Enter Finish Line:");
			end = scn.next().charAt(1);
		//	correction = true;
		//}

		// for(int i=1; i<5; i++){
		// 	if(start != lines[i] || end != lines[i]){
		// 		System.out.println("Please input valid lines.");
		// 		correction = false;
		// 		break;
		// 	}
		// }

		/////////Tekrarlanıcak

		ArrayList<Character> shortestPath = new ArrayList<Character>();
		for (int i = 0; i < g.getShortestPath(end, start).size(); i++) {
			shortestPath.add(g.getShortestPath(end, start).get(i));
		}
		shortestPath.add(end);
		//System.out.println("Size of AL: " + shortestPath.size());
		for (int i = 0; i < shortestPath.size(); i++) {
			System.out.print("M"+ shortestPath.get(i));
			if(shortestPath.size() != i+1)
			System.out.print(" -> ");
		}

	
		System.out.println("\n\nChange line in this stations: \n");


		for (int i = 0; i < shortestPath.size(); i++) {
			if(shortestPath.size() != i+1){
				if(shortestPath.get(i)=='1' && shortestPath.get(i+1) == '2'
				|| 	shortestPath.get(i)=='2' && shortestPath.get(i+1) == '1'){
					System.out.println("Yenikapi M1<=>M2");
				}
				else if(shortestPath.get(i)=='1' && shortestPath.get(i+1) == '3'
				|| shortestPath.get(i)=='3' && shortestPath.get(i+1) == '1'){
					System.out.println("Kirazli-Bagcilar M1<=>M3");
				}
				else if(shortestPath.get(i)=='2' && shortestPath.get(i+1) == '6'
				||	shortestPath.get(i)=='6' && shortestPath.get(i+1) == '2'){
					System.out.println("4 Levent M2<=>M6");

				}
				else if(shortestPath.get(i)=='2' && shortestPath.get(i+1) == '7'
				|| shortestPath.get(i)=='7' && shortestPath.get(i+1) == '2'){
					System.out.println("Sisli-Mecidiyekoy  M2<=>M7");	
				}
				else if(shortestPath.get(i)=='3' && shortestPath.get(i+1) == '7'
				|| shortestPath.get(i)=='7' && shortestPath.get(i+1) == '3'){
					System.out.println("Mahmutbey M3<=>M7");
				}
				if(shortestPath.size() != i+2){
					System.out.println("    |\n    v");
				}
			}
		}
		
	}
	
	public static void StopCR(String startingStation , String finalStation , Character start, Character end){
		
		addGraph();

		ArrayList<Character> shortestPath = new ArrayList<Character>();
		for (int i = 0; i < g.getShortestPath(end, start).size(); i++) {
			shortestPath.add(g.getShortestPath(end, start).get(i));
		}
		shortestPath.add(end);
		//System.out.println("Size of AL: " + shortestPath.size());
		for (int i = 0; i < shortestPath.size(); i++) {
			System.out.print("M"+ shortestPath.get(i));
			if(shortestPath.size() != i+1)
			System.out.print(" -> ");
		}

		System.out.println("\n" + startingStation );
		System.out.println("    |\n    v");
		for (int i = 0; i < shortestPath.size(); i++) {
			if(shortestPath.size() != i+1){
				if(shortestPath.get(i)=='1' && shortestPath.get(i+1) == '2'
				|| 	shortestPath.get(i)=='2' && shortestPath.get(i+1) == '1'){
					System.out.println("Line change station go to Yenikapi " + shortestPath.get(i) + "=>"+ shortestPath.get(i+1));
				}
				else if(shortestPath.get(i)=='1' && shortestPath.get(i+1) == '3'
				|| shortestPath.get(i)=='3' && shortestPath.get(i+1) == '1'){
					System.out.println("Line change station go to Kirazli-Bagcilar " + shortestPath.get(i) + "=>"+ shortestPath.get(i+1));
				}
				else if(shortestPath.get(i)=='2' && shortestPath.get(i+1) == '6'
				||	shortestPath.get(i)=='6' && shortestPath.get(i+1) == '2'){
					System.out.println("Line change station go to 4 Levent " + shortestPath.get(i) + "=>"+ shortestPath.get(i+1));

				}
				else if(shortestPath.get(i)=='2' && shortestPath.get(i+1) == '7'
				|| shortestPath.get(i)=='7' && shortestPath.get(i+1) == '2'){
					System.out.println("Line change station go to Sisli-Mecidiyekoy " + shortestPath.get(i) + "=>"+ shortestPath.get(i+1));	
				}
				else if(shortestPath.get(i)=='3' && shortestPath.get(i+1) == '7'
				|| shortestPath.get(i)=='7' && shortestPath.get(i+1) == '3'){
					System.out.println("Line change station go to Mahmutbey " + shortestPath.get(i) + "=>"+ shortestPath.get(i+1));
				}
				
				System.out.println("    |\n    v");
				
			}
		}
		System.out.println("Your final station is " + finalStation); 
		//printCR(start, end);
	}

	//Not sure if i use
	// public static void printCR(Character start, Character end){
	// 
	// }
}

class Vertex implements Comparable<Vertex> {
	
	private Character id;
	private Integer distance;
	
	public Vertex(Character id, Integer distance) {
		super();
		this.id = id;
		this.distance = distance;
	}

	public Character getId() {
		return id;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setId(Character id) {
		this.id = id;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((distance == null) ? 0 : distance.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertex other = (Vertex) obj;
		if (distance == null) {
			if (other.distance != null)
				return false;
		} else if (!distance.equals(other.distance))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vertex [id=" + id + ", distance=" + distance + "]";
	}

	@Override
	public int compareTo(Vertex o) {
		if (this.distance < o.distance)
			return -1;
		else if (this.distance > o.distance)
			return 1;
		else
			return this.getId().compareTo(o.getId());
	}
	
}

class DijkstrasGraph {
	
	private final Map<Character, List<Vertex>> vertices;
	
	public DijkstrasGraph() {
		this.vertices = new HashMap<Character, List<Vertex>>();
	}
	
	public void addVertex(Character character, List<Vertex> vertex) {
		this.vertices.put(character, vertex);
	}
	
	public List<Character> getShortestPath(Character start, Character finish) {
		final Map<Character, Integer> distances = new HashMap<Character, Integer>();
		final Map<Character, Vertex> previous = new HashMap<Character, Vertex>();
		PriorityQueue<Vertex> nodes = new PriorityQueue<Vertex>();
		
		for(Character vertex : vertices.keySet()) {
			if (vertex == start) {
				distances.put(vertex, 0);
				nodes.add(new Vertex(vertex, 0));
			} else {
				distances.put(vertex, Integer.MAX_VALUE);
				nodes.add(new Vertex(vertex, Integer.MAX_VALUE));
			}
			previous.put(vertex, null);
		}
		
		while (!nodes.isEmpty()) {
			Vertex smallest = nodes.poll();
			if (smallest.getId() == finish) {
				final List<Character> path = new ArrayList<Character>();
				while (previous.get(smallest.getId()) != null) {
					path.add(smallest.getId());
					smallest = previous.get(smallest.getId());
				}
				return path;
			}

			if (distances.get(smallest.getId()) == Integer.MAX_VALUE) {
				break;
			}
						
			for (Vertex neighbor : vertices.get(smallest.getId())) {
				Integer alt = distances.get(smallest.getId()) + neighbor.getDistance();
				if (alt < distances.get(neighbor.getId())) {
					distances.put(neighbor.getId(), alt);
					previous.put(neighbor.getId(), smallest);
					
					forloop:
					for(Vertex n : nodes) {
						if (n.getId() == neighbor.getId()) {
							nodes.remove(n);
							n.setDistance(alt);
							nodes.add(n);
							break forloop;
						}
					}
				}
			}
		}
		
		return new ArrayList<Character>(distances.keySet());
	}
	
}