package SearchALgo;

public class quickSOrt {

    public static void main(String[] args) {
        int[] ar = new int[]{4, 6, 2, 5, 7, 9, 1, 3};
        quickSort(ar);
    }




        public static void quickSort(int[] array) {
            quickSort(array, 0, array.length - 1);
        }

        private static void quickSort(int[] array, int start, int end) {
            if (start >= end) {
                return;
            }

            int pivot = array[(start + end) / 2];
            int left = start;
            int right = end;

            while (left <= right) {
                while (array[left] < pivot) {
                    left++;
                }

                while (array[right] > pivot) {
                    right--;
                }

                if (left <= right) {
                    int temp = array[left];
                    array[left] = array[right];
                    array[right] = temp;
                    left++;
                    right--;
                }
            }

            quickSort(array, start, right);
            quickSort(array, left, end);
        }


    }




