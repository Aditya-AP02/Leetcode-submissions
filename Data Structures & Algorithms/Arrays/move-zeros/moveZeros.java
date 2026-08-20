class Solution{
    public static void moveZeros(int[] arr){

        int insertpos = 0;

        for (int i =0; i<arr.length ; i++){
          if(arr[i]!=0){
            int temp = arr[i];
            arr[i]=arr[insertpos];
            arr[insertpos]=arr[temp];
            insertpos ++ ;          }
        }
            
      }

    }

    public static void main(String[] args) {
        int[] arr = {2,5,0,0,8,1,0,3,9,7,0};
        moveZeros(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
}