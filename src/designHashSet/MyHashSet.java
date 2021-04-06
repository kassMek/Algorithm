package designHashSet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyHashSet {

    /*
            Design a HashSet without using any built-in hash table libraries.
            Implement MyHashSet class:
            void add(key) Inserts the value key into the HashSet.
           bool contains(key) Returns whether the value key exists in the HashSet or not.
           void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.

     */

     private final int MAX_SIZE=1000000;
     private final int ARRAY_SIZE=100;
     private List<List<Integer>> paresnList;
    /** Initialize your data structure here. */
    public MyHashSet() {
       paresnList= new ArrayList<>(ARRAY_SIZE);
        for( int i=0;i<ARRAY_SIZE;i++){
            paresnList.add(null);
        }
    }

    public  void add(int key) {
        int index=key % ARRAY_SIZE;
        List<Integer> childList=paresnList.get(index);
        if(childList==null){
            List<Integer> list= new LinkedList<>();
            list.add(key);
            paresnList.set(index,list);
        }
        else{
            if(!childList.contains(key)){
                childList.add(key);
            }
        }

    }

    public void remove(int key) {
        int index=key % ARRAY_SIZE;
        List<Integer> childList=paresnList.get(index);
        if(childList!=null){
            childList.remove(Integer.valueOf(key));
        }
    }

    /** Returns true if this set contains the specified element */
    public  boolean contains(int key) {
        int index=key % ARRAY_SIZE;
        List<Integer> childList=paresnList.get(index);
        return childList!=null && childList.contains(key);
    }

    public static void main(String[] args) {



    }
}
