public class linear {
    public static void main(String[] args){
        int[] arr = {24,15,6,17,8};
        int key = 17;
        int position = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                position = i;
                break;
            }
        }
        if(position == -1)
        System.out.println(key + " not found.");
        else 
        System.out.println(key + " found at index " + position);
    }
}
