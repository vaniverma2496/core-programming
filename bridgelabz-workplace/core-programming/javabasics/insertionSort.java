public class insertionSort {
    static void insertionSort(int arr[]){
        int n = arr.length;

        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String args[]){
        int arr[] = {19,17,8,5,11};

        System.out.println("Original Array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

        insertionSort(arr);

        System.out.println("\nSorted Array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
