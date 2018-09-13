public class QuickSort {

    public static void sort(int[] array) {
        if(array == null || array.length == 0) return;
        int n = array.length;
        quickSort(array, 0, n - 1);
    }
}
