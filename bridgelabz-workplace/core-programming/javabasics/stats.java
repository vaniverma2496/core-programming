
public class stats {
    public static void main(String[] args){
        int arr[] = {4,16,8,25,30};

        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        
        for(int i =0; i<arr.length; i++){
            if(arr[i] > max) max = arr[i];;
            if(arr[i] < min) min = arr[i];

            sum += arr[i];

           
        }

        double avg = (double)sum/arr.length;

        System.out.println("maximum: " +max);
        System.out.println("minimum: " +min);
        System.out.println("average: " +avg);

        

    }
}
