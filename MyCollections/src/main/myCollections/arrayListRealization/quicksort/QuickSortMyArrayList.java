package main.myCollections.arrayListRealization.quicksort;

import main.myCollections.arrayListRealization.MyArrayListRealization;

/**
 * This class is used for quick sorting Object from myArrayList
 */

public class QuickSortMyArrayList<E>  {

    /**
     * @param <E>
     * This method should return objects from the myArrayList in new order
     * Method uses quicksort.
     * middle O(n*Log(n))
     */

    public static <E extends Comparable<E>> void quicksort(MyArrayListRealization<E> myArrayListRealization, int lowIndex, int highIndex) {

        E pivot = myArrayListRealization.get(myArrayListRealization.size() - 1);

        if(lowIndex >= highIndex){
            return;
        }

        int leftPoint = lowIndex;
        int rightPoint = highIndex;

        while ((leftPoint < rightPoint)) {

            while (myArrayListRealization.get(leftPoint).compareTo(pivot) <= 0 && leftPoint < rightPoint) {
                leftPoint++;
            }

            while (myArrayListRealization.get(rightPoint).compareTo(pivot) >= 0 && leftPoint < rightPoint) {
                rightPoint--;
            }

            swap(myArrayListRealization, leftPoint, rightPoint);
        }

        swap(myArrayListRealization, leftPoint, highIndex);

        quicksort(myArrayListRealization, lowIndex, leftPoint -1);
        quicksort(myArrayListRealization,leftPoint + 1, highIndex);
    }

    private static <E extends Comparable<E>> void swap(MyArrayListRealization<E> myArrayListRealization, int index1, int index2){
        E temp = myArrayListRealization.get(index1);
        myArrayListRealization.change(index1, myArrayListRealization.get(index2));
        myArrayListRealization.change(index2, temp);
    }
}
