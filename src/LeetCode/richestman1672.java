package LeetCode;

public class richestman1672 {
    public static void main(String[] args) {
        int[][] ques = {{1,5},{3,15},{5,3}};
        int ans =maximumWealth(ques);
        System.out.println(ans);

    }
    public static int maximumWealth(int[][] accounts) {
        int max=0;
        int sum;
        //System.out.println(accounts.length);
        for (int i = 0; i < accounts.length; i++) {
             sum=0;
            for (int j = 0; j < accounts[0].length; j++) {
                sum += accounts[i][j];
            }
            if(sum>max)max=sum;
        }
        return max;
    }
}
