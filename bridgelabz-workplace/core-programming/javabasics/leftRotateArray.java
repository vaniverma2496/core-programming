public class leftRotateArray {
    static void leftRotate(int arr[], int d){
        int n = arr.length;
        d = d%n;

        int temp[] = new int[d];
        for(int i=0; i<d; i++){
            temp[i] = arr[i];
        }
        for(int i = d; i<n; i++){
            arr[i-d] = arr[i];
        }
        for(int i=0; i<d; i++){
            arr[n-d+i] = temp[i];
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int d = 2;

        System.out.println("Original Array:");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

        leftRotate(arr,d);

        System.out.println("\nArray after Left Rotation by" + d + " positions:");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
