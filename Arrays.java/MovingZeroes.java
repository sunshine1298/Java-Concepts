public class MovingZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 2};

        int i = 0;
        int j = 0;

        while(i < arr.length) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j++;
            } else {
                i++;
            }
        }

        for(i = 0; i< arr.length; i++) {
            System.out.print (arr[i] + " ");
        }

    }
}
