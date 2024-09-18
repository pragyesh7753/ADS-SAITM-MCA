public class BinarySearchRecursive {
    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
                if (arr[mid] == target) {
                    return mid;
                }
                if (arr[mid] > target) {
                    return binarySearch(arr, left, mid - 1, target);
                }
                return binarySearch(arr, mid + 1, right, target);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 8, 12, 40 };
        int target = 40;
        int result = binarySearch(arr, 0, arr.length - 1, target);
        if (result == -1) {
            System.out.println("Element not present in array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}