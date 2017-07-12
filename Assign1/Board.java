package Assign1;

public class Board {
    public Node[][] grid;
    private int length;
    private int width;
    private double p;
    private Node src;
    private Node dest;

    public Board(int length, int width, double p) {
        this.grid = new Node[length][width];
        this.length = length;
        this.width = width;

        //Initializes all the cells of the grid
        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < this.width; j++) {
                this.grid[i][j] = new Node(i, j, p, this.grid);
            }
        }
        //Sets source and dest to 'clear'
        this.src = this.grid[0][0];
        this.dest = this.grid[length-1][width-1];
        this.src.isBlocked = false;
        this.dest.isBlocked = false;
    }

    public int length() {
        return this.length;
    }

    public int width() {
        return this.width;
    }

    public void print() {
        //Prints the grid
        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < this.width; j++) {
                if(this.grid[i][j] == this.src || this.grid[i][j] == this.dest){
                    System.out.print(" X ");
                }
                else if(this.grid[i][j].isBlocked == false){
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
