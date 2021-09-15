public class TestLinkedList{
 
    public static void main(String[] args){
        
        //1.3.21 
        //Write a method find() that takes a 
        //linked list and a string key         
        //as arguments and 
        //returns 
        //true if some node in the list has key as its item field, 
        //false otherwise.
       
		  //1.3.27 
		  //Write a method max() that takes a reference to the first node in a linked list as
        //argument and returns the value of the maximum key in the list. Assume that all keys are
        //positive integers, and return 0 if the list is empty. 
		 
        LinkedList linkedList = new LinkedList();
        
        for(int i=0; i <10 ; i++){
            linkedList.addItem(""+i);    
        }
        
        linkedList.printList();
		 
		  String key = "4";
		  System.out.println("Er key " + key + " i listen? svar=" + find(key,linkedList));
		  key ="20";
		  System.out.println("Er key " + key + " i listen? svar=" + find(key,linkedList));

    }

	 public static max(Node first){
	   int max = 0; //assume all keys are positive integers 
	 }
    
    public static boolean find(String key, LinkedList list){
        Node n = list.getFirst();
		  while(n != null){
		      if(n.item.equals(key)){
				    return true;	
				}
			   n = n.next;
		  }
        return false;
    }
        
    
}