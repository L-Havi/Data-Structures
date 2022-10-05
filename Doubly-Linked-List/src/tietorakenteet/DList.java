package tietorakenteet;

public class DList {

    public class Node {
    	
        int data;
        Node next;
        Node prev;
        
        public Node(int data) {
        	this.data = data;
			this.next = null;
			this.prev = null;
        }
    };
  
	static Node head;
	static Node tail;
	static int size; 
    
	public DList(){
		head = null;
		tail = null;
		size = 0;		
	}
	
    public void insert(int data) {

        boolean flag = false;
        Node current = head;  
    	
        if(head != null) {  
            while(current != null) {  
                if(current.data == data) {  
                    flag = true;  
                    break;  
                }  
                current = current.next;  
            } 
        }  
        
        if(flag) {
        	System.out.println("Luku on jo listassa");
            return;
        }
        
		Node node = new Node(data);
		
		if(head == null){
			head = node;
			tail = node;
			size++;
			return;
		}

		node.next = head;
		head.prev = node;
		head = node;
		size++;
		sortList();
    }
  
    public void delete(int data) {
        boolean flag = false;  

        Node current = head;  
  
        if(head == null) {  
            System.out.println("Lista on tyhjä");  
            return;  
        }  
        
        while(current != null) {  
            if(current.data == data) {  
                flag = true;  
                break;  
            }  
            current = current.next;  
        }  
        
        if(flag) {
        	if (head == current) {
                head = current.next;
            }
        	
            if (current.next != null) {
            	current.next.prev = current.prev;
            }
            
            if (current.prev != null) {
            	current.prev.next = current.next;
            }
        	
            return;
        }
             
        else {
            System.out.println("Arvoa ei ole listassa");  
        } 
    }
    
    public void find(int data) {  
        int i = 1;  
        boolean flag = false;  

        Node current = head;  
  

        if(head == null) {  
            System.out.println("Lista on tyhjä");  
            return;  
        }  
        
        while(current != null) {  
            if(current.data == data) {  
                flag = true;  
                break;  
            }  
            current = current.next;  
            i++;  
        }  
        
        if(flag) {
             System.out.println("Arvo on listassa kohdassa: " + i);  
        } else {
            System.out.println("Arvoa ei ole listassa");  
        }  
    }  
    
	public void print(){
		System.out.print("Lista: ");
		if(head == null){
			System.out.println("Lista on tyhjä");
			return;
		}
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
		
	public void printInv(){
		System.out.print("Käänteinen lista: ");
		if(head == null && tail == null){
			System.out.println("Lista on tyhjä");
			return;
		}

		Node temp = tail;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.prev;
		}
		System.out.println();
	}
    
	   private void sortList() {  
	        Node current = null, index = null;  
	        int temp;  
	        if(head == null) {  
	            return;  
	        }  
	        else {  
	            for(current = head; current.next != null; current = current.next) {  
	                for(index = current.next; index != null; index = index.next) {  
	                    if(current.data > index.data) {  
	                        temp = current.data;  
	                        current.data = index.data;  
	                        index.data = temp;  
	                    }  
	                }  
	            }  
	        }  
	    }  
	
}
