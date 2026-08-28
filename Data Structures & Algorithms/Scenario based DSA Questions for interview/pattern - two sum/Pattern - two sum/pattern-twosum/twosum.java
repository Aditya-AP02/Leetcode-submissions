/** “Imagine you're working on a backend service for an e-commerce platform. We have a list of recent transaction amounts for a user, stored in chronological order.
For fraud detection, we want to quickly check: are there any two transactions whose amounts add up exactly to a given suspicious total?

Concretely, you’re given:

an array transactions of integers (transaction amounts), for example:
transactions = [1500, 3200, 700, 2500, 1800]

an integer target (the suspicious total), for example:
target = 4000

Return the indices of any two different transactions whose amounts sum to target.

If multiple such pairs exist, returning any one valid pair is fine.

If no such pair exists, return [-1, -1].

Aim for an efficient solution and explain time and space complexity.” */

class Solution{
    public static int[] checkTransaction(int arr[], int target){
        for (int i = 0; i < arr.length ; i++){
            for(int j =  i+1 ; j < arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i , j};
                }
            }
        }
        return new int[]{-1, 1};
    }

    public static void main(String[] args){
        int[] arr = {1500, 3200, 700, 2500, 1800};
        int target = 4000;

        int[] result = checkTransaction(arr, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}

/*
*Time Complexity
  Outer loop runs up to n times.

  Inner loop runs up to n - i - 1 times for each i.

  Total number of pairs checked ≈ n * (n - 1) / 2 → proportional to n².

  So:

  Time complexity: O(n²)

  Worst case: no pair found, so you check almost all pairs.

  Best case: pair found very early → still described as O(n²) in big-O terms, because we care   about worst-case.

*Space Complexity
  You’re only using:
  
  a few integer variables (i, j, target, etc.)
  
  and a fixed-size int[2] for the result.
  
  No extra data structures that grow with n.
  
  Space complexity: O(1) (constant extra space)
  
  
 */