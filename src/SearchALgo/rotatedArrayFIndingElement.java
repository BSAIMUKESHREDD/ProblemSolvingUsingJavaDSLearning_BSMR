package SearchALgo;

public class rotatedArrayFIndingElement {

    public static void main(String[] args) {
        int[] array = {5,1,3 };
        int target =5;
                int ans =search(array,target);
        System.out.println(ans);

    }



    static int binarySearch(int[] arr,int target,int start,int end){

        while(start<=end){
            int mid = (end+start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                start =mid+1;

            }else{
                end=mid-1;

            }

        }
        return -1;
    }


   /* static int OrderbinarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = (end+start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                end =mid-1;

            }else{
                start=mid+1;

            }

        }
        return -1;
    }
*/

   /* public void rotate(int[] nums, int k) {
            k %= nums.length;
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);
        }

        public void reverse(int[] nums, int start, int end) {
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }*/

    public static int findPeakElement(int[] arr) {
        int start =0;
        int end = arr.length-1;

        while(start<end){
            int mid = start+ (end-start)/2;
            if(arr[mid]>arr[mid+1])end=mid;
            else start= mid+1;

        }
        return start;
    }
    public static int search(int[] nums, int target) {
        int p = findPeakElement(nums)+1;
        int l = binarySearch(nums,target,0,p-1);
        int h = binarySearch(nums,target,p,nums.length-1);

        return (l!=-1) ? l : h;

    }
}
