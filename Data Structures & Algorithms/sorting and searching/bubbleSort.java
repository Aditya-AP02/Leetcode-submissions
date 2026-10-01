import java.util.Arrays;

class BubbleSort{
  static void bubbleSort(int[] arr){
    int n = arr.length;
    
    for (int i = 0 ; i< n; i++){
      boolean swapped = false;

      for(int j = 0 ; j < n-1; j++){
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j]= arr[j+1];
          arr[j+1] = temp;

          swapped = true;
        }
      }

      if (swapped != true){
        break;
      }
    }
  }
  public static void main(String[] args) {
        int[] arr = {64, 34, 5, 15, 99, 38, 66, 20};

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

}