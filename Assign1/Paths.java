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
        this.exists(src).addChild(new TreeNode(child.x, child.y));
        return;
    }

    // Needs to be finished
    public TreeNode shortestPath() {
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(this.root);
        while(!s.empty()) {

        }
    }
}

/*
class TreeNodeQueue<T extends TreeNode> implements Queue<T> {
}
*/

class TreeNode {
    public int x;
    public int y;
    public TreeNode parent;
    public ArrayList<TreeNode> children;

    public TreeNode() {
        this.parent = null;
        this.children = new ArrayList<TreeNode>();
    }

    public TreeNode(int x, int y) {
        this.x = x;
        this.y = y;
        this.parent = new TreeNode();
        this.children = new ArrayList<TreeNode>();
    }

    public void addChild(TreeNode child) {
        child.parent = this;
        this.children.add(child);
        return;
    }
}
