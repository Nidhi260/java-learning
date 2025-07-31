package Arrays;

class ArrayExample{

    void MultiArrays(){
      //  int [][] arr = new int[5][3];
        // int arr_1[][] = {{33,32,31},{31,30,30},{28}};

        // System.out.println(arr_1[0][0]);
        // System.out.println(arr_1[0][1]);
        // System.out.println(arr_1[0][2]);

        // System.out.println(arr_1[1][0]);
        // System.out.println(arr_1[1][1]);
        // System.out.println(arr_1[1][2]);

        // System.out.println(arr_1[2][0]);




    }

    void demoArrays(){
        int [] ages = new int[5];
        float[] weight = new float[3];
        String[] names = {"Kim Namjoon", "Kim Seokjin", "Min Yoongi", "Jung Hoseok", "Park Jimin","Kim Taehyung","Jeon Jungkook"};

        System.out.println(names.length);
        ages[0] = 33;
        ages[1] = 30;
        ages[2] = 30;
        ages[3] = 28;
        ages[4]=  31;
        // ages[5] = 31;

      for(int i = 0; i<5; i++){
        System.out.println(ages[i]);
      }

         weight[0] = 70.5f;
         weight[1] = 65.8f;
         weight[2] = 60.5f;

        for( float weights: weight){
            System.out.println(weights);
        }


         int i = 0;
         while(i < names.length){
            System.out.println(names[i]);
             i = i + 1;
         }

         
 

    }

}
public class Main {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        //obj.MultiArrays();
        obj.demoArrays();
    }

}

