package Arrayas;

public class triangularSUmOfanarray {

    public static void main(String[] args) {
        int[] ques ={1,2,3,4,5};
        triangularSum(ques);
    }
    public static int triangularSum(int[] nums) {
        int n=nums.length;
        while(n != 1){

            for(int i=0;i<n-1;i++)
                nums[i] = (nums[i] + nums[i+1]) % 10;
            n--;
        }

        return nums[0];
    }
}
