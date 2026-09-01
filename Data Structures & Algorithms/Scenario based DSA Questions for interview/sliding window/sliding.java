class Main {

    public static int maxSum(int[] arr , int k){
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i =0; i<arr.length; i++){
            windowSum = windowSum + arr[i];

            if(i>= k-1){
                maxSum = Math.max(maxSum, windowSum);
                windowSum = windowSum - arr[i-k +1];
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr ={4,2,1,8,0,6,0,3};
        int k= 3;
        System.out.println("Longet sum of subarray is : "+ maxSum(arr, k));
    }
}