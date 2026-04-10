public class LinearSearch {
    /* Class made to look through the essential types of basic Search Algorithms*/

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // return index
            }
        }
        return -1; // not found
    }

    public static void main(String[] args){

        //Basic example of Linear search
        System.out.println("Basic example of Linear search: Find target in an array");
        int[] arr = {3,2,1,4,5};
        System.out.print("Given array of integers: ");
        for(int a:arr){
            System.out.println(" "+ a +",");
        }
        int target = 1;
        System.out.println("The target: "+ target +" was found in position: "+ linearSearch(arr,target));

        System.out.println("QUESTIONS:");

        //Find maximum/minimum in an unsorted array
        System.out.println("1. Find maximum/minimum in an unsorted array");
        int maximum = arr[0];
        int minimum = arr[0];
        for(int a : arr){
            maximum = Math.max(maximum, a);
            minimum = Math.min(minimum,a);
        }
        System.out.println("Max value in that array: "+ maximum +" & min: "+ minimum);

        //Count occurrences of a target in an array
        System.out.println("2. Count occurrences of a target in an array");
        int count = 0;
        for (int a : arr){
            count = (target==a)? ++count : count;
        }
        System.out.println("The target: "+ target +" only occurs: "+ count +" time");

        //Find first and last position of a target in unsorted array
        System.out.println("3. Find first and last position of a target in unsorted array");
        int newArr[] = {3,3,4,3,5,1,2,1,5,7,3,1,1,5};
        int firstPosition=0, lastPosition=0, positionCount=0, position =-1;
        for(int a : newArr) {
            position++;
            if(target==a){
                firstPosition=(positionCount==0)? position : firstPosition;
                lastPosition=(positionCount!=0)? position : firstPosition;
                positionCount++;
            }
        }
        if(firstPosition==lastPosition){
            System.out.println("The target: "+target+" only occurs once");
        }else{
            System.out.println("The first position of target is at "+firstPosition+" and last position is at "+lastPosition);
        }
    }
}
