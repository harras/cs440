package Assign1;

import java.lang.*;

/**
 * Created by Nicholas Harras on 7/10/2017.
 */
public class Node {
    public int x;
    public int y;
    public Boolean isClear;
    //private int f;
    //private int g;
    //private int h;
    public Node next;

    public Boolean getClarity(double p){
        if(Math.random() >= p){
            return true;
        }
        else{
            return false;
        }
    }

    public Node(int x, int y, double p){
        this.x = x;
        this.y = y;
        this.isClear = getClarity(p);
        this.next = null;
    }

    public Node(int x, int y, double p, Node next){
        this.x = x;
        this.y = y;
        this.isClear = getClarity(p);
        this.next = next;
    }
}
