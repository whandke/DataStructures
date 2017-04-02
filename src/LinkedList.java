 public class LinkedList{
    private Node head = new Node(null); //wartownik
    private int size; //rozmiar listy
    
    public void add(Object value){
        if (head.getNext()==null) head.setNext(new Node(value)); //jeœli lista jest pusta ustawiamy nastêpnik wartownika
        Node last = head.getNext();
        while(last.getNext() != null) //szukamy ostatniego elementu
            last=last.getNext();
        ++size;
        last.setNext(new Node(value));
}

