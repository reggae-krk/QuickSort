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

    private static int partitionArray(int[] array, int left, int right) {
        int pivot = choosePivot(array, left, right);
        int border = left - 1;
        int i = left;

        while(i < right){
            if(array[i] < pivot) {
                border++;
                if(border != i) swap(array, border, i);
            }
            i++;
        }

        border++;
        if(border != right) swap(array, border, right);
        return border;
    }

    private static int choosePivot(int[]array, int left, int right){
        int mid = left + (right - left) / 2;
        int pivot = array[mid];
        swap(array, mid, right);
        return pivot;
    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
