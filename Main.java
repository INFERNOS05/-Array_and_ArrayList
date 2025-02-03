// Name: Sehajdeep Singh Sikka 
// PRN: 23070126119
// Batch: Class of 2027 | AIML B2
// Description: This program demonstrates array operations, including separation of even/odd numbers, 
// finding the smallest distance between two numbers, and converting between arrays and ArrayLists.

public class Main {
    public static void main(String[] args) {
        EvenOddSeparator separator = new EvenOddSeparator();
        separator.acceptNumbers();
        int[] arr = {3, 8, 15, 2, 7, 9};
        int index = SmallestDistanceFinder.findSmallestDistanceIndex(arr);
        System.out.println("Index of the first number with the smallest distance: " + index);
        ArrayConverter converter = new ArrayConverter();
        converter.arrayToArrayList();
        converter.arrayListToArray();
    }
}

