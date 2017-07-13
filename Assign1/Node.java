package Assign1;

import java.lang.*;
import java.util.ArrayList;

public class Node {
    public int x;
    public int y;
    public Boolean isBlocked;
    public Boolean isDiscovered;
    public Boolean isPath = false;
    //private int f;
    //private int g;
    //private int h;
    public Node next; // To be used for stacks and queues
    public Node north; // Used to keep track of neighbors
    public Node south;
    public Node east;
    public Node west;
    public ArrayList<Node> children;

    public Boolean getIsBlocked(double p){
        if(Math.random() >= p){
            return false;
        }
        else{
            return true;
        }
    }

    public Node(int x, int y, double p, Node[][] grid){
        this.x = x;
        this.y = y;
        this.isBlocked = getIsBlocked(p);
        this.isDiscovered = false;
        this.next = null;

        this.north = null;
        this.south = null;
        this.east = null;
        this.west = null;
        this.children = new ArrayList<Node>();
        //System.out.println("This Node: "+this.x+", "+this.y);
        /*
        if(x > 0) {
            System.out.println((x-1)+","+y);
            this.north = grid[x - 1][y];
            this.children.add(grid[x - 1][y]);
        }
        if(x < Main.length-1) {
            System.out.println((x+1)+","+y);
            this.south = grid[x + 1][y];
            this.children.add(grid[x + 1][y]);
        }
        if(y < Main.width-1) {
            System.out.println(x+","+(y+1));
            this.east = grid[x][y + 1];
            this.children.add(grid[x][y + 1]);
        }
        if(y > 0) {
            System.out.println((x)+","+(y-1));
            this.west = grid[x][y - 1];
            this.children.add(grid[x][y - 1]);
        }*/
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
