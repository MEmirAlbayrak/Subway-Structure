import java.util.ArrayList;
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
		M1.push("Davutpaşa-YTÜ");
		M1.push("Terazidere");
		M1.push("Kirazlı-Bağcılar M1/M3");
		M1.push("Bağcılar Meydan");
		M1.push("Üçyüzlü");
		M1.push("Menderes");
		M1.push("Esenler");
		M1.push("Otogar");
		M1.push("Kocatepe");
		M1.push("Sağmalcılar");
		M1.push("Bayrampaşa-Maltepe");
		M1.push("Topkapı-Ulubatlı");
		M1.push("Emniyet-Fatih");
		M1.push("Aksaray");
		M1.push("Yenikapi M1/M2");

		M2.append("Yenikapi M1/M2");
		M2.push("Sehzadebası");
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
		M2.push("Hacıosman");
		
		M3.append("Başakşehir-Metrokent");
		M3.push("Başak Konutları");
		M3.push("Siteler");
		M3.push("Turgut Özal");
		M3.push("Ikitelli Sanayi");
		M3.push("ISTOÇ");
		M3.push("Mahmutbey M3/M7");
		M3.push("Yenimahalle");
		M3.push("Kirazlı-Bağcılar M1/M3");
		M3.push("Ziya Gökalp Mahallesi");
		M3.push("Olimpiyat");

		M4.append("Kadıköy");
		M4.push("Ayrılık Çeşmesi");
		M4.push("Acıbadem");
		M4.push("Ünalan");
		M4.push("Göztepe");
		M4.push("Yenisahra");
		M4.push("Kozyatağı");
		M4.push("Bostancı");
		M4.push("Küçükyalı");
		M4.push("Maltepe");
		M4.push("Huzurevi");
		M4.push("Gülsuyu");
		M4.push("Esenkent");
		M4.push("Hastane-Adliye");
		M4.push("Soğanlık");
		M4.push("Kartal");
		M4.push("Yakacık-Adnan Kahveci");
		M4.push("Pendik");
		M4.push("Tavşantepe");

		M5.append("Üsküdar");
		M5.push("Fıstıkağacı");
		M5.push("Bağlarbaşı");
		M5.push("Altunizade");
		M5.push("Kısıklı");
		M5.push("Bulgurlu");
		M5.push("Ümraniye");
		M5.push("Çarşı");
		M5.push("Yamanevler");
		M5.push("Çakmak");
		M5.push("Ihlamurkuyu");
		M5.push("Altınşehir");
		M5.push("İmam Hatip Lisesi");
		M5.push("Dudullu");
		M5.push("Necip Fazıl");
		M5.push("Çekmeköy");
		

		M6.append("Levent M2/M6");
		M6.push("Nispetiye");
		M6.push("Etiler");
		M6.push("Boğaziçi Ü.-Hisarüstü");
		
		M7.append("Sisli-Mecidiyekoy  M2/M7");
		M7.push("Çağlayan");
		M7.push("Kağıthane");
		M7.push("Nurtepe");
		M7.push("Alibeyköy");
		M7.push("Çırçır");
		M7.push("Veysel Karani-Akşemsettin");
		M7.push("Yeşilpınar");
		M7.push("Kazım Karabekir");
		M7.push("Yenimahalle");
		M7.push("Karadeniz Mahallesi");
		M7.push("Tekstilkent-Giyimkent");
		M7.push("Oruç Reis");
		M7.push("Göztepe Mahallesi");
		M7.push("Mahmutbey M3/M7");




		Graph graph = new Graph(8, false, true);
           
		graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 7);
        graph.addEdge(2, 6); // The default weight is 0 if weighted == true
        graph.addEdge(3, 7);
        

        /*System.out.println();
        System.out.println();

        graph.printEdges();
        System.out.println();
        System.out.println("Does an edge from 1 to 6 exist?");
        if (graph.hasEdge(1,6)) {
            System.out.println("Yes");
        }
        else System.out.println("No");
        */
	    
	     
	    Scanner scn = new Scanner(System.in);
	    while(true) {
	    	System.out.println(" ");
	    	Introduction();
	    	String inputString = scn.nextLine();
	    	
	    	switch(inputString.toLowerCase()) {
	    	
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
	    		
	    	
	    	}
	    }
		
	
	}
	public static void Lines() {
		for(int i =0; i< 7;i++) {
	    	 
	    	 System.out.println("M"+(i+1) + " ");
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
		System.out.println("LLS - You can write line name to the console to see the subway line you want.");
		System.out.println("Stops - You can list all stops.");
		System.out.println("Lines - You can list lines in operation.");
		System.out.println("SS - If you write any subway stops,you can see which line they are in.");
	}
	public static void printMX(DLinkedList mx) {
		
		mx.printlist(mx.head);
	   
	}
	
	public static void ListLineStops() {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a line name :  ");
		String lineName = scn.nextLine();
		
	  
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
		Scanner scner = new Scanner(System.in);
		
		
		String subwayStop = scner.next();
			
		
	     for(int i =0; i< 7;i++) {
	    	 
	    	
	    	if(DLinkedList.search(MLists[i].head, subwayStop)) {
	    		
	    		System.out.println(subwayStop + "Found in " + MLists[i].toString());
	    	}
	    	
	     }
	    
		
	}

}
