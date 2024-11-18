import javax.swing.tree.TreeNode;
import java.util.*;

public class DFSQuestions {
    //  DIAMETER OF THE BINARY TREE ie LONGEST PATH FROM DOWN TO UP 
    int diameter =0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter-1;
    }
    private int height(TreeNode node) {
        if(node==null) {
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        int dia = leftHeight+rightHeight+1;
        if(dia>diameter) {
            diameter=dia;
        }
         
        return (Math.max(leftHeight,rightHeight)+1);
    }
    
    // INVERT A BINARY TREE 
    public TreeNode invertTree(TreeNode root) {
        if(root==null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        // swap the left and right node
        root.left = right;
        root.right = left; 
        return root;
    }

    // CONVERT THE ARRAY TO BINARY TREE 
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = sortedArrayToBST(nums,0,nums.length-1);
        return root;
    }
    private TreeNode sortedArrayToBST(int[] nums,int start,int end) {
        if(start>end) {
            return  null;
        }
        int mid = (start+end)/2;
        TreeNode root = populate(nums[mid]);
        sortedArrayToBST(nums,start,mid-1);                                          
        sortedArrayToBST(nums,mid+1,end);
        return root;
    }
    private TreeNode populate(int value) {
        TreeNode root = populate(root,value);
        return root;
    }
    private TreeNode populate(TreeNode node , int value) {
        if(node==null) {
            return new TreeNode(value);
        }
        if(value<node.val) {
            node.left = populate(node.left,value);
        }
        if(value>node.val) {
            node.right = populate(node.right,value);
        }
        return node;
    }

    public void flatten(TreeNode root) {
        TreeNode current = root;
        while(current!=null) {
            if(current.left!=null) {
                TreeNode temp = current.left;
                while(temp.right!=null) {
                    temp = temp.right;
                }   
                temp.right=current.right;
                current.right = current.left;
                current.left = null;
                
            }
            current = current.right;
           
        }
        
    }

    public boolean isValidBST(TreeNode root) {
        return helper(root);
    }
    private boolean helper(TreeNode node, Integer low, Integer high) {
        if(node==null) {
            return true;
        }
        if(low!=null && node.val<=low) {
            return false;
        }
        if(high!=null && node.val>=high) {
            return false;
        }
        boolean answer1 = helper(node.left,low,node.val);
        boolean answer2 = helper(node.right,node.val,high);
        return answer1&&answer2;
    }
    // LOWEST COMMON PARENT OR ANCESTOR OF THE TWO NODES 
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root ==null) {
            return null;
        }
        if(root.val == p || root.val==q) {
            return root;
        }
        TreeNode leftTree = lowestCommonAncestor(root.left,p,q);
        TreeNode rightTree = lowestCommonAncestor(root.right,p,q);
        if(leftTree!=null && rightTree!=null) {
            return root;  // This is only the common ancestor if both leftTree and Righttree are not equal to nulll
        }
        if(leftTree!=null) {
            return leftTree;
        }
         return rightTree; 
    }

    // CONSTRUCT BINARY TREE FROM INORDER AND PREORDER TRAVERSAL 
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0) {
            return null;
        }
        int root = preorder[0];
        int index=0;
        // Search the root in the inorder array now 
        for(int i=0;i<inorder.length;i++) {
            if(root==inorder[i]) {
                index = i;
                break;
            }
        }
        // Create the root 
        TreeNode node = new TreeNode(root);
        node.left = buildTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));
        node.right = buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));
        return node;
    }


    // SERIALIZING THE TREE AND DESEARILZING THE TREE ie CONVERTING THE TREE TO STRING AND THEN REGENERATING THE SMAE TREE USING THE STRING WE CREATED 
    public List<String> serialize(TreeNode node) {
        List<String> list = new ArrayList<>();
        helper(node,list);
        return list;
    }
    public void helper(TreeNode node, List<String> list) {
        if(node==null) {
            list.add("null");
            return;
        }
        list.add(String.valueOf(node.val));
        helper(node.left,list);
        helper(node.right,list);
    }

    // Deseializing ie making the tree back from the string generated 
    public ListNode deserialize(List<String> list) {
        Collections.reverse(list);
        TreeNode node = helper2(list);
        return node;
    }
    TreeNode helper2(List<String> list) {
        String val = list.remove(list.size()-1);
        if(val.charAt(0)=='n') {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = helper2(list);
        node.right = helper2(list);
        return node;
    }


    // CALCULATING PATH SUM FROM ROOT TO LEAF 
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null ) {
            if(targetSum==0) {
                return true;
            }
            return false;
        }
        if(root.val==targetSum && root.left==null && root.right==null) {
            return true;
        }
        
        boolean leftTree = hasPathSum(root.left,targetSum-root.val);
        boolean rightTree = hasPathSum(root.right,targetSum-root.val);
        return leftTree || rightTree;
    }


    // From root leaf to leaf it's one single number need to join the digits and make the number and then calculate the sum of all the paths their is all the different different numbers. 
    public int sumNumbers(TreeNode root) {
        return helper(root,0);
    }

    private Integer helper(TreeNode node,Integer number) {
        if(node==null) {
            return 0;
        }
        // When it goes on leaf node it calculates number and directly return it | it then don't go on leaf.left and leaf.right
        if(node.left==null && node.right==null) {
            number = number*10+node.val;
            return number;
        }
        else {
            number = number*10+node.val;
        }
        int left = helper(node.left,number);
        int right = helper(node.right,number);
        
        return left+right;   
}

int max =0;
public int maxPathSum(TreeNode root) {
    helper(root);
    return max;   
}
private int helper(TreeNode root) {
    if(root==null) {
        return 0;
    }
    int leftTree = helper(root.left);
    int rightTree = helper(root.right);
    leftTree = Math.max(0,leftTree);
    rightTree = Math.max(0,rightTree);
    int currentPath = leftTree + rightTree + root.val;
    if(currentPath>max) {
        max = currentPath;
    }
    return Math.max(leftTree,rightTree) + root.val;
}

// PATH GIVEN IN ARRAY , WE  NEED TO CHECK WHETHER IT EXISTS IN THE TREE OR NOT.
public boolean pathCheck(TreeNode root,int[] arr ) {
    if(root==null) {
        return arr.length==0;
    }
    return pathCheck(root,arr,0);
}
public boolean pathCheck(TreeNode node, int[] arr,int i) {
    if(node==null) {
        return false;
    }
    if(i>=arr.lenght || node.val != arr[i]) {
        return false;
    }
    if(node.left==null && node.right==null && index=arr.length-1) {
        return true;
    }
    boolean left = pathCheck(node.left,arr,i++);
    boolean right = pathCheck(node.right,arr,i++);
    return left||right; 
}

// COUNT OF NUMBER OF PATHS MAKE THE GIVEN SUM 
int countPaths(Node node,int sum) {
    List<Integer> path = new ArrayList();
    return helper(node,sum,path);
}
int helper(Node node, int sum, List<Integer> path) {
    if(node==null) {
        return 0;
    }
    path.add(node.val);
    int s=0;
    int count=0;

    // check the number of path exists
    ListIterator<Integer> itr = path.listIterator(path.size());
    while(itr.hasPrevious()) {
        s+=itr.previous();
        if(s==sum) {
            count++;
        }
    }


    itr.previous(path.size());
    // itterate the path array and check the path which makes the sum of 4

    count+= helper(node.left,sum,path) + helper(node.right,sum,path);
    // backtrack and remove the elemetn added
    path.remove(path.size()-1);
    return count;
}

//  DFS USING ITTERATIVE APPROACH USING STACK 
void dfsStackPreorder(Node node) {
    if(node==null) {
        return;
    }
    Stack<Integer> stack = new Stack<>();
    stack.push(node.val);
    while(!stack.isEmpty()) {
        int removed =  stack.pop();
        System.out.print(removed + " ");
        if(node.right!=null) {
            stack.push(node.right);
        }
        if(node.left!=null) {
            stack.push(node.left);
        }
        
    }

}

