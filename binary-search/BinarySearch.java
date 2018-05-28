/**
 * Created by jihun on 2018. 5. 18..
 */

import java.util.Arrays;

public class BinarySearch {
    public static int BSearch(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int mid;

        while(low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static int BSearchRecursive(int arr[], int target, int low, int high) {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;
        if (arr[mid] == target)
            return mid;
        else if (arr[mid] > target)
            return BSearchRecursive(arr, target, low, mid-1);
        else
            return BSearchRecursive(arr, target, mid+1, high);
    }

    public static void main(String[] args) {
        int [] arr = {1, 3, 5, 6, 9, 10};

        System.out.print("{1, 3, 5, 6, 9, 10}, ");
        System.out.println("BS(8) = " + BSearch(arr, 8));
        System.out.print("{1, 3, 5, 6, 9, 10}, ");
        System.out.println("BS(3) = " + BSearch(arr, 3));
        System.out.print("{1, 3, 5, 6, 9, 10}, ");
        System.out.println("BS(9) = " + BSearch(arr, 9));

        System.out.print("{1, 3, 5, 6, 9, 10}, ");
        System.out.println("BSR(8) = " + BSearchRecursive(arr, 8, 0, arr.length));
        System.out.print("{1, 3, 5, 6, 9, 10}, ");
        System.out.println("BSR(3) = " + BSearchRecursive(arr, 3, 0, arr.length));
        System.out.print("{1, 3, 5, 6, 9, 10}, ");
        System.out.println("BSR(9) = " + BSearchRecursive(arr, 9, 0, arr.length));
    }
}
