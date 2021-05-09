import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		DLinkedList M1A = new DLinkedList();
		DLinkedList M1B = new DLinkedList();
		DLinkedList M2 = new DLinkedList();
		DLinkedList M3 = new DLinkedList();
		DLinkedList M4 = new DLinkedList();
		DLinkedList M5 = new DLinkedList();
		DLinkedList M6 = new DLinkedList();
		DLinkedList M7 = new DLinkedList();
	
		
		M1B.append("Ataturk Havalimani");
		M1B.push("Istanbul Fuar Merkezi");
		M1B.push("Yenibosna");
		M1B.push("Atakoy-Sirinevler");
		M1B.push("Bahcelievler");
		M1B.push("Bakirkoy-Incirli");
		M1B.push("Zeytinburnu");
		M1B.push("Merter");
		M1B.push("Davutpaşa-YTÜ");
		M1B.push("Terazidere");
		M1B.push("Otogar");
		M1B.push("Kocatepe");
		M1B.push("Sağmalcılar");
		M1B.push("Bayrampaşa-Maltepe");
		M1B.push("Topkapı-Ulubatlı");
		M1B.push("Emniyet-Fatih");
		M1B.push("Aksaray");
		M1B.push("Yenikapı");

		M1B.push("Kirazlı-Bağcılar M1/M3");
		M1B.push("Bağcılar Meydan");
		M1B.push("Üçyüzlü");
		M1B.push("Menderes");
		M1B.push("Esenler");
		M1B.push("Otogar");
		M1B.push("Kocatepe");
		M1B.push("Sağmalcılar");
		M1B.push("Bayrampaşa-Maltepe");
		M1B.push("Topkapı-Ulubatlı");
		M1B.push("Emniyet-Fatih");
		M1B.push("Aksaray");
		M1B.push("Yenikapi M1/M2");

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
		M3.push("İkitelli Sanayi");
		M3.push("İSTOÇ");
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
		
		
		

	}

}
