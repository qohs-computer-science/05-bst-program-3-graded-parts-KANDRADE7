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
    //test add method
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
    System.out.println("Intial tree:");
    System.out.print("In order: ");
    tree.printInOrder();
    System.out.print("Pre order: ");
    tree.printPreOrder();
    System.out.print("Post order: ");
    tree.printPostOrder();
    System.out.println("\nSize of tree: " + tree.size());

    //testing find method
    System.out.println("\n\nTesting find method:");
    System.out.println(tree.find("O"));
    System.out.println(tree.find("E"));
    System.out.println(tree.find("R"));
    System.out.println(tree.find("Q"));

    //testing delete method 
    tree.delete("O");
    System.out.println("\nTree after removing letter O");
    System.out.print("In order: ");
    tree.printInOrder();
    System.out.print("Pre order: ");
    tree.printPreOrder();
    System.out.print("Post order: ");
    tree.printPostOrder();
    System.out.println("\nSize of tree: " + tree.size());
    System.out.println(tree.find("O"));

    tree.delete("E");
    System.out.println("\nTree after removing letter E");
    System.out.print("In order: ");
    tree.printInOrder();
    System.out.print("Pre order: ");
    tree.printPreOrder();
    System.out.print("Post order: ");
    tree.printPostOrder();
    System.out.println("\nSize of tree: " + tree.size());
    System.out.println(tree.find("E"));
    
 }//end main
 }//end BSTTester