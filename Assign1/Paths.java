package Assign1;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.ArrayList;

public class Paths {

    public TreeNode root;

    public Paths(int startX, int startY) {
        this.root = new TreeNode(startX, startY);
    }

    public TreeNode exists(Node n) {
        TreeNode curr = root;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(curr);
        while(q.peek() != null) {
            TreeNode tn = q.poll();
            if(tn.x == n.x && tn.y == n.y) {
                return tn;
            }
            for (TreeNode child: tn.children) {
                q.add(child);
            }
        }
        return null;
    }

    public void addChild(Node src, Node child) {
        if (this.exists(child) != null) {
            return;
        }
        TreeNode n = new TreeNode(child.x, child.y, new TreeNode(child.x, child.y));
        this.exists(src).addChild(n);
        return;
    }

    // Needs to be finished
    public void shortestPath() {
        Stack<TreeNode> s = new Stack<TreeNode>();
        int currentDepth = 0;
        int minDepth = -1;
        s.push(this.root);
        while(!s.empty()) {
            TreeNode curr = s.pop();
            if (curr.hasNoChildren()) {
            }
        }
    }
}
