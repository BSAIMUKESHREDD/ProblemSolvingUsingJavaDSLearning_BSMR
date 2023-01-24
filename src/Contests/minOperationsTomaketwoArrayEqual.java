package Contests;

public class minOperationsTomaketwoArrayEqual {

    public static void main(String[] args) {
        int[] nums1 ={4,3,1,4};
        int[] nums2 = {1,3,7,1};
       int anas = minMoves(nums1,nums2,3);

        System.out.println(anas);
    }
    public static int minMoves(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int[] diff = new int[n];
        for(int i = 0; i < n; i++) {
            diff[i] = nums1[i] - nums2[i];
        }
        int moves = 0;
        for(int i = 0; i < n; i++) {
            if(diff[i] > 0) {
                for(int j = i+1; j < n; j++) {
                    if(diff[j] < 0) {
                        nums1[i] -= k;
                        nums1[j] += k;
                        diff[i] -= k;
                        diff[j] += k;
                        moves++;
                        if(diff[i] == 0) {
                            break;
                        }
                    }
                }
                if(diff[i] > 0) {
                    return -1;
                }
            }
        }
        return moves;
    }

}
