public interface BSTInterface
{
	public int size();
	// returns the current number of nodes that are located in the tree

	public boolean isEmpty();
	// returns true if there are no nodes in the tree and false if there is at least one node in the tree

	public void add(Comparable newVal);
    // adds a new value to the tree in the correct position

    public boolean find(Comparable toFind);
    // searches through the tree to determine if the object being passed is a current element in the tree if it is, return true, otherwise, return false

    public boolean replace(Comparable old, Comparable toAdd);
    // this method takes an "old" object – determines if it is currently in the tree and if it is, removes that object and adds the "toAdd" object. If the element was successfully replaced then true is returned, if the old object did not exist then false is returned and the toAdd object is added to the BST.

    public boolean delete(Comparable old);
    // this method deletes the object being passed to the method from the tree. Return true if the node was successfully deleted, false if it was not in the tree.

    public void printInOrder();
    // prints tree in order traversal

    public void printPreOrder();
    // prints tree in pre order traversal

    public void printPostOrder();
    // prints tree in post order traversal
}//end interface