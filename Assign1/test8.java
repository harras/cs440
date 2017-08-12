package Assign1;

public class test8 {
    public static int EXPAND_DONG;

    public static void main(String[] args) {
        BreadthFirstSearch bs = new BreadthFirstSearch();
        DepthFirstSearch ds = new DepthFirstSearch();
        int iter = 100;
        int totalexpand = 0;
        for (int i = 1; i<=iter; i++) {
            EXPAND_DONG = 0;
            Board b = new Board(10,10,0.0);
            ds.runDFS(b);
            totalexpand += EXPAND_DONG;
        }
        System.out.println((double)totalexpand/iter);
    }
}
