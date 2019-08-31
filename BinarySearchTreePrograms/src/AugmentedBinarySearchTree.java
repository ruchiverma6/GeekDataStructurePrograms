class AugmentedNode{
	public int data;
   public AugmentedNode left;
   public AugmentedNode right;
   public int leftElements;
   public int totalElements;
	public AugmentedNode(int data) {
		this.data = data;
	}
}
public class AugmentedBinarySearchTree {
	public AugmentedNode root;
	public void insert(int value) {
		root = insert(root,value);
	}

	public AugmentedNode insert(AugmentedNode root, int value) {
		if(root == null) {
			root = new AugmentedNode(value);
			root.leftElements = 0;
			root.totalElements = 1;
			
		}else if(root.data>value) {
			root.left = insert(root.left, value);
			root.leftElements = root.left.totalElements;
			root.totalElements += 1;
		
		}else if(root.data<value) {
			root.right = insert(root.right, value);
		//	root.leftElements = root.right.totalElements;
			root.totalElements += 1;
			
		}
		return root;
	}
	
	public int findkthSmallestElement(AugmentedNode root, int k) {
		
		if(root == null) {
			return -1;
		}else if(root.leftElements+1 == k) {
			return root.data;
		}else if(root.leftElements>=k) {
			return findkthSmallestElement(root.left,k);
		}else if(root.leftElements<k) {
			k = k-(root.leftElements+1);
			return findkthSmallestElement(root.right,k);
		}
		return -1;
		
	}

	public void findkthSmallestElement(int k) {
		System.out.println(findkthSmallestElement(root,k));
		
	}
}
