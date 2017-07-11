package Assign1;

/**
 * Created by Nicholas Harras on 7/10/2017.
 */
public class Main {
    public static void BFS(Node src, Node dest){
        Queue queue = new Queue(src);
        while (!queue.isEmpty()){
            Node current = queue.dequeue();


        }
    }


    public static void main(String[] args) {
        int length = 5;
        int width = 5;
        double p = 0.3;
        Node[][] grid = new Node[length][width];

        //Initializes all the cells of the grid
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                grid[i][j] = new Node(i, j, p);
            }
        }

        //Sets source and dest to 'clear'
        Node src = grid[0][0];
        Node dest = grid[length-1][width-1];
        src.isClear = true;
        dest.isClear = true;

        //BFS(src, dest);

        //Prints the grid
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                if(grid[i][j] == src || grid[i][j] == dest){
                    System.out.print(" X ");
                }
                else if(grid[i][j].isClear == true){
                    System.out.print(" _ ");
                }
                else{
                    System.out.print("[_]");
                }
            }
            System.out.println();
        }
    }
}
