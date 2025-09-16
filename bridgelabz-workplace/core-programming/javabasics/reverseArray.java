public class reverseArray {
    static void reverse(int arr[]){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String args[]){
        int arr[] = {10,20,30,40,50};

        System.out.println("Original Array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

        reverse(arr);

        System.out.println("\nReversed Array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
