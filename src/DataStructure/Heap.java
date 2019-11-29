package DataStructure;

import java.util.Vector;

/**
 * Description: Implemented Data Structure Heap.
 * Basic Operation:
 * Insert - O(nlogn)
 * Delete - O(nlogn)
 * Search - O(logn)
 */

public class Heap {
    private Vector<Integer> tree;
    public Heap(){
        tree = new Vector<Integer>(0,0);
//        System.out.println("Create heap");
    }

    public int findMax(){
        if (!tree.isEmpty())
            return tree.get(1);
        else
            return -1;
    }

    public boolean isEmpty(){
        return tree.isEmpty();
    }

}
