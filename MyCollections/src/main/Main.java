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
        MyArrayListRealization<String> strings = new MyArrayListRealization<>();
        strings.add("Igor");
        strings.add("Fiodor");
        strings.add("Valeria");
        strings.add("Olya");

        System.out.println(strings.size());

        for (String s: strings){
        System.out.println(s);}



    }
}
