package main145;

public class removeDuplicatesInplaceArray {

    public static void main(String[] args) {
        int[] nu={1,2,2,2,3,7,8,9,9,10};
        removeDuplicates(nu);
    }
//trail
    public  static int removeDuplicates(int[] nums) {
        for(int i =1;i<nums.length;i++){
            if(nums[i-1]==nums[i]) swap(nums[i-1],nums[i]);
            System.out.println(nums[i]);
        }
        return nums.length;
    }

    public static void swap(int a ,int b ){

        int c= a;
        a=b;
        b=c;
    }

    //good solution
    /*public int removeDuplicates(int[] nums) {
        int i = nums.length > 0 ? 1 : 0;
        for (int n : nums)
            if (n > nums[i-1])
                nums[i++] = n;
        return i;
    }*/
}
