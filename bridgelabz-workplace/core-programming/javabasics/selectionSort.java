public class selectionSort {
    static void selectionSort(int arr[]){
        int n = arr.length;

        for(int i = 0; i<n-1; i++){
            int minIndex = i;
            for( int j = i+1; j<n ; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String args[]){
        int arr[] = {56,32,78,66,65};

        System.out.println("Original Array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

        selectionSort(arr );

        System.out.println("\nSorted Array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
