public class bubblesort {
    
    static void bubblesort(int arr[]){
        int n = arr.length;
        boolean swapped;

        for(int i = 0; i<n-1; i++){
            swapped = false;

            for(int j = 0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }


public static void main(String args[]){
    int arr[] = {6,8,2,9,7};

    System.out.println("Original Array: ");
    for(int num : arr){
        System.out.print(num + " ");
    }
    System.out.println();

    bubblesort(arr);

    System.out.println("\nSorted Array: ");
    for(int num : arr){
        System.out.print(num + " ");
    }
}
}
