package BinaryTreesQuestions;

import java.util.Scanner;

public class BinaryTree {
  BinaryTree() {

  }

  private static class Node {
    private int value;
    Node left;
    Node right;

    // Cunstructor
    public Node() {
      this.left = null;
      this.right = null;
    }

    public Node(int value) {
      this.value = value;
      
    }
  }

  private Node root;

  // INSERTION IN TREE FUNCTION
  public void populate(Scanner scanner) {
    System.out.println("Enter the value of Root node ");
    int value = scanner.nextInt();
    root = new Node(value);
    populate(scanner, root);
  }

  private static void populate(Scanner scanner, Node node) {
    System.out.println("Do you want to enter in left of " + node.value);
    boolean left = scanner.nextBoolean();
    if (left) {
      System.out.println("Please enter the value at left of " + node.value);
      int leftValue = scanner.nextInt();
      node.left = new Node(leftValue);
      populate(scanner, node.left); // by this statement the recurrsion will go on left node
    }
    System.out.println("Do you want to enter in the right of " + node.value);
    boolean right = scanner.nextBoolean();
    if (right) {
      System.out.println("Please enter the value at right of " + node.value);
      int rightValue = scanner.nextInt();
      node.right = new Node(rightValue);
      populate(scanner, node.right);
    }
  }

  // DISPLAY TREE IN LINE FUNCTION
  public void display() {
    display(root, "");
  }

  private void display(Node node, String indent) {
    if (node == null) {
      return;
    }
    // Else print the value the value of node
    System.out.print(node.value + indent + "\t");
    // Call to print for left tree
    display(node.left, "");
    display(node.right, "");
  }

  // PROPER PRETTY DISPLAY FUNCTION
  public void prettyDisplay() {
    prettyDisplay(root, 0);
  }

  private void prettyDisplay(Node node, int level) {
    if (node == null) {
      return;
    }
    prettyDisplay(node.right, level + 1);
    if (level == 0) {
      System.out.println(node.value);
    } else {
      for (int i = 0; i < level - 1; i++) {
        System.out.print("|\t\t");
      }
      System.out.println("|------>" + node.value);
    }
    prettyDisplay(node.left, level + 1);
  }
}