
public class BinarySearchTree {
	
	private NodeTree root;
	
	public BinarySearchTree(){
		root = null;
	}
	
	public void addSingle(int n){
		add(root, n);
	}
	
	public void addArray(int[] array){
		int lenght = array.length;
		for(int i = 0; i < lenght; i++)
			add(root, array[i]);
	}
	
	private void add(NodeTree node, int n){
		if(root == null)
			root = new NodeTree(n);
		else {
			if(n < node.key){
				if(node.left == null)
					node.left = new NodeTree(n);
				else add(node.left, n);
			}
			else if(n >= node.key){
				if(node.right == null)
					node.right = new NodeTree(n);
				else add(node.right, n);
			}
		}
			
	}
	
	public int heightOfTree(){
		return heightOfTree(root);
	}
	
	private int heightOfTree(NodeTree node){
		if(node == null || (node.left == null && node.right == null))
			return 0;
		return 1 + Math.max(heightOfTree(node.left), heightOfTree(node.right));
	}
	
	private void find(NodeTree node, int n){
		if(node == null)
			return;
		if(node.key == n)
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
