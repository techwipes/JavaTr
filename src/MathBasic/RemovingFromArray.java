package MathBasic;

import java.util.Arrays;


public class RemovingFromArray {


//       simple solution
//       System.out.println(Arrays.toString(test_array, 3));

        public static int[] deleteElementFromArray(int[] nums, int val) {
            int offset = 0;

            for (int i = 0; i <nums.length; i++){
                if(nums[i] == val){
                    offset++;
                }else{
                    nums[i - offset] = nums[i];
                }
            }
            int[] result = Arrays.copyOf(nums,nums.length - offset);
            return result;

        }



    public static void main(String[] args) {
        int[] test_array =  {1,2,3,4,5,6,3,8,3,5,2,6,7,7,4,1};
        System.out.println(Arrays.toString(deleteElementFromArray(test_array, 3)));

    }
}
