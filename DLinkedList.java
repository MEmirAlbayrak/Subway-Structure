
public class DLinkedList {

	   Node head; 
	   
	    public void push(String new_data)
	    {

	        Node new_Node = new Node(new_data);
	 
	        new_Node.next = head;
	        new_Node.prev = null;
	 
	        if (head != null)
	            head.prev = new_Node;
	 
	       
	        head = new_Node;
	    }
	    static boolean search(Node head, String x)
	    {
	      
	      Node temp = head;
	       

	      //int pos = 0;
	       
	      while (!x.toString().equals(temp.data.toString()) && temp.next != null)
	      {
	        temp = temp.next;
	      }

	      if (!x.toString().equals(temp.data.toString())) {
	    	return false;
	      }

	      
	      return true;
	      
	    } 
	    void append(String new_data)
	    {
	        
	        Node new_node = new Node(new_data);
	 
	        Node last = head; 
	 
	        new_node.next = null;
	 
	        if (head == null) {
	            new_node.prev = null;
	            head = new_node;
	            return;
	        }
	 
	        while (last.next != null)
	            last = last.next;
	 
	        last.next = new_node;
	 
	        new_node.prev = last;
	    }
	    public  void printlist(Node node)
	    {
			int properPrint = 1;
      	    while (node != null) {	  
				if(properPrint%6 != 0 && node.next != null ){
					System.out.print(node.data + " - ");
				}
				else if(properPrint%6 == 0 || node.next ==null ){
					System.out.print(node.data);
					System.out.println("");
				}
				node = node.next;
            	properPrint+=1;
	        }
	        System.out.println(" ");

}
}
