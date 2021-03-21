
class Node 
{ 
	String data;
	Node next; 
	Node(String d) 
	{ 
		data = d; 
		next = null; 
	} 
} 

class LinkedList 
{ 
	Node head; 
	

	//Inserts a new node at the front of the list 
	public void push(String new_data) 
	{ 
		Node new_node = new Node(new_data); 

		new_node.next = head; 

		head = new_node; 
	} 

	
	public String search(Node head, String x) 
	{ 
		Node current = head; 
		while (current != null) 
		{ 
			if (current.data == x) 
            return x;
			current = current.next; 
		}
        
		return null;
    } 
    //pushing all games list
    public void all()
    {
         
		push ("Anthem");
		push("Apex construct");
		push ("Assassin creed");
		push ("Battlefield series");
		push ("Bleed 2");
		push ("Borderland 3");
		push ("Call of Duty 4");
		push ("Castle costume");
		push ("Counter strike");
		push ("Cricket 2007");
		push ("Destiny");
		push ("Dishonored");
		push ("Dokapon");
		push ("Dota 2");
		push ("EA sports UFC");
		push ("Final fantacy series");
		push ("Fortnite pc");
		push ("GTA 5");
		push ("Judgement");
		push ("Knives out");
		push ("Need for speed: Most wanted");
		push ("Need for speed: The run");
		push ("Out of order");
		push ("PES-20");
		push ("Prince of Persia 2008");
		push ("PUBG mobile");
		push ("PUBG pc");
		push ("Real royale");
		push ("Red dead redemption");
		push("spiderman");
		push ("Steep");
		push("Star wars: Battlefront 2");
		push ("The witcher 3");
		push ("The witcher");
		push("The knightfall");
		push ("Tomb raider pc");
		push ("Tomb raider series");	
		push ("Vampyr");
		push ("World racing 3");
		push ("WWE 2k20"); 		
		 
    }

    public void display() {    
        //Node current will point to head    
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("ALL Games");    
        while(current != null) 
        {            
            System.out.print(current.data + " , ");    
            current = current.next;    
        }    
            
    }    
    public void sortList() {  
        //Node current will point to head  
        
        boolean T = true;
          
          
        if(head == null) {  
            return;  
        }  
        else {  
            while(T) {  
				
				T = false;
				Node position = head;
				Node positionNext = position.next;  
				Node psoitionperv = null;
                  
                while(positionNext != null) {
                      
                   
                    if(position.data == positionNext.data ) {
                        Node temp = position;  
                        Node tempnext = positionNext.next;  
						position = positionNext;
						position.next = temp;
						positionNext = temp;
						positionNext.next = tempnext;
							  
                      
					if(psoitionperv == null){head = position;} 
					
					else {psoitionperv.next  = position; }
					
					T = true;}

				psoitionperv = position;
                position = position.next;
                positionNext = position.next;
                }  
				
				 
            }
			display();
			
			     
        }  
    }  

} 

