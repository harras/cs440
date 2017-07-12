package Assign1;

public class testcarlin {
    public static void main(String[] args) {
        Board a = new Board(10,10,0.2);
        a.print();
        Paths p = new Paths(0,0);
        System.out.println(p.exists(new Node(0,0,0.2,new Node[2][2])));
    }
}
