package Arrayas;

public class finfArrayconcatValue {
    public static void main(String[] args) {
        int[] ques ={7,52,2,4};
        findTheArrayConcVal(ques);
    }

    public static long findTheArrayConcVal(int[] nums) {
        long result =0;
        String[] use =  convertIntArrayToStringArray(nums);

        for(int i=0;i<(use.length-1)/2;i++){
            String num = use[i]+use[use.length-1-i];
            result += Long.parseLong(num);
            System.out.println(result);

        }

      //  System.out.println(result);
        return result;


    }


    public static String[] convertIntArrayToStringArray(int[] intArray) {
        String[] stringArray = new String[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            stringArray[i] = String.valueOf(intArray[i]);
        }
        return stringArray;
    }
}
