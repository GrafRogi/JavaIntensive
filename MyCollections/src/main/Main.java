package main;

import main.myCollections.arrayListRealization.MyArrayListRealization;
import main.quicksort.QuickSortMyArrayList;

public class Main {

    public static void main(String[] args) {
        MyArrayListRealization<String> strings = new MyArrayListRealization<>();
        strings.add("Igor");
        strings.add("Fiodor");
        strings.add("Valeria");
        strings.add("Olya");

        System.out.println(strings.size());

        for (String s: strings){
        System.out.println(s);}

        QuickSortMyArrayList<String> quickSortMyArrayList = new QuickSortMyArrayList<>();

        quickSortMyArrayList.add("Igor");
        quickSortMyArrayList.add("Fiodor");
        quickSortMyArrayList.add("Valeria");
        quickSortMyArrayList.add("Olya");

        q
    }
}
