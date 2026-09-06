public class binarysearch {

    public static int bsRecurse(int[] arr, int low, int high, int find) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;

        if (arr[mid] == find) return mid;
        else if (arr[mid] < find) return bsRecurse(arr, mid + 1, high, find);
        else return bsRecurse(arr, low, mid - 1, find);
    }

    public static int searchBinary(int[] arr, int find) {
        int l = 0;
        int h = arr.length - 1;

        // handling no-recurse best-case scenarios
        if (arr[l] == find) return l;
        else if (arr[h] == find) return h;

        // else, start the recursion!
        return bsRecurse(arr, l, h, find);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

        int idx = searchBinary(arr, 10);
        System.out.println(idx);
    }
}
