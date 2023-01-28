package Arrayas;

public class MissingNumberInAsequence {

//FInding duplicates best appeoach
    // https://leetcode.com/problems/find-the-duplicate-number/solutions/1892921/9-approaches-count-hash-in-place-marked-sort-binary-search-bit-mask-fast-slow-pointers/
    public static void main(String[] args) {
        int[] q = {1,2,4,5,6,7,8,9,10};
        System.out.println(missingNumber(q));

    }

    public  static int missingNumber(int[] nums) {
        int i =nums.length-1;
        int n=nums.length+1;
        int sum=0;
        while(i>=0){
            sum += nums[i--];
        }

        double acSum = 0.5*n*(n+1);
        System.out.println(sum+"  "+acSum);
        int ans = (int)acSum-sum;
        return ans;//acSum-sum;

    }
}
