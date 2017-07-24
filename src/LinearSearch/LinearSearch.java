package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] list = {1, 5, 76, 325, 6, 2345};
        System.out.println("Key is found at: " + search(list, 5));
    }

    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                return i;
        }
        return -1;
    }
}
