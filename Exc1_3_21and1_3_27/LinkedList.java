public class LinkedList{
    
    //Størrelsen på listen!
    private int N = 0; 
    private Node first;
    private Node last;
        
    
    public void addItem(String item){
       if(first == null){
        first       = new Node();
        first.item  = item;
        last        = first;
       }else{
        Node newNode= new Node();
        newNode.item= item;
        last.next   = newNode;
        last        = newNode;
       }
       N++; 
    }
	 
	 public Node getFirst(){
	   return first;
	 }
        
    
    public void printList(){
        
        if(first==null) return;

        Node n = first;
        
        while( n != null){
         System.out.print(n.item + " ");            
         n = n.next;
        }
        
        System.out.println("");
   
    }
    
}