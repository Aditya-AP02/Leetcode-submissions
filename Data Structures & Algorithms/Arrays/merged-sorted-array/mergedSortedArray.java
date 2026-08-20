import java.util.Arrays;

public class mergedSortedArray {
  public static int[] mergedSortedArray(int[] nums1 , int[] nums2){
    int[] result = new int[nums1.length + nums2.length];

    int i = 0;
    int j = 0;
    int k = 0;

    while(i < nums1.length && j < nums2.length){
      if(nums1[i] <= nums2[j]){
        result[k++] = nums1[i++];
      }
      else{
        result[k++] = nums2[j++];
      }
    }

    while(i < nums1.length){
      result[k++] = nums1[i++];
    }

    while(j < nums2.length){
      result[k++] = nums2[j++];
    }
    
    return result ;

  }

  public static void main(String[] args) {
    int[] nums1 = {1, 3, 5, 7};
    int[] nums2 = {2, 4, 6, 8};

    System.out.println(Arrays.toString(mergedSortedArray(nums1, nums2)));
  }

}
