package com.company;

import java.util.LinkedList;

/**
 * Created by lalitp on 25/02/16.
 */
public class List {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.offer(3);
        System.out.println(list.get(list.size() - 1));
    }
}
