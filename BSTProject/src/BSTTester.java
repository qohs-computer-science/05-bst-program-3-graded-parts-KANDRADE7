/*
Katherine Andrade
3/2/2026
Period 6
Binary search tree
 */

 import java.lang.Comparable;

 public class BSTTester {
   public static void main(String[] args) {
    BST tree = new BST(); //creates tree
    System.out.println("\nTree is empty?: " + tree.isEmpty());
    System.out.println("Size of tree: " + tree.size());


    //add
    tree.add("O");
    tree.add("R");
    tree.add("C");
    tree.add("H");
    tree.add("A");
    tree.add("R");
    tree.add("D");
    tree.add("Q");
    tree.add("U");
    tree.add("I");
    tree.add("N");
    tree.add("C");
    tree.add("E");

    //test all traversals
    System.out.println("\nIntial tree:");
    System.out.print("In order: ");
    tree.printInOrder();
    System.out.print("Pre order: ");
    tree.printPreOrder();
    System.out.print("Post order: ");
    tree.printPostOrder();
    System.out.println();
    System.out.println("Tree is empty?: " + tree.isEmpty());
    System.out.println("Size of tree: " + tree.size());

    //testing find method
    System.out.println("\n\nTesting find method:");
    System.out.println("Find root node \"O\": " + tree.find("O"));
    System.out.println("Find middle node \"H\": " + tree.find("H"));
    System.out.println("Find middle node \"Q\": " + tree.find("Q"));
    System.out.println("Find leaf node \"A\": " + tree.find("A"));
    System.out.println("Find leaf node \"E\": " + tree.find("E"));
    System.out.println("Find leaf node \"N\": " + tree.find("N"));
    System.out.println("Find nonexistent node \"Z\": " + tree.find("Z"));


    //testing delete method 
    System.out.println("\n\nTesting delete method:");
    System.out.println("Deleting a nonexistent value \"Z\": " + tree.delete("Z"));
    
    //delete a lead node (no children)
    System.out.println("\nCase 1: delete lead node \"A\" (no children)");
    System.out.println("delete \"A\": " + tree.delete("A"));
    System.out.println("find \"A\": " + tree.find("A"));
    System.out.println("Size of tree: " + tree.size());
    System.out.println("\nTree after removing letter A:");
    System.out.print("In order: ");
    tree.printInOrder();
    System.out.print("Pre order: ");
    tree.printPreOrder();
    System.out.print("Post order: ");
    tree.printPostOrder();

    //delete a node with one child (left only)
    BST smallTree = new BST();
    smallTree.add("B");
    smallTree.add("A");
    smallTree.printInOrder();
    System.out.print("Pre order: ");
    smallTree.printPreOrder();
    System.out.print("Post order: ");
    smallTree.printPostOrder();
    System.out.println("\nSize of tree: " + smallTree.size());
    System.out.println("delete \"A\": " + smallTree.delete("A"));
    System.out.println("\nSmall Tree after removing letter A");
    System.out.print("In order: ");
    smallTree.printInOrder();
    System.out.print("Pre order: ");
    smallTree.printPreOrder();
    System.out.print("Post order: ");
    smallTree.printPostOrder();
    System.out.println("\nSize of tree: " + tree.size());
    
 }//end main
 }//end BSTTester