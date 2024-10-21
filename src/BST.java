package src;

public class BST {

    private Node root;

    public static class Node {
        public int value;
        private Node left, right;
        private int size;

        public Node(int value, int size) {
            this.value = value;
            this.size = size;
        }
    }

    public BST() {
    }

    private int size(Node root) {
        return root == null ? 0 : 1 + size(root.left) + size(root.right);
    }

    public void put(int value){
        root = put(root, value);
    }

    private Node put(Node root, int value) {
        if (root == null) return new Node(value, 1);
        if (value < root.value) root.left = put(root.left, value);
        else if (value > root.value) root.right = put(root.right, value);
        root.size = size(root);
        return root;
    }

    public Node get(int value) {
        return get(root, value);
    }

    private Node get(Node root, int value) {
        if(root == null) return null;
        if (value < root.value) return get(root.left, value);
        else if (value > root.value) return get(root.right, value);
        else return root;
    }

    // JERE PERISIC
    public void postorder() {
        postOrder(root);
    }

    private void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " ");
    }

    // BRYAN KAZAKA

    public void preorder(){
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
        }

    // HARRY
    public void inorder(){
        inOrderTraverse(root);
    }

    private void inOrderTraverse(Node root) {
        // Base case: if we meet null node, return
        if (root == null) return;
        inOrderTraverse(root.left);
        System.out.print(root.value + " ");
        inOrderTraverse(root.right);
    }
}

