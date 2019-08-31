class Node{
	public int data;
   public Node left;
   public Node right;
	public Node(int data) {
		this.data = data;
	}
}
public class BinarySearchTree {
Node root;

public void insert(int value) {
	root = insert(value, root);
}

private Node insert(int value, Node root) {

	
	if(root==null) {
	root = new Node(value);
	return root;
	}else if(value<root.data) {
		root.left = insert(value, root.left);
	}else if(value>root.data) {
		root.right = insert(value, root.right);
	}
	
	return root;
	
	
}

public void delete(int value) {
	delete(root, value);
}

public Node delete(Node root, int value) {
	if(value == root.data) {
	System.out.println("Element present");
	if(root.left == null && root.right == null) {
		root = null;
		return root;
	}else if(root.left == null || root.right == null) {
		if(root.left!=null) {
		root = root.left;
		}else if(root.right!=null) {
			root = root.right;
		}
		return root;
	}else if(root.left != null && root.right != null) {
		root.data = FindMin(root.right, root.right.data);
		root.right = delete(root.right, root.data);
		return root;
	}
	}else if(value<root.data) {
		root.left = delete(root.left, value);
	}else if(value>root.data) {
		root.right = delete(root.right, value);
	}
	return root;
}

private int FindMin(Node root, int min) {
if(root==null) {
	return min;
}
if(min>root.data) {
	min = root.data;
}

min = FindMin(root.left, min);

	return min;
}

public void search(int value) {
	search(root, value);
}

public void search(Node root, int value) {
	if(root == null) {
	

		return;
	}else if(value == root.data) {
	System.out.println("Element present");
	}else if(value<root.data) {
		search(root.left, value);
	}else if(value>root.data) {
		search(root.right, value);
	}
}

public void inorderTraversal() {
	inorderTraversal(root);
	
}

private void inorderTraversal(Node root) {
	if(root == null) {
		return;
	}
	inorderTraversal(root.left);
	System.out.println(root.data);
	inorderTraversal(root.right);
}
}
