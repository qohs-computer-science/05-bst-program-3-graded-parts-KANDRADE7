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
		//case 0: tree is empty 
		if(root==null)
			return false;

	//root's value is old
		if(root ==old){
		//CASE 1: root has no children
			if(root.getLeft()==null && root.getRight()==null){
				root = null;
			}//end if
		//CASE 2: root has 1 child (LEFT ONLY)
			else if(root.getLeft()!=null && root.getRight()==null){
				root = root.getLeft(); 
			}//end if
		//CASE 3: root has 1 child (RIGHT ONLY)
			else if(root.getLeft()==null && root.getRight()!=null){
				root = root.getRight();
			}//end if
		//CASE 4: root has 2 children
			else if(root.getLeft()!=null && root.getRight()!=null){
				TreeNode smallestRightNode = small;
				TreeNode small = small.getRight(); 
				while(small.getLeft()!=null){
					smallestRightNode = small;
					small = small.getLeft();
				}//end while loop
				root.setValue(small.getValue()); //sets root value to smallest node in right subtree 
				//remove 
				if(smallestRightNode == root)
					smallestRightNode.setRight(small);
				else
					smallestRightNode.setLeft(small);
			}//end if
			size--;
			return true; 
		}//end master if
		else
			return deleteHelper(root,old);
	}//end delete method 

	private boolean deleteHelper(TreeNode parent, Comparable old){
		//handles all cases where the node being deleted is not the root. always looking ahead at parent's children
		if(old.compareTo(parent) <= 0){
			//search left 
			if(parent.getLeft() == null)
				return false;

			if(old == parent.getLeft().getValue()){
				TreeNode removeNode = parent.getLeft();

				//CASE 1: no children
				if(removeNode.getLeft()==null && removeNode.getRight()==null)
					parent.setLeft(null);

				//CASE 2: 1 child (left only)
				else if(removeNode.getLeft()!=null && removeNode.getRight()==null)
					parent.setLeft(removeNode.getLeft());

				//CASE 3: 1 child (right only)
				else if(removeNode.getLeft()==null && removeNode.getRight()!=null)
					parent.setLeft(removeNode.getRight());

				//CASE 4: 2 children 
				else{
					TreeNode parentOfReplacement = removeNode;
					TreeNode replacement = removeNode.getRight();
					while(replacement.getLeft()!=null){
						parentOfReplacement = replacement;
						replacement = replacement.getLeft();
					}//end while 
					removeNode.setValue(replacement.getValue());

					if(parentOfReplacement == removeNode)
						parentOfReplacement.setRight(replacement.getRight());
					else
						parentOfReplacement.setLeft(replacement.getRight());
				}//end else
				size--;
				return true;
			}//end inner if 		
		else
			return deleteHelper(parent.getLeft(), old);
		}//end search left 

		//search right 
		else {
			if(parent.getRight()==null)
				return false;

			if(old == parent.getRight().getValue()){
				TreeNode toDelete = parent.getRight();

				//case 1: no children
				if(toDelete.getLeft()==null && toDelete.getRight() ==null)
					parent.setRight(null);

				//case 2: 1 child (LEFT ONLY)
				else if(toDelete.getLeft()!=null && toDelete.getRight()==null)
					parent.setRight(toDelete.getLeft())

				//case 3: 1 child (RIGHT ONLY)
				else if(toDelete.getLeft()==null && toDelete.getRight()!=null)
					parent.setRight(toDelete.getRight());

				//case 4: 2 children
				else{
					TreeNode parentOfReplacement = toDelete;
					TreeNode replacement = toDelete.getRight();
					while(replacement.getLeft()!=null){
						parentOfReplacement = replacement; 
						replacement = replacement.getLeft();
					}//end while

					toDelete.setLeft(replacement);

					if(parentOfReplacement == toDelete)
						parentOfReplacement.setRight(replacement.getRight());
					else
						parentOfReplacement.setLeft(replacement.getRight());
				}//end else
				size--;
				return true;
			}//end inner if
			else
				return deleteHelper(parent.getRight(),old);
		}//end search right
	}//end deleteHelper  


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