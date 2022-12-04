package Recursion;

public class learningRecursion {
    public static void main(String[] args) {
        int na = reverse(54785,5);
        int[] arr = {1,5,7,8,19};
        boolean ans =bs(arr,5,0,5);
        System.out.println(ans);
    }
    //basic printing of numbers
    public static int Print(int n) {
        if (n == 0) {
            return 0;

        } else {
            System.out.println(n);
            return Print(n-1);
        }

    }

    //print 12345

    public static int Printreverse(int n) {
        if(n==0)return 0;
         Printreverse(n-1);
        System.out.println(n);
        return 0;
    }

    // factorial product 1-n
    public static int factorial(int n){
        if(n==0) return 1;
        return n*factorial(n-1);
    }
//sum of n numbrs
public static int sum(int n){
    if(n==0) return 1;
    return n+sum(n-1);
}

//sum of digits in a number
    //1342 = 10

    public static  int sod(int n){
        if(n==0)return 0;
        return n%10+sod(n/10);
    }

//product

public static int pod(int n){
    if(n%10==n)return n;
    return n%10*pod(n/10);
}

//reverse of a number
public static int reverse(int n,int totaldigits){
    if(n%10==n)return n;

    return (10^(totaldigits-1)*(n%10))+reverse(n/10,totaldigits);
}

// recursion in arrays

//finding assednidg order in arrays
    public boolean arrayOrder(int[] array,int i){
       if(i==array.length-1)return true;
        return (array[i]<array[i+1] && arrayOrder(array,i++));
    }


    //bs in array with target
    public static boolean bs(int[] array, int target, int s, int e){
        int m = (s+e)/2;
        if(array[m]==target) return true;
        if(s>e)return false;
        if(array[m]>target)return bs(array,target,s,e-m);
        else if (target>array[m]) return bs(array,target,m+1,e);

        return false;
    }


}