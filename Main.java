import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

	public static DLinkedList M1 = new DLinkedList();
	public static DLinkedList M2 = new DLinkedList();
	public static DLinkedList M3 = new DLinkedList();
	public static DLinkedList M4 = new DLinkedList();
	public static DLinkedList M5 = new DLinkedList();
	public static DLinkedList M6 = new DLinkedList();
	public static DLinkedList M7 = new DLinkedList();

	public static void main(String[] args) {

		M1.append("Ataturk Havalimani");
		M1.push("Istanbul Fuar Merkezi");
		M1.push("Yenibosna");
		M1.push("Atakoy-Sirinevler");
		M1.push("Bahcelievler");
		M1.push("Bakirkoy-Incirli");
		M1.push("Zeytinburnu");
		M1.push("Merter");
		M1.push("Davutpaşa-YTU");
		M1.push("Terazidere");
		M1.push("Kirazli-Bagcilar M1/M3");
		M1.push("Bagcilar Meydan");
		M1.push("Ucyuzlu");
		M1.push("Menderes");
		M1.push("Esenler");
		M1.push("Otogar");
		M1.push("Kocatepe");
		M1.push("Sagmalcilar");
		M1.push("Bayrampaşa-Maltepe");
		M1.push("Topkapi-Ulubatli");
		M1.push("Emniyet-Fatih");
		M1.push("Aksaray");
		M1.push("Yenikapi M1/M2");

		M2.append("Yenikapi M1/M2");
		M2.push("Sehzadebasi");
		M2.push("Halic");
		M2.push("Sishane");
		M2.push("Taksim");
		M2.push("Osmanbey");
		M2.push("Sisli-Mecidiyekoy M2/M7");
		M2.push("Gayrettepe");
		M2.push("4 Levent M2/M6");
		M2.push("Sanayi Mahallesi");
		M2.push("I.T.U - Ayazaga");
		M2.push("Ataturk Oto Sanayi");
		M2.push("Darussafaka");
		M2.push("Haciosman");
		
		M3.append("Başakşehir-Metrokent");
		M3.push("Başak Konutlari");
		M3.push("Siteler");
		M3.push("Turgut ozal");
		M3.push("Ikitelli Sanayi");
		M3.push("ISTOc");
		M3.push("Mahmutbey M3/M7");
		M3.push("Yenimahalle");
		M3.push("Kirazli-Bagcilar M1/M3");
		M3.push("Ziya Gokalp Mahallesi");
		M3.push("Olimpiyat");

		M4.append("Kadikoy");
		M4.push("Ayrilik ceşmesi");
		M4.push("Acibadem");
		M4.push("Unalan");
		M4.push("Goztepe");
		M4.push("Yenisahra");
		M4.push("Kozyatagi");
		M4.push("Bostanci");
		M4.push("Kucukyali");
		M4.push("Maltepe");
		M4.push("Huzurevi");
		M4.push("Gulsuyu");
		M4.push("Esenkent");
		M4.push("Hastane-Adliye");
		M4.push("Soganlik");
		M4.push("Kartal");
		M4.push("Yakacik-Adnan Kahveci");
		M4.push("Pendik");
		M4.push("Tavşantepe");

		M5.append("Uskudar");
		M5.push("Fistikagaci");
		M5.push("Baglarbaşi");
		M5.push("Altunizade");
		M5.push("Kisikli");
		M5.push("Bulgurlu");
		M5.push("umraniye");
		M5.push("carşi");
		M5.push("Yamanevler");
		M5.push("Cakmak");
		M5.push("Ihlamurkuyu");
		M5.push("Altinşehir");
		M5.push("Imam Hatip Lisesi");
		M5.push("Dudullu");
		M5.push("Necip Fazil");
		M5.push("Cekmekoy");
		

		M6.append("Levent M2/M6");
		M6.push("Nispetiye");
		M6.push("Etiler");
		M6.push("Bogazici U.- Hisarustu");
		
		M7.append("Sisli-Mecidiyekoy  M2/M7");
		M7.push("Caglayan");
		M7.push("Kagithane");
		M7.push("Nurtepe");
		M7.push("Alibeykoy");
		M7.push("Circir");
		M7.push("Veysel Karani-Akşemsettin");
		M7.push("Yeşilpinar");
		M7.push("Kazim Karabekir");
		M7.push("Yenimahalle");
		M7.push("Karadeniz Mahallesi");
		M7.push("Tekstilkent-Giyimkent");
		M7.push("Oruc Reis");
		M7.push("Goztepe Mahallesi");
		M7.push("Mahmutbey M3/M7");



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
