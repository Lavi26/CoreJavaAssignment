package com.collection;


import java.util.ArrayList;
import java.util.List;
/*
 * Java List
The Java List interface represents an ordered collection of objects.
 By ordered means, that you can access the elements in the order they occur in the list. 
 * 
 */
 
public class ListDemo {
 
    public static void main(String[] args) {
 
        List<String> fruitlist = new ArrayList<String>();
 
        fruitlist.add("apple");
        fruitlist.add("banana");
        fruitlist.add("mango");
          //enhanced for loop specially used iterating objects on collection frame work
        for (String friutsloop : fruitlist) {
 
            System.out.println(" list of  friuit" + friutsloop);
        }
 
    }
 
}