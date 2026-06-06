

public class RemoveSpecificElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};

        int val = 2;
        int write = 0;

        for (int read = 0; read < nums.length - 1; read++) {
            if(nums[read] != val) {
                nums[write] = nums[read];
                write++;

            }
        }

        System.out.println(write);

        for(int i = 0; i< write; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

