
public class MaxEle {
    public static void main(String[] args) {
        int arr[] = {15,3,6,2,8,1};

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > ans){
                ans = arr[i];
            }
            
        }
        System.out.println("Maximum element in the given arr is : " + ans);
    }

}
