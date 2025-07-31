package Arrays;

public class SumArr {
    void sumOfArr(){
    int arr[] = {1,4,8,6,2};
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
        sum +=  arr[i];
        
    }
    System.out.println(sum);
}

    public static void main(String[]args){
        SumArr obj = new SumArr();
        obj.sumOfArr();
    }
}


