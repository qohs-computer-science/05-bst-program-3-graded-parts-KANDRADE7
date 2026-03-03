import java.lang.Comparable;

public class BST implements BSTInterface{
    private TreeNode root;
    private int size;
      public BST(){
        root = null;
        size = 0;
    }//end constructor

    public void add(Comparable newVal){
		if(this.root == null){
			root = new TreeNode(newVal);
      size++;
		}//end if
		else 
			addHelper(newVal, this.root);
	}//end add 
		
	private void addHelper(Object val, TreeNode parent){
		if(val.compareTo(parent.getValue()) < 0)
			if(parent.getLeft() == null){
        		parent.left = new TreeNode(val);
      			size++;
    		}//end if
			else
				addHelper(val, parent.getLeft());
		else
			if(parent.getRight() == null){
				parent.right = new TreeNode(val);
				size++;
			}//end if 
			else
				addHelper(val,parent.getRight());
		}//end addHelper

	public void printInOrder(){
	// prints the tree using an In Order traversal - recursion
		if(root!=null){
			printInHelper(root.getLeft());
			System.out.print(root.getValue());
			printInHelper(root.getRight());
		}//end if
	}//end inorder traversal 

	private void printInHelper(TreeNode subroot){
		if(subroot!= null){
			printInHelper(subroot.getLeft());
			System.out.print(subroot.getValue());
			printInHelper(subroot.getRight());
		}//end if
	}//end helper

	
	public void printPreOrder(){
		// prints the tree using a Pre Order traversal - recursion
		if(root!=null){
			System.out.println(root.getValue());
			printPreHelper(root.getLeft()); 
			printPreHelper(root.getRight());
		}//end if
	}//end preOrder traversal 

	private void printPreHelper(TreeNode subroot){
		if(subroot!=null){
			System.out.println(subroot.getValue());
			printPreHelper(subroot.getLeft());
			printPreHelper(subroot.getRight());
		}//end if
	}//end helper

	
	public void printPostOrder(){
	// prints the tree using a Post Order traversal – recursion
		if(root!= null){
			printPostHelper(root.getLeft());
			printPostHelper(root.getRight());
			System.out.print(root.getValue());
		}//end if
	}//end postorder traversal

	private void printPostHelper(TreeNode subroot){
			if(subroot!=null){
				printPostHelper(subroot.getLeft());
				printPostHelper(subroot.getRight());
				System.out.print(subroot.getValue());
			}//end if
		}//end helper

}//end class