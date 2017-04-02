
public class BinarySearchTree {
	
	public Node root = null;
	
	public void addSingle(int n){
		add(root, n);
	}
	
	public void addArray(int[] array){
		int lenght = array.length;
		for(int i = 0; i < lenght; i++)
			this.add(root, array[i]);
	}
	
	private void add(Node node, int n){
		if(n < node.key){
			if(node.left == null)
				node.left = new Node(n);
			else
				add(node.left, n);
		}
		else if(n >= node.key){
			if(node.right == null)
				node.left = new Node(n);
			else
				add(node.right, n);
		}
	}
	
	public int heightOfTree(Node node){
		if(node.left == null && node.right == null)
			return 0;
		return 1 + Math.max(heightOfTree(node.left), heightOfTree(node.right));
	}
	
	private void find(Node node, int n){
		if(n == node.key)
			return;
		else if(n < node.key)
			find(node.left, n);
		else if(n > node.key)
			find(node.right, n);
	}
	
	public void findFromArray(int[] array){
		int lenght = array.length;
		for(int i = 0; i < lenght; i++)
			find(root, array[i]);
	}
	
	public void findSingle(int n){
		find(root, n);
	}
	


}
