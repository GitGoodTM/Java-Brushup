public class BinarySearch {
    /*
    Binary search only works on sorted arrays
    basically taking the mid element and comparing it with out target
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // avoids integer overflow

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    //Find First/Left boundary
    public static int findFirst(int[] arr, int target){
        int left=0, right=arr.length-1,result=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if (arr[mid]==target){
                result=mid;
                right=mid-1;
            } else if (arr[mid]>target) {
                right=mid-1;
            } else {
                left=mid+1;
            }
        }
        return result;
    }

    //Find Last/Right Boundary
    public static int findLast(int[] arr, int target){
        int left=0, right=arr.length-1, result=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                result=mid;
                left=mid+1;
            } else if (arr[mid]<target) {
                left=mid+1;
            } else {
                right=mid-1;
            }
        }
        return result;
    }

    // Search in a Rotated array
    private static int searchRotated(int[] arr, int target) {
        int left=0, right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[left] <= arr[mid]) {// if left of the array is sorted
                if(arr[left]<=target && target<=arr[mid]){
                    right=mid-1;
                } else {
                    left=mid+1;
                }
            } else {
                if (arr[mid]<=target && target<arr[right]){
                    left=mid+1;
                } else {
                    right=mid-1;
                }
            }
        }
        return -1;
    }

    // Binary Search on a descending array
    private static int descendingBinarySearch(int[] arr, int target){
        int left=0, right=arr.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if (arr[mid]==target){
                return mid;
            } else if(arr[mid]>target){
                left=mid+1;
            } else {
                right=mid-1;
            }
        }
        return -1;
    }

    static void main(String[] args) {
        // Basic Binary search on a sorted array
        System.out.println("Basic Binary search on a sorted array");
        int[] sortedArr = {1,2,3,4,5,6,7,8,9,10};
        int target = 8;
        System.out.println("The target: "+ target +" was found at: "+binarySearch(sortedArr, target)+" position\n");

        System.out.println("A FEW OTHER IMPORTANT TEMPLATES:\n");

        //Find First/Left Boundary, basically trying to find the first instance of same value
        System.out.println("1. Find First/Left Boundary");
        int[] sortedArrRep = {1,2,3,4,5,5,5,5,5,5,6,7,8,9,10};
        int repTarget=5;
        System.out.println("The first occurrence of target "+repTarget+" is at "+findFirst(sortedArrRep,repTarget)+" position\n");

        //Find Last/Right Boundary, basically trying to find the last instance of same value
        System.out.println("2. Find Last/Right Boundary");
        System.out.println("The last occurrence if target "+repTarget+" is at "+findLast(sortedArrRep,repTarget)+"\n");

        //Binary Search on a descending sorted array
        System.out.println("3. Binary Search on a descending sorted array");
        int[] dArr = {9,8,7,6,5,4,3,2,1};
        int desTarget = 8;
        System.out.println("The target: "+desTarget+" occurs at: "+descendingBinarySearch(dArr,desTarget)+" position\n");

        System.out.println("SOME IMPORTANT VARIANTS:\n");

        //Search in a Rotated Sorted Array, kind of a looped array
        System.out.println("1. Search in a Rotated Sorted Array");
        int[] RoSoArr= {4,5,6,7,8,9,1,2,3};
        int rotatedTarget=1;
        System.out.println("The position of target: "+rotatedTarget+" in the given Rotated Sorted array is: "+searchRotated(RoSoArr,rotatedTarget)+"\n");

        // Find First and Last occurrence of a given value
        System.out.println("2. Find First and Last occurrence of a given value");
        //sortedArrRep = {1,2,3,4,5,5,5,5,5,5,6,7,8,9,10};
        //repTarget=5;
        System.out.println("The first occurrence of the target: "+repTarget+" is at: "+findFirst(sortedArrRep,repTarget)+" position and last occurrence at: "+findLast(sortedArrRep,repTarget));
    }
}
