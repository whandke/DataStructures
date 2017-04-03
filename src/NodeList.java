
public class NodeList {
	private int key;
	private NodeList next;
	
	public NodeList(int n){
		this.key = n;
		this.next = null;
	}

	public NodeList getNext() {
		return next;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public void setNext(NodeList next) {
		this.next = next;
	}
}
