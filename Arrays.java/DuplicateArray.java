public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 3, 7, 8, 1, 5};

        for(int i = 0; i < arr.length; i++) {
            int ch = arr[i];
            int count = 0;

            for(int j = 0; j < arr.length; j++) {
                if(arr[j] == ch) count++;
            }

                if(count > 1) {
                    boolean printed = false;
                    for(int k = 0; k < i; k++) {
                        if(arr[k] == ch) printed = true;
                    }
                    if(!printed) 
                        System.out.println(ch);
                }
        }
    }
}
