package Arrays;
public class SearchEle {
   void FindEle(){
    int arr[] = {10,5,3,6,2,3,4};
    int find = 3;
    int ans = -1;
    
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] == find){
           ans = i;
           break;
        }
    }
    if(ans == -1){
            System.out.println("Not found");
        }else{
        System.out.println("Found "+ find + " at index : " + ans);
        }
    }
    
     
           
    
   
   public static void main(String[] args) {
    SearchEle obj = new SearchEle();
    obj.FindEle();
   }
}



