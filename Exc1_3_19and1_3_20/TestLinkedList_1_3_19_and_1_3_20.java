public class TestLinkedList_1_3_19_and_1_3_20{

  public Node first;

  public class Node{
    Node next;
    String item;
  }

  public static void main(String[] args){
      
    TestLinkedListRemove test = new TestLinkedListRemove();
    
    test.createList();
    
    System.out.println("LISTEN NU:");
    test.printLinkedList();
  
    //TEST CASE 1.3.19
    test.removeLast();
    System.out.println("FJERNER SIDSTE ELEMENT:");
    test.printLinkedList();
    
    //TEST CASE 1.3.20
    test.removeNumber(4);
    System.out.println("FJERNER ELEMENT NUMMER " + 4);
    test.printLinkedList();     

    
    test.removeNumber(0);
    System.out.println("FJERNER ELEMENT NUMMER " + 0);
    test.printLinkedList();   

    //FEJLER FEJLER
    test.removeNumber(7);
    System.out.println("FJERNER ELEMENT NUMMER " + 7);
    test.printLinkedList();   
  
    
      
  }
//1.3.21 Write a method find() that takes a linked list and a string key as arguments
//and returns true if some node in the list has key as its item field, false otherwise.
   public boolean find(){
       return false;
   }
    
    
    
    
//1.3.19 
//Give a code fragment that removes the last node in a linked list whose first node is first    
  public void removeNumber(int k){
    //Pseudokode
    //
    // FirstElement er det første element i listen
    //
    // 0. looper indtil k... eller til slutningen af listen
    //      1. gemmer elementet (k) i currentElement
    //      2. gemmer elementet (k-1) i previousElement ... hvis det eksisterer
    //      3. gemmer elementet (k+1) i nextElement ... hvis det eksisterer
    //
    // 4. Hvis nextElement og  previousElement eksisterer
    //      Så skal "previousElement" pege på "nextElement"
    //
    // 5. Hvis previousElement element ikke eksisterer
    //      Så skal "first" blive til nextElement
    //
    //
    // 6. Hvis nextElement ikke eksisterer
    //      Så skal "previousElement" pege på ingenting

    Node previousElement= null;      
    Node currentElement = first;
    Node nextElement    = first.next;
    //0-1-2-3
    for(int i=1; i<k;i++){
        previousElement         = currentElement;
        
        if(currentElement.next != null)
            currentElement      = currentElement.next;
        if(currentElement.next != null)
            nextElement         = currentElement.next;
    }
    
    //4
     if(nextElement != null && previousElement != null){
        previousElement.next    = nextElement; 
     }
      
     //5
     if(previousElement == null && nextElement != null){
        first                   = nextElement;
         
     }
      
     //6
      if(nextElement == null){
        previousElement.next    = null;   
      }
    

  }


//1.3.7 
//Add a method peek() to Stack that returns the most recently inserted item on
//the stack (without popping it).
  public void removeLast(){
    Node n = first;
    Node p = null;          // previous er det forrige element
    while(n.next != null){
      p = n;                //næste element i listen, som ikke er null
      n = n.next;           // n er det næste element i listen
    }
    p.next = null;          // fjerner adressen til næste node!!!

  }

  public void createList(){
    first = new Node();
    first.item = "0";
    Node n1 = first;
    for(int i=1; i< 10; i++){
      Node n2 = new Node();
      n2.item = "" + i;
      n1.next = n2;
      n1 = n2;
    }
  }

  public  void printLinkedList(){
    for (Node x = first; x != null; x = x.next)
    {
      System.out.println(x.item);

    }
  }


}
