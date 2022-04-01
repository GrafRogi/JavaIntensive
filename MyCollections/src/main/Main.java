package main;

import main.myCollections.arrayListRealization.MyArrayListRealization;
import main.myCollections.arrayListRealization.quicksort.QuickSortMyArrayList;

/**
 * This is my Main class.
 *
 * @author Igor Gorokh
 */

public class Main {

    /**
     * Here start point of the program
     * @param args comand line values
     */

    public static void main(String[] args) {
        MyArrayListRealization<Integer> strings = new MyArrayListRealization<>();
        strings.add(1);
        strings.add(2);
        strings.add(7);
        strings.add(5);
        strings.add(3);
        strings.add(4);
        System.out.println(strings.size());

        for (Integer s: strings){
            System.out.println(s);}

        QuickSortMyArrayList.quicksort(strings, 0, strings.size() -1);

        for (Integer s: strings){
            System.out.println(s);}
    }
}
