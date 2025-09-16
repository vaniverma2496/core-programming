public class quicksort {
    static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = (low -1);

        for( int j = low; j<high ; j++){
            if(arr[j] < pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    static void quicksort(int arr[], int low, int high){
        if(low<high){
            int pi = partition(arr, low, high);

            quicksort(arr,low,pi - 1);
            quicksort(arr, pi+1, high);
        }
    }


public static void main(String args[]) {
    int arr[] = {10,60,70,90,50,40,20};
    int n = arr.length;

    System.out.println("Original Array: ");
    for(int num : arr){
        System.out.print(num + " ");
    }
    System.out.println();

    quicksort(arr, 0 , n-1);

    System.out.println("\nSorted Array:");
    for(int num : arr){
        System.out.print(num + " ");
    }
}
}