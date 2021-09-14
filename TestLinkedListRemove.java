public class TestLinkedListRemove{

  public Node first;

  public class Node{
    Node next;
    String item;
  }

  public static void main(String[] args){
    TestLinkedListRemove test = new TestLinkedListRemove();
    test.createList();
    test.printLinkedList();
    test.removeLast();
    test.printLinkedList();

  }

  public void removeNumber(int k){

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
    //      Så skal "nextElement" blive til firstElement
    //
    // 6. Hvis nextElement ikke eksisterer
    //      Så skal "previousElement" pege på ingenting

    Node currentElement = first;
    Node previousElement;
    Node nextElement;



  }



  public void removeLast(){
    Node n = first;
    Node p = null; // previous er det forrige element
    while(n.next != null){
      p = n; //næste element i listen, som ikke er null
      n = n.next; // n er det næste element i listen
    }
    p.next = null; // fjerner adressen til næste node!!!

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
