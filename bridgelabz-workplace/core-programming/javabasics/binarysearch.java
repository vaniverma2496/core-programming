public class binarysearch {
    public static void main(String[] args){
        int arr[] = {5,10,15,20,25,30};
        int key = 20;
        int low = 0, high = arr.length-1;
        int position = -1;

        while(low <= high) {
            int mid  = (low + high) / 2;
            if(arr[mid] == key){
                position = mid;
                break;

            }
            else if(arr[mid] < key){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }

        if (position == -1)
        System.out.println(key + "not found.");

        else
        System.out.println(key + " found at index " + position);
    }
}
