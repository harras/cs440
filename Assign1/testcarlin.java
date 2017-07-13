package Assign1;

public class testcarlin {
    public static void main(String[] args) {
        Board a = new Board(10,10,0.2);
        a.print();
        BreadthFirstSearch s = new BreadthFirstSearch();
        AStar as = new AStar();
        TreeNode euclidPath = as.euclideanSearch(a);
        a.updateBoard(euclidPath);
        a.print();
        a.eraseBoard(euclidPath);
        TreeNode path = s.runBFS(a);
        a.updateBoard(path);
        a.print();
    }
}
