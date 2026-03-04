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
    //inorder
    System.out.print("In order: ");
    tree.printInOrder();

     //pre order
    System.out.print("Pre order: ");
    tree.printPreOrder();

     //post order
    System.out.print("Post order: ");
    tree.printPostOrder();

    //testing find method
    System.out.println("\n" + tree.find("A"));
    System.out.println(tree.find("O"));
    System.out.println(tree.find("Z"));

    tree.delete("O");


    
 }//end main
 }//end BSTTester