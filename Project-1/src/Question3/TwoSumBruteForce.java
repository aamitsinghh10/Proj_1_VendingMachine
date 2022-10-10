package Question3;

import java.util.Scanner;

public class TwoSumBruteForce {
    private static int[] twoSum(int[] nums, int target)
    {
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Size of the Array:");
        int n = obj.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter Array Elements:");
        for(int i = 0; i < n; i++)
        {
            nums[i] = obj.nextInt();
        }
        System.out.println("Enter Target Value:");
        int target = obj.nextInt();

        int[] res = twoSum(nums, target);

        if (res.length == 2) {
            System.out.println("Output: "+ res[0] + " " +res[1]);
        } else {
            System.out.println("No solution found!");
        }
    }
}