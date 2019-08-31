import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node left;
	Node right;
	public Node(int data) {
		this.data = data;		
	}
}
public class BinaryTree {
Node root;


public void constructBinaryTree() {
	 root  = new Node(60);
	root.left = new Node(16);
	root.right = new Node(44);
	
	//root.left.left = new Node(13);
	root.left.right = new Node(3);
	root.right.left = new Node(23);
	root.right.right = new Node(43);
	root.left.right.left = new Node(53);
	//root.left.left.left = new Node(63);
	//root.right.left = new Node(3);
	//root.right.right = new Node(41);
}


public void InOrderTraversal(Node root) {
	if(root==null) {
		return;
	}
	InOrderTraversal(root.left);
	System.out.print(root.data);
	InOrderTraversal(root.right);
}

public void PreOrderTraversal(Node root) {
	if(root==null) {
		return;
	}
	System.out.print(root.data);
	PreOrderTraversal(root.left);
	
	PreOrderTraversal(root.right);
}

public void PostOrderTraversal(Node root) {
	if(root==null) {
		return;
	}
	
	PostOrderTraversal(root.left);
	
	PostOrderTraversal(root.right);
	System.out.print(root.data);
}

public void levelOrderTravelSal() {
	Queue<Node> queue = new LinkedList<Node>();
	queue.add(root);
	
	while(!queue.isEmpty()) {
		Node temp = queue.poll();
		System.out.println(temp.data);
		
		if(temp.left!=null) {
			queue.add(temp.left);
		}
		
		if(temp.right!=null) {
			queue.add(temp.right);
		}
	}
}


public void levelOrderTravelSalLineByLine() {
	Queue<Node> queue = new LinkedList<Node>();
	queue.add(root);
	
	while(!queue.isEmpty()) {
		
		int count = queue.size();
		
		for(int i =0; i<count; i++) {
			Node temp = queue.poll();
			System.out.print(temp.data);
			
			if(temp.left!=null) {
				queue.add(temp.left);
			}
			
			if(temp.right!=null) {
				queue.add(temp.right);
			}
			
		}
		System.out.println();
		
	}
		
	}
	
	public void levelOrderTravelSalLineByLineMethod2() {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		queue.add(null);
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
		
			if(temp == null) {
				if(!queue.isEmpty()) {
					queue.add(null);
				}
					System.out.println();
				
			}else {
				
				System.out.print(temp.data);
				if(temp.left!=null) {
					queue.add(temp.left);
				}
				
				if(temp.right!=null) {
					queue.add(temp.right);
				}
			}
		
			
			
			
			
		}
}


	public void InOrderTraversal() {
		InOrderTraversal(root);
		
	}


	public void PreOrderTraversal() {
		System.out.println();
		PreOrderTraversal(root);
		
	}


	public void PostOrderTravel() {
		System.out.println();
		PostOrderTraversal(root);
		
	}
	
	public int GetHeightOfBinaryTree(Node root) {
		if(root == null) {
			return 0;
		}
		
		int lh = GetHeightOfBinaryTree(root.left);
		int rh = GetHeightOfBinaryTree(root.right);
		
		
		return Math.max(lh, rh)+1;
	}
	
	public void IsBinaryTreeBalanced() {
		System.out.print(IsBinaryTreeBalanced(root, new Height()));
	}
	
	class Height{
		int height;
	}
	
	public boolean IsBinaryTreeBalanced(Node root, Height height) {
		if(root == null) {
			return true;
		}
		Height lheight = new Height(); Height rheight = new Height();
		boolean l = IsBinaryTreeBalanced(root.left, lheight);
		boolean r = IsBinaryTreeBalanced(root.right, rheight);
		 int lh = lheight.height; int rh = rheight.height;
		height.height = Math.max(lh, rh) +1;
		
		if(Math.abs(lh-rh)>1) {
			return false;
		}else if(l && r) {
			return true;
		}
		return false;
	}


	public void GetHeightOfBinaryTree() {
		System.out.println();
		System.out.print(GetHeightOfBinaryTree(root));
		
	}
	
	class Level{
	
		int index;
	}
	
	public void printKthLevelTraverSal(Node root, int currentlevel, int level) {
		if(level == 0) {
			System.out.print(root.data);
			return;
		}
		else if(root!=null && currentlevel == level-1) {
			if(root.left!=null) {
			System.out.println(root.left.data);
			}
			if(root.right!=null) {
			System.out.println(root.right.data);
			}
			return;
		}else if(root==null){
			return;
		}
		currentlevel = currentlevel+1;
		printKthLevelTraverSal(root.left, currentlevel, level);
		printKthLevelTraverSal(root.right, currentlevel, level);
		
		
	}
	
	void printKDistant(Node node, int k)  
    { 
        if (node == null) 
            return; 
        if (k == 0)  
        { 
            System.out.print(node.data + " "); 
            return; 
        }  
        else 
        { 
            printKDistant(node.left, k - 1); 
            printKDistant(node.right, k - 1); 
        } 
    } 
	
	public void IsTreeChildrenSum() {
		System.out.print(IsTreeChildrenSum(root));
	}


	private boolean IsTreeChildrenSum(Node root) {
		if(root==null) {
			return true;
		}else if(root.left == null && root.right== null) {
			
			return true;
		}
		else if(root.left!=null && root.right==null && root.left.data == root.data && IsTreeChildrenSum(root.left) && IsTreeChildrenSum(root.right)) {
			
				
				return true;
			
		}else if(root.left==null && root.right!=null && root.right.data == root.data && IsTreeChildrenSum(root.left) && IsTreeChildrenSum(root.right)) {
			
	
				return true;
			
		}else if(root.left.data + root.right.data == root.data && IsTreeChildrenSum(root.left) && IsTreeChildrenSum(root.right)) {
	
			return true;
		}else {
			return false;
		}
	
		
		
	}

	public void CalculateWidthOfBinaryTree() {
		int height = GetHeightOfBinaryTree(root);
		
		int currentWidth = 0;
		for(int i=1;i<height;i++) {
			int width = GetWidthOfTreeAtGivenLevel(root, i);
			if(width>currentWidth) {
				currentWidth = width;
			}
		}
		System.out.print(currentWidth);
	}

	private int GetWidthOfTreeAtGivenLevel(Node root, int level) {
		if(root==null) {
			return 0;
		}else if(level==1) {
			//System.out.print(root.data);
			return 1;
		}else {
			return GetWidthOfTreeAtGivenLevel(root.left, level-1)+GetWidthOfTreeAtGivenLevel(root.right, level-1);
		}
	}


	public void printKthLevelTraverSal() {
		printKthLevelTraverSal(root,0,3);
		
	}
	
	public void printLeftViewOfBinaryTree() {
		int height = GetHeightOfBinaryTree(root);
		System.out.println(root.data);
		
		for(int i=2; i<=height; i++) {
	 	  printLeftViewOfBinaryTreeAtEachLevel(root.left, root.right, i-1);
		}
	}


	private void printLeftViewOfBinaryTreeAtEachLevel(Node root1, Node root2, int level) {
	if(root1==null && root2==null) {
		return;
	}else if (level == 1) {
		if(root1!=null) {
			System.out.println(root1.data);
		}else if(root2!=null) {
			System.out.println(root2.data);
		}
	}else {
		Node root1LeftVal=null;
		if(root1!=null) {
			root1LeftVal = root1.left;
		}
		Node root1RightVal=null;
		if(root1!=null) {
			root1RightVal = root1.right;
		}
		Node root2LeftVal=null;
		if(root2!=null) {
			root2LeftVal = root2.left;
		}
		Node root2RightVal=null;
		if(root2!=null) {
			root2RightVal = root2.right;
		}
		printLeftViewOfBinaryTreeAtEachLevel(root1LeftVal, root1RightVal, level - 1);
		if((level-1) == 1 && root1 ==null || root1.left==null && root1.right==null) {
			printLeftViewOfBinaryTreeAtEachLevel(root2LeftVal, root2RightVal, level-1);
		}else if((level-1)>1) {
			printLeftViewOfBinaryTreeAtEachLevel(root2LeftVal, root2RightVal, level-1);
		}
	}
		
	}
	
	public void ConvertBinaryTreetoMirror() {
		ConvertBinaryTreetoMirror(root);
	}
	
	public void ConvertBinaryTreetoMirror(Node root) {
		if(root == null) {
			return;
		}
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
		ConvertBinaryTreetoMirror(root.left);
		ConvertBinaryTreetoMirror(root.right);
	}

	
	
}
