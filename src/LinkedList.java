 public class LinkedList{
	 
    private int size;
    private NodeList head;
    
    public LinkedList(){
    	this.size = 0;
    	this.head = null;
    }
    
    public int getSize(){
    	return size;
    }
    
    public void add(int n){
    	if(head == null)
    		head = new NodeList(n);
    	else {
    		NodeList newHead = new NodeList(n);
    		newHead.setNext(head);
    		head = newHead;
    	}
    	size++;
    }
    
    public void addArray(int[] array){
    	int lenght = array.length;
    	for(int i = 0; i < lenght; i++)
    		add(array[i]);
    }
    
    private void find(NodeList node, int n){    	
    	if(node == null)
    		return;
    	
    	else if(node.getKey() == n)
    		return;
    	else
    		find(node.getNext(), n);
    }
    
    public void findSingle(int n){
    	find(head, n);
    }
    
    public void findArray(int[] array){
    	int lenght = array.length;
    	for(int i = 0; i < lenght; i++)
    		find(head, array[i]);
    }
    
    
}

