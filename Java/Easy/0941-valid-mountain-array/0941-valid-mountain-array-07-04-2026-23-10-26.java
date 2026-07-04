class Solution {
    public boolean validMountainArray(int[] arr) {

        // Step 1: A mountain must have at least 3 elements
        if (arr.length < 3) {
            return false;
        }

        int i = 0;
        int n = arr.length;

        // Step 2: Climb up while the next element is greater
        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        // Step 3: Peak cannot be the first or the last element
        if (i == 0 || i == n - 1) {
            return false;
        }

        // Step 4: Climb down while the next element is smaller
        while (i < n - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        // Step 5: If we reached the last index, it is a valid mountain
        return i == n - 1;
    }
}