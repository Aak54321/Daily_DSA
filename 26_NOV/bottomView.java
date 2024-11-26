import java.util.*;

// Class to represent a pair of objects
class Pair<U, V> {
    public U first;
    public V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }
}

public class bottomView {
    public ArrayList<Integer> bottomview(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;

        // map -> (vertical index, node.val)
        Map<Integer, Integer> map = new TreeMap<>();
        // q -> (node object, vertical index)
        Queue<Pair<Node, Integer>> q = new LinkedList<>();

        q.add(new Pair<>(root, 0));
        while (!q.isEmpty()) {
            Pair<Node, Integer> curr = q.poll();
            int level = curr.second;

            // Always update the map to store the most recent (bottom-most) node for a level
            map.put(level, curr.first.val);

            if (curr.first.left != null) {
                q.add(new Pair<>(curr.first.left, level - 1));
            }

            if (curr.first.right != null) {
                q.add(new Pair<>(curr.first.right, level + 1));
            }
        }

        // Extract the bottom view from the map
        for (int mapV : map.values()) {
            ans.add(mapV);
        }
        return ans;
    }

    public static void main(String[] args) {
        // Creating a binary tree:
        //           1
        //         /   \
        //        2     3
        //         \   / \
        //          4 5   6
        //         /       \
        //        7         8

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.left.right.left = new Node(7);
        root.right.right.right = new Node(8);

        // Create an instance of bottomView and call the bottomview method
        bottomView bv = new bottomView();
        ArrayList<Integer> result = bv.bottomview(root);

        // Print the bottom view of the tree
        System.out.println("Bottom view of the tree: " + result);
    }
}

// Assuming a Node class exists
class Node {
    public int val;
    public Node left, right;

    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
