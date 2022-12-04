package SearchALgo;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {

    }

    static int[] mergeSort(int[] array){
        if(array.length==1)return array;
        int mid = array.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(array,0,mid));
        int[] right =mergeSort(Arrays.copyOfRange(array,mid, array.length));
        return merge(left,right);
    }
    static int[] merge(int[] left,int[] right){
int[] add = new int[left.length+right.length];
int i=0;
int j=0;int k=0;
while(i< left.length && j< right.length){
    if(left[i]<right[j]) {add[k]=left[i];i++;}
    else {add[k]=right[j];j++;}
    k++;
}
        //for remaining elements the total length of array may not complete

while(i<left.length){
    add[k] = left[i];
    i++;k++;
}
while(j<right.length){
    add[k]=right[j];
    k++;
}
return add;


    }
}
