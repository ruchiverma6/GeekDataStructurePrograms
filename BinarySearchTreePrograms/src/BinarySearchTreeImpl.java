
public class BinarySearchTreeImpl {

	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(10);
		bst.insert(3);
		bst.insert(7);
		bst.insert(27);
		bst.insert(25);
		bst.inorderTraversal();
		
		//bst.search(254);
		//bst.delete(10);
		//bst.inorderTraversal();
		 
		 
		
		/*AugmentedBinarySearchTree bst = new AugmentedBinarySearchTree();
		bst.insert(10);
		bst.insert(3);
		bst.insert(7);
		bst.insert(27);
		bst.insert(25);
		
		bst.findkthSmallestElement(1);
		*/
	}
}
