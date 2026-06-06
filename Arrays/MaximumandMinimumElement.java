public class MaxiandMinElement {
    public static void main(String[] args) {
        int[] arr = {98, 45, 34, 23, 67};

        int max = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >  max) {
                max = arr[i];
            }

            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum element in an array is " + max);
        System.out.println("Minimum element in an array is " + min);
    }
}
