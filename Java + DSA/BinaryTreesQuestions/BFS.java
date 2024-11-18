package BinaryTreesQuestions;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;

import javax.swing.tree.TreeNode;

import org.w3c.dom.Node;
public class BFS {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        // bt.populate(sc);
        bt.display();
    }
// BFS TRAVERSAL OR LEVEL VISE TRAVERSAL 
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
            if(root==null) {
                return result;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while(!queue.isEmpty()) {
                int levelSize = queue.size();
                ArrayList<Integer> currentLevelElements = new ArrayList<>();
                for(int i =0;i<levelSize;i++) {
                    TreeNode node = queue.poll();
                    if(node.left!=null) {
                        queue.offer(node.left);
                    }
                    if(node.right!=null) {
                        queue.offer(node.right);
                    }
                    currentLevelElements.add(node.val);
                }
                result.add(currentLevelElements);
            }

        return result;
    }

    // AVERAGE OF EACH LEVEL OF BINARY TREE SOLVED WITH BFS AGAIN 
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>  result = new ArrayList();
        if(root==null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int levelSize = queue.size();
           double averageOfCurrentLevel = 0;
            for(int i =0;i<levelSize;i++) {
                TreeNode node = queue.poll();
                if(node.left!=null) {
                    queue.offer(node.left);
                }
                if(node.right!=null) {
                    queue.offer(node.right);
                }
                averageOfCurrentLevel+=node.val;
            }
            result.add(currentLevelElements/levelSize);
        }

    return result;
    }

// RETURN THE SUCCESSOR OF THE GIVEN NODE AGAIN SOLVED WITH BFS
    public TreeNode levelOrderSuccessor(TreeNode root,int value) {
        List<Integer>  result = new ArrayList();
        if(root==null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if(node.left!=null) {
                    queue.offer(node.left);
                }
                if(node.right!=null) {
                    queue.offer(node.right);
                }
                if(value==node.val) {
                    if(!queue.isEmpty()) {
                        return queue.peek();
                    }
                }
            
        }
    return null;
    }
// ZIG ZAG LEVEL ORDER TRAVERSAL MODIFIED THE BFS TRAVERSAL TO THIS 
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
            if(root==null) {
                return result;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            int level=0;
            boolean reverse = false;
            while(!queue.isEmpty()) {
                int levelSize = queue.size();
                ArrayList<Integer> currentLevelElements = new ArrayList<>();
                for(int i =0;i<levelSize;i++) {
                    TreeNode node = queue.poll();
                    if(!reverse) {
                        if(node.right!=null) {
                            queue.offer(node.right);
                        }
                        if(node.left!=null) {
                            queue.offer(node.left);
                        }
                    }
                    else {
                        if(node.left!=null) {
                            queue.offer(node.left);
                        }
                        if(node.right!=null) {
                            queue.offer(node.right);
                        }
                    }
                    
                    currentLevelElements.add(node.val);
                }
                result.add(currentLevelElements);
                reverse = !reverse;
            }
        return result;
    }
// ZIG ZAG TRAVERSAL BY KUNAL KUSHWAHA MODIFIED BFS 
    public List<List<Integer>> zigzagTraversal2(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
            if(root==null) {
                return result;
            }
            Deque<TreeNode> dqueue = new LinkedList<>();
            dqueue.addFirst(root);
            
            int level=0;
            while(!dqueue.isEmpty()) {
                int levelSize = dqueue.size();
                ArrayList<Integer> currentLevelElements = new ArrayList<>();
                for(int i =0;i<levelSize;i++) {
                    if(level%2==0) {
                        TreeNode node = dqueue.removeFirst();
                            if(node.left!=null) {
                                dqueue.addLast(node.left);
                            }
                            if(node.right!=null) {
                                dqueue.addLast(node.right);
                            } 
                        }
                        else {
                            TreeNode node = dqueue.removeLast();
                            if(node.left!=null) {
                                dqueue.addFirst(node.left);
                            }
                            if(node.right!=null) {
                                dqueue.addFirst(node.right);
                            } 
                        }
                    }
                    level+=1;
                    currentLevelElements.add(node.val);
                    result.add(currentLevelElements);
                }
                
                return result;
            }
            // POPULATE NEXT RIGHT POINTER OF EACH NODE ie CONNECT NEXT POINTER OF EACH NODE TO THE RIGHT IN ITS LEVEL

            public Node connect1(Node root) {
                Node temp = root;
                List<List<Integer>> result = new ArrayList();
                if (root == null) {
                    return temp;
                }
                Queue<Node> queue = new LinkedList<>();
                queue.offer(root);
                while (!queue.isEmpty()) {
                    int levelSize = queue.size();
                    ArrayList<Integer> currentLevelElements = new ArrayList<>();
                    for (int i = 0; i < levelSize; i++) {
                        Node node = queue.poll();
                        if(i==levelSize-1) {
                            node.next==null;
                        }
                        else {
                            node.next = queue.peek();
                        }
                        if (node.left != null) {
                            queue.offer(node.left);
                        }
                        if (node.right != null) {
                            queue.offer(node.right);
                        }
                        currentLevelElements.add(node.val);
                    }
                    result.add(currentLevelElements);
                }

                return temp;

            }

            public Node connect(Node root) { 
                if(root.left==null) {
                    return root;
                }
                root.left.next = root.right;
                if(root.next!=null) {
                    root.right.next=root.next.left;
                }
                root.left = connect(root.left);
                root.right = connect(root.right);
                return root;
            }

            // QUESTION 6 - RIGHT HAND SIDE VIEW OF THE BINARY TREE 
            // Approach - Return the last element of the whole level by traversing level order traversal 
            public List<Integer> rightSideView(TreeNode root) {
                List<Integer> result = new ArrayList();
                    if(root==null) {
                        return result;
                    }
                    Queue<TreeNode> queue = new LinkedList<>();
                    queue.offer(root);
                    while(!queue.isEmpty()) {
                        int levelSize = queue.size();
                        // ArrayList<Integer> currentLevelElements = new ArrayList<>();
                        for(int i =0;i<levelSize;i++) {
                            TreeNode node = queue.poll();
                            if(i==levelSize-1) {
                                result.add(node.val);
                            }
                            if(node.left!=null) {
                                queue.offer(node.left);
                            }
                            if(node.right!=null) {
                                queue.offer(node.right);
                            }
                            // currentLevelElements.add(node.val);
                        }
                        // result.add(currentLevelElements);
                    }
        
                return result;
            }
        //  CHECK WHETHER GIVEN TWO NODE VALUES ARE COUSINS OF EACH OTHER 
                public boolean isCousins(TreeNode root, int x, int y) {
                        if(root==null) {
                            return false;
                        }
                        TreeNode xx = findNode(root,x);
                        TreeNode yy = findNode(root,y);
                        
                        return (level(root,xx,0) == level(root,yy,0) && !isSibling(root,xx,yy));
            
                }
                private TreeNode findNode(TreeNode node,int x) {
                    if(node==null) {
                        return null;
                    }
                    if(node.val==x) {
                        return node;
                    }
                    TreeNode answer = findNode(node.left,x);
                    if(answer==null) {
                        answer = findNode(node.right,x);
                    }
                    return answer;
                }
                private boolean isSibling(TreeNode node, TreeNode x,TreeNode y) {
                    if(node==null) {
                        return false;
                    }
                    if(node.left==x && node.right==y) {
                        return true;
                    }
                    else if(node.left==y && node.right==x) {
                        return true;
                    }
                    boolean answer = isSibling(node.left,x,y);
                    if(!answer) {
                        answer=isSibling(node.right,x,y);
                    }
                    return answer;
                }
                private int level(TreeNode node , Treenode x,int level) {
                    if(node==null) {
                        return 0;
                    }
                    if(node==x)  {
                        return level;
                    }
                    int l = level(node.left,x,level+1);
                    if(l!=0) {
                        return l;
                    }
                    l=level(node.right,x,level+1);
                    return l;

                }

                // QUESTION - CHECK WHETHER THE LEFT AND RIGHT PART OF THE TREE IS SYMMETRIC OR NOT 
                public boolean isSymmetric(TreeNode root) {
                    Queue<TreeNode> queue = new LinkedList<>();
                    // TreeNode left = root.left;
                    // TreeNode right = root.right;
                    queue.offer(root.left);
                    queue.offer(root.right);
                    while(!queue.isEmpty()) {
                        TreeNode left = queue.poll();
                        TreeNode right = queue.poll();
                        if(left.val!=right.val) {
                            return false;
                        }
                        if(left==null || right==null) {
                            return false;
                        }
                        if(left==null && right==null) {
                            continue;
                        }
                        queue.add(left.left);
                        queue.add(right.right);
                        queue.add(left.right);
                        queue.add(right.left);
                    
                    }
                    return true;
                }
        
    }

