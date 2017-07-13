package Assign1;
import java.util.Queue;
import java.util.LinkedList;

public class BreadthFirstSearch {

    public void runBFS(Board b, Paths p) {
        Node curr;
        Queue<Node> q = new LinkedList<Node>();
        q.add(b.grid[0][0]);
        while (q.peek() != null) {
            curr = q.poll();
            System.out.println("This Node: "+curr.x+", "+curr.y);
            if (curr.x == b.dest.x && curr.y == b.dest.y) {
                System.out.println("Success!");
                break;
            }
            System.out.println("Children: " + curr.children);
            for (Node child : curr.children) {
                System.out.println(child.x+","+child.y);
                if (!child.isBlocked) {
                    q.add(child);
                }
            }
        }
    }
}
