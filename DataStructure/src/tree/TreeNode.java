package tree;


// 이진순회 자료구조
// TreeNode 기본구조
public class TreeNode {
    Object data;
    TreeNode left;
    TreeNode right;
}

class LinkedTree {
    private TreeNode root;

    public TreeNode makeBT(TreeNode bt1, TreeNode bt2, Object data) {
        TreeNode root = new TreeNode();
        this.root.data = data;
        this.root.left = bt1;
        this.root.right = bt2;
        return root;
    }

    public void preorder(TreeNode root) {
        if (root != null) {
            System.out.printf("%c", root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void inoder(TreeNode root) {
        if (root != null) {
            inoder(root.left);
            System.out.printf("%c", root.data);
            inoder(root.right);
        }
    }

    public void postorder(TreeNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.printf("%c", root.data);
        }
    }
}

class Test {
    public void main(String[] args) {
        LinkedTree T = new LinkedTree();




    }
}
