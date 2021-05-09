
public class DLinkedList {

	   Node head; // head of list
	   
	    /* Doubly Linked list Node*/
	    
	 
	    // Adding a node at the front of the list
	    public void push(String new_data)
	    {
	        /* 1. allocate node
	        * 2. put in the data */
	        Node new_Node = new Node(new_data);
	 
	        /* 3. Make next of new node as head and previous as NULL */
	        new_Node.next = head;
	        new_Node.prev = null;
	 
	        /* 4. change prev of head node to new node */
	        if (head != null)
	            head.prev = new_Node;
	 
	       
	        head = new_Node;
	    }
	    static boolean search(Node head, String x)
	    {
	      
	      // Stores head Node
	      Node temp = head;
	       
	      // Stores position of the integer
	      // in the doubly linked list
	      int pos = 0;
	       
	      // Traverse the doubly linked list
	      while (temp.data != x
	                 && temp.next != null)
	      {
	        // Update pos
	        pos++;
	         
	        // Update temp
	        temp = temp.next;
	      }
	       
	      // If the integer not present
	      // in the doubly linked list
	      if (temp.data != x) {
	    	  System.out.println("Found" + x);
	    	  return false;
	    	  
	      }
	      // If the integer present in
	      // the doubly linked list
	      
	      return true;
	      
	    }
	     
	 
	   
	   
	 
	    
	    void append(String new_data)
	    {
	        
	        Node new_node = new Node(new_data);
	 
	        Node last = head; /* used in step 5*/
	 
	        /* 3. This new node is going to be the last node, so
	        * make next of it as NULL*/
	        new_node.next = null;
	 
	        /* 4. If the Linked List is empty, then make the new
	        * node as head */
	        if (head == null) {
	            new_node.prev = null;
	            head = new_node;
	            return;
	        }
	 
	        /* 5. Else traverse till the last node */
	        while (last.next != null)
	            last = last.next;
	 
	        /* 6. Change the next of last node */
	        last.next = new_node;
	 
	        /* 7. Make last node as previous of new node */
	        new_node.prev = last;
	    }
	 
	    // This function prints contents of
	    // linked list starting from the given node
	    public  void printlist(Node node)
	    {
	        Node last = null;
	       // System.out.println("\nTraversal in forward Direction \n");
      	        while (node != null) {
	            System.out.print(node.data + " ");
	            last = node;
	            node = node.next;
	            
	        }
	        System.out.println(" ");
	        /*
	        System.out.println();
	        System.out.println("\nTraversal in reverse direction \n");
	        while (last != null) {
	            System.out.print(last.data);
	            last = last.prev;
	            
	        }
	        */
}
}
