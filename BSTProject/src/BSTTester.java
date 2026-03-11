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
    System.out.println("Tree is empty?: " + tree.isEmpty());
    System.out.println("Size of tree: " + tree.size());

    //testing find method
    System.out.println("\n\nTesting find method:");
    System.out.println("Find root node \"O\": " + tree.find("O"));
    System.out.println("Find middle node \"Q\": " + tree.find("Q"));
    System.out.println("Find leaf node \"N\": " + tree.find("N"));
    System.out.println("Find nonexistent node \"Z\": " + tree.find("Z"));


    //testing delete method 
    System.out.println("\n\nTesting delete method:");
    System.out.println("Deleting a nonexistent value \"Z\": " + tree.delete("Z"));
    
    //delete a lead node (no children)
    BST noChildren = new BST();
    noChildren.add("A");
    System.out.println("\nCase 1: delete node with no children");
    System.out.println("{---BEFORE---}");
    System.out.print("In order: ");
    noChildren.printInOrder();
    System.out.print("Pre order: ");
    noChildren.printPreOrder();
    System.out.print("Post order: ");
    noChildren.printPostOrder();
    noChildren.delete("A");
    System.out.println("\n{---AFTER---}");
    System.out.print("In order: ");
    noChildren.printInOrder();
    System.out.print("Pre order: ");
    noChildren.printPreOrder();
    System.out.print("Post order: ");
    noChildren.printPostOrder();

    //delete a node with one child (left only)
    System.out.println("\nCase 2: delete node with 1 children (left)");
    BST smallTree = new BST();
    smallTree.add("M");
    smallTree.add("G");
    System.out.println("{---BEFORE---}");
    System.out.print("In order: ");
    smallTree.printInOrder();
    System.out.print("Pre order: ");
    smallTree.printPreOrder();
    System.out.print("Post order: ");
    smallTree.printPostOrder();
    System.out.println("\n{---AFTER---}");
    smallTree.delete("M");
    System.out.print("In order: ");
    smallTree.printInOrder();
    System.out.print("Pre order: ");
    smallTree.printPreOrder();
    System.out.print("Post order: ");
    smallTree.printPostOrder();

    //delete node with 1 child (right)
    System.out.println("\nCase 2: delete node with 1 children (left)");
    BST mini = new BST();
    mini.add("M");
    mini.add("T");
    System.out.println("{---BEFORE---}");
    System.out.print("In order: ");
    mini.printInOrder();
    System.out.print("Pre order: ");
    mini.printPreOrder();
    System.out.print("Post order: ");
    mini.printPostOrder();
    System.out.println("\n{---AFTER---}");
    mini.delete("M");
    System.out.print("In order: ");
    mini.printInOrder();
    System.out.print("Pre order: ");
    mini.printPreOrder();
    System.out.print("Post order: ");
    mini.printPostOrder();
    
 }//end main
 }//end BSTTester