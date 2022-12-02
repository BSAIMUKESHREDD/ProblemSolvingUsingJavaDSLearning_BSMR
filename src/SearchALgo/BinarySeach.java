package SearchALgo;

public class BinarySeach {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,8};
        int target=7;
       int ans=  binarySearch(ar,target);
      // int ceilingans =cieling(ar,target);
        System.out.println(ans);
    }


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
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
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
        return arr[start];
    }

//for floor return arr[end]
    // for ceilign return arr[start]
    static int cieling(int[]array,int target){
        int start = 0;
        int end = array.length-1;
        int mid = (end+start)/2;
        while(start<=end){
            if(array[mid]==target){
                return array[mid];
            }else if(array[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start;
    }
}
