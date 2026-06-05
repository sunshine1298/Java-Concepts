public class MergeArray {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6, 9, 6};

        int[] merge = new int[a1.length + a2.length];

        for (int i = 0; i < a1.length; i++) {
            merge[i] = a1[i];
            System.out.print(merge[i] + " ");
        }

        for(int i = 0 ; i < a2.length; i++ ) {
            merge[a1.length + i] = a2[i];
            System.out.print(merge[a1.length + i] + " ");
        }
        System.out.println();

        
    }
}
