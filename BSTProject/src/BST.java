import java.lang.Comparable;

public class BST implements BSTInterface{
    private TreeNode root;
    private int size;
    public BST(){
    	root = null;
    	size = 0;
    }//end constructor

	public int size(){
		return size;
	}//end size 

    public boolean isEmpty(){
		return root ==null; 
	}//end isEmpty
	
	//ADD METHOD
	public void add(Comparable newVal){
		if(root == null){
			root = new TreeNode(newVal);
     		size++;
		}//end if
		else 
			addHelper(newVal, root);
	}//end add 	
	private void addHelper(Comparable val, TreeNode parent){
		if(val.compareTo(parent.getValue()) < 0)
			if(parent.getLeft() == null){
        		parent.setLeft(new TreeNode(val));
      			size++;
    		}//end if
			else
				addHelper(val, parent.getLeft());
		else
			if(parent.getRight() == null){
				parent.setRight(new TreeNode(val));
				size++;
			}//end if 
			else
				addHelper(val,parent.getRight());
		}//end addHelper

	//DELETE METHOD
	public boolean delete(Comparable old){
		//handle all cases where the node being deleted is the root. directly using root field
		if(root==null)
			return false;

	//root's value is old
		if(root ==old){
		//CASE 1: root has no children
			if(root.getLeft()==null && root.getRight()==null){
				root = null;
			}//end if
		//CASE 2: root has 1 child (LEFT ONLY)
			if(root.getLeft()!=null && root.getRight()==null){
				root = root.getLeft(); 
			}//end if
		//CASE 3: root has 1 child (RIGHT ONLY)
			if(root.getLeft()==null && root.getRight()!=null){
				root = root.getRight();
			}//end if
		//CASE 4: root has 2 children
			if(root.getLeft()!=null && root.getRight()!=null){
				//working on
			}//end if

			size--;
			return true; 
		}//end master if
		else
			return deleteHelper(root,old);
	}//end delete method 

	private boolean deleteHelper(Comparable old){
		//handles all cases where the node being deleted is not the root. always looking ahead at parent's children
		
	}//end helper method 


	public void printInOrder(){
		//in order - left, root, right
		if(root!=null){
			printInHelper(root.getLeft());
			System.out.print(root.getValue());
			printInHelper(root.getRight());
		}//end if
		System.out.println();
	}//end inorder traversal 

	private void printInHelper(TreeNode subroot){
		if(subroot!= null){
			printInHelper(subroot.getLeft());
			System.out.print(subroot.getValue() + " ");
			printInHelper(subroot.getRight());
		}//end if
	}//end helper

	public void printPreOrder(){
		// pre order - root, left, right
		if(root!=null){
			System.out.print(root.getValue());
			printPreHelper(root.getLeft()); 
			printPreHelper(root.getRight());
		}//end if
		System.out.println();
	}//end preOrder traversal 

	private void printPreHelper(TreeNode subroot){
		if(subroot!=null){
			System.out.print(subroot.getValue() + " ");
			printPreHelper(subroot.getLeft());
			printPreHelper(subroot.getRight());
		}//end if
	}//end helper

	public void printPostOrder(){
	// post order - left, right, root 
		if(root!= null){
			printPostHelper(root.getLeft());
			printPostHelper(root.getRight());
			System.out.print(root.getValue() + " ");
		}//end if
	}//end postorder traversal

	private void printPostHelper(TreeNode subroot){
			if(subroot!=null){
				printPostHelper(subroot.getLeft());
				printPostHelper(subroot.getRight());
				System.out.print(subroot.getValue() + " ");
			}//end if
		}//end helper
}//end class