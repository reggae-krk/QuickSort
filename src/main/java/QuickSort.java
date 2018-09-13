public class QuickSort {

    public static void sort(int[] array) {
        if(array == null || array.length == 0) return;
        int n = array.length;
        quickSort(array, 0, n - 1);
    }

    private static void quickSort(int[] array, int left, int right) {
        if(left >= right) return;

        int border = partitionArray(array, left, right);

        if(border - left < right - border) {
            quickSort(array, left, border - 1);
            quickSort(array, border + 1, right);
        }
        else {
            quickSort(array, border + 1, right);
            quickSort(array, left, border - 1);
        }
    }
}
