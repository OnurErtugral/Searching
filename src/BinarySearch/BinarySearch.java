package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(numbers, 8));
    }

    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (high >= low){
            int middle = low + ((high - low) / 2); // avoid overflow == (low + high) / 2
            if (key == array[middle])
                return middle;
            else if (key > array[middle]) {
                low = middle + 1;
            } else if (key < array[middle]) {
                high = middle - 1;
            }
        }
        return -low -1; //tip: When the key is not found, low is the insertion point where a key would be inserted to
                        //maintain the order of the list.