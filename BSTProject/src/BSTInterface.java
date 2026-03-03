public interface BSTInterface
{
	public int size();
	// returns the current number of nodes that are located in the tree

	public boolean isEmpty();
	// returns true if there are no nodes in the tree and false if there is at least one node in the tree

	public void add(Comparable newVal);
		if(this.root == null){
			root= new TreeNode(newVal);
		}
		Else 
			addHelper(newVal, this.root)
		
		private void addHelper(Object val, TreeNode parent){
			if(val <= parent.root)
				if(parent.getLeft() == null)
					parent.setLeft(val);
				else
					addHelper(val, parent.getLeft());
			else
				if(parent.getRight() == null)
					parent.setRight(val);
				else
					addHelper(val,parent.getRight());
		}//end addHelper

	public boolean find(Comparable toFind);
	// searches through the tree to determine if the object being passed is a current element in the tree if it is, return true, otherwise, return false

	public boolean replace(Comparable old, Comparable toAdd);
	// this method takes an “old” object – determines if it is currently in the tree and if it is, removes that object and adds the “toAdd” object.  If the element was successfully replaced then true is returned, if the old object did not exist then false is returned and the toAdd object is added to the BST.  Remember that you cannot just replace an element by changing its value because it may not belong at that spot in the tree after being replaced.  

	public boolean delete(Comparable old);
	// this method deletes the object being passed to the method from the tree.  When you remove the node you must then change any children around to accommodate for the deleted node.  Return true if the node was successfully deleted, false if it was not in the tree and therefore not deleted.

	public void printInOrder(){
	// prints the tree using an In Order traversal - recursion
		if(root!=null){
			printInHelper(root.getLeft());
			System.out.print(root.getValue());
			printInHelper(root.getRight());
		}//end if
	private void printInHelper(TreeNode subroot){
		if(subroot!= null){
			printInHelper(subroot.getLeft());
			System.out.print(subroot.getValue());
			printInHelper(subroot.getRight());
		}//end if
	}//end helper
	}//end inorder traversal 
	

	public void printPreOrder(){
		// prints the tree using a Pre Order traversal - recursion
		if(root!=null){
			System.out.println(root.getValue());
			printPreHelper(root.getLeft()); 
			printPreHelper(root.getRight());
		}//end if
		private void printPreHelper(TreeNode subroot){
			if(subroot!=null){
				System.out.println(subroot.getValue());
				printPreHelper(subroot.getLeft());
				printPreHelper(subroot.getRight());
			}//end if
		}//end helper
	}//end preOrder traversal 
	
	public void printPostOrder(){
	// prints the tree using a Post Order traversal – recursion
		if(root!= null){
			printPostHelper(root.getLeft());
			printPostHelper(root.getRight());
			System.out.print(root.getValue());
		}//end if
		private void printPostHelper(TreeNode subroot){
			if(subroot!=null){
				printPostHelper(subroot.getLeft());
				printPostHelper(subroot.getRight());
				System.out.print(subroot.getValue());
			}//end if
		}//end helper
	}//end postorder traversal
}//end interface