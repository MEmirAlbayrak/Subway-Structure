import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

	public static DLinkedList M1 = addingStations.M1;
	public static DLinkedList M2 = addingStations.M2;
	public static DLinkedList M3 = addingStations.M3;
	public static DLinkedList M4 = addingStations.M4;
	public static DLinkedList M5 = addingStations.M5;
	public static DLinkedList M6 = addingStations.M6;
	public static DLinkedList M7 = addingStations.M7;

	public static void main(String[] args) {

		ProgramCommandsActivator();

		Graph graph = new Graph(8, false, true);
           
		graph.addEdge(1, 2,1);
        graph.addEdge(1, 3,1);
        graph.addEdge(2, 7,1);
        graph.addEdge(2, 6,1); 
        graph.addEdge(3, 7,1);
		
	}
	public static void ProgramCommandsActivator(){
		long start = System.currentTimeMillis();
	    while(true) {
	    	System.out.println(" ");
	    	Introduction();
	    	String inputString = GetInput();
	    	
	    	switch(inputString.toLowerCase()) {
	    	case "e":
			case "exit":
				long end = System.currentTimeMillis();
				NumberFormat formatter = new DecimalFormat("#0.00000");
				System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
				System.exit(0);
				break;
	    	case "lls":
	    		ListLineStops();
	    		break;
	    	case "stops":
	    		Stops();
	    		break;
	    	case "lines":
	    		Lines();
	    		break;
	    	case "ss":
	    		subwayStop();
				break;
			case "cr":
				ClosestRoute();
				break;
	    	}
	    }
	}
	public static void Lines() {
		for(int i =0; i< 7;i++) {
	    	 
	    	 System.out.println("M"+(i+1) + " - Active");
		}
	}
	public static void Stops() {
		
		DLinkedList[] MLists = {M1,M2,M3,M4,M5,M6,M7};
     for(int i =0; i< 7;i++) {
    	 
    	 System.out.println("M"+(i+1) + " :");
    	  MLists[i].printlist(MLists[i].head);
     }
    
	}
	public static void Introduction() {
		try
		{
		    Thread.sleep(800);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		System.out.println("LLS - You can write line name to the console to see the subway line you want.");
		System.out.println("Stops - You can list all stops.");
		System.out.println("Lines - You can list lines in operation.");
		System.out.println("SS - If you write any subway stops,you can see which line they are in.");
		System.out.println("CR - Found closest route. Have 2 mods lines and stops");
	}
	public static void printMX(DLinkedList mx) {
		
		mx.printlist(mx.head);
	   
	}	
	public static void ListLineStops() {
		
		
		System.out.println("Enter a line name :  ");
		String lineName = GetInput();	
	  
		switch(lineName.toLowerCase()) {
		case "e" : 
			break;
    	case "m1" : 
    		printMX(M1);
    		break;
    	case "m2":
    		printMX(M2);
    		break;
    	case "m3":
    		printMX(M3);
    		break;
    	case "m4":
    		printMX(M4);
    		break;
    	case "m5":
    		printMX(M5);
    		break;
    	case "m6":
    		printMX(M6);
    		break;
    	case "m7":
    		printMX(M7);
    		break;
    	default :
    		System.out.println("Invalid input, try again or write 'e' to exit.");
    		ListLineStops();
    		break;
    	}
	}
	public static void subwayStop() {
		
		System.out.println("Enter a subway stop name : ");
		DLinkedList[] MLists = {M1,M2,M3,M4,M5,M6,M7};
		String subwayStop = GetInput();
		

	    for(int i =0; i< 7;i++) {	  
	    	if(DLinkedList.search(MLists[i].head, subwayStop)) {	
	    		System.out.println(subwayStop + " Found in M" +(i+1));
				break;
	    	}
			else if(i == 6 && DLinkedList.search(MLists[i].head, subwayStop) == false){
				System.out.println(subwayStop + " not found in any lines");
				break;

			}
	     }
	}
	public static void ClosestRoute(){
		
		System.out.println("Chose Mode stops or lines: ");
		String whichTypeSearch = GetInput();
		if(whichTypeSearch.equals("stops")){
			System.out.println("Enter a starting subway stop name : ");
			DLinkedList[] MLists = {M1,M2,M3,M4,M5,M6,M7};
			String startSubwayStop = GetInput();
			System.out.println("Enter a starting subway stop name : ");
			String stopSubwayStop = GetInput();
			String start = " ", end = " ";
	    	for(int i =0; i< 7;i++) {	  
				System.out.println(i);   	
	    		if(DLinkedList.search(MLists[i].head, startSubwayStop)) {	
	    			System.out.println(startSubwayStop + " Found in M" +(i+1));
					start = Integer.toString(i+1);
					break;
	    		}
				else if(i == 6 && DLinkedList.search(MLists[i].head, startSubwayStop) == false){
					System.out.println(startSubwayStop + " not found in any lines");
					break;
				}
	    	}
			for(int i =0; i< 7;i++) {	
			 	if(DLinkedList.search(MLists[i].head, stopSubwayStop)) {	
					System.out.println(stopSubwayStop + " Found in M" +(i+1));
					end = Integer.toString(i+1);
					break;
				}
				else if(i == 6 && DLinkedList.search(MLists[i].head, stopSubwayStop) == false){
					System.out.println(stopSubwayStop + " not found in any lines");
					break;
				}
			}
			Dijkstras.StopCR(startSubwayStop, stopSubwayStop, start.charAt(0) , end.charAt(0));
		}
		else if(whichTypeSearch.equals("line")){
			Dijkstras.LineCR();
		}
	}
	public static String GetInput(){

		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		return inputString;
	}

	
}
