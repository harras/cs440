package Assign1;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.ArrayList;

public class Paths {

    public TreeNode root;
    private Board metadata;

    public Paths(Board b) {
        this.root = new TreeNode(b.src.x, b.src.y);
        this.metadata = b;
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
        TreeNode n = new TreeNode(child.x, child.y, this.exists(src));
        this.exists(src).addChild(n);
        return;
    }

    // Needs to be finished
    public TreeNode shortestPath() {
        Stack<TreeNode> s = new Stack<TreeNode>();
        int currentDepth = 0;
        int minDepth = -1;
        TreeNode route = null;
        s.push(this.root);
        while(!s.empty()) {
            TreeNode curr = s.pop();
            if (curr.hasNoChildren() && curr.x == this.metadata.dest.x && curr.y == this.metadata.dest.y) {
                System.out.println(curr.depth);
                if (minDepth == -1) {
                    route = curr;
                    minDepth = curr.depth;
                } else if (minDepth > curr.depth) {
                    route = curr;
                    minDepth = curr.depth;
                }
            }
            for (TreeNode t : curr.children) {
                s.push(t);
            }
        }
        return route;
    }
}
