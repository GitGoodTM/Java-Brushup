public class SortingAlgorithms {
    /* Class created to understand sorting algorithms*/
    public static void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0; i<n-1 ; i++){//number of loop passes
            for(int j=0; j<n-i-1 ; j++){//n-i-1 since i elements will be already sorted after each pass
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArr(arr);
    }

    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1 ; i++){
            int minIndex = i;
            for(int j=i+1; j<n ; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        printArr(arr);
    }

    public static void printArr(int[] arr){
        for (int a : arr){
            System.out.print(a);
            if(arr[arr.length-1]==a){
                System.out.println();
                break;
            }
            System.out.print(", ");
        }
    }


    static void main(String[] args) {
        System.out.println("There are multiple sort algorithms which can be divided into 3 types:\n");

        System.out.println("A. SLOW SORTS:\n");
        int[] arr = {5,2,7,3,8,9,1,4,6};
        System.out.print("Sample array Array before sorting: ");
        printArr(arr);

        System.out.println("\n1. Bubble Sort: here the adjacent elements are compared and swapped if they are in wrong order");
        System.out.print("Array after Bubble sort: ");
        bubbleSort(arr);

        System.out.println("\n2. Selection Sort: in this algorithm, we'll split the array on each pass and store the lowest value on one side");
        System.out.print("Array after Selection Sort: ");
        selectionSort(arr);
    }
}
