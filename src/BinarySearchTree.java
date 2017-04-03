
public class BinarySearchTree {
	
	private NodeTree root;
	
	public BinarySearchTree(){
		this.root = null;
	}
	
	public void addSingle(int n){
		add(root, n);
	}
	
	public void addArray(int[] array){
		int lenght = array.length;
		for(int i = 0; i < lenght; i++)
			this.add(root, array[i]);
	}
	
	private void add(NodeTree node, int n){
		if(n < node.getKey()){
			if(node.getLeft() == null)
				node.setLeft(new NodeTree(n));
			else
				add(node.getLeft(), n);
		}
		else if(n >= node.getKey()){
			if(node.getRight() == null)
				node.setRight(new NodeTree(n));
			else
				add(node.getRight(), n);
		}
	}
	
	public int heightOfTree(NodeTree node){
		if(node.getLeft() == null && node.getRight() == null)
			return 0;
		return 1 + Math.max(heightOfTree(node.getLeft()), heightOfTree(node.getRight()));
	}
	
	private void find(NodeTree node, int n){
		if(node == null)
			return;
		if(node.getKey() == n)
			return;
		else if(n < node.getKey())
			find(node.getLeft(), n);
		else if(n > node.getKey())
			find(node.getRight(), n);
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
