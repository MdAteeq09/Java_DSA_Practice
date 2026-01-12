public class closestEleinBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    public static int closestVal(Node root, int target) {
        int closest = root.data;

        while (root != null) {
            if(Math.abs(root.data - target) < Math.abs(closest - target)) {
                closest = root.data;
            }

            if(target < root.data) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        //tree creation
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right = new Node(11);
        root.right.right = new Node(20);

        int k = 2;

        System.out.println(closestVal(root, k));
    }
}
