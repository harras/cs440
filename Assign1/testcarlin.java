package Assign1;

public class testcarlin {
    public static void main(String[] args) {
        Board a = new Board(12,12,0.2);
        a.print();
        Paths p = new Paths(a);
        System.out.println(p.exists(new Node(0,0,0.2,new Node[2][2])));
        BreadthFirstSearch s = new BreadthFirstSearch();
        TreeNode path = s.runBFS(a);
        a.updateBoard(path);
        a.print();
    }
}
