public class ProductExpectSelf {

    //find the product answer[] of elements of array expect the current nums[i]
    //Input: nums = [1,2,3,4] 2*3*4 3*4 4*2
    //Output: [24,12,8,6]
    private static int[] productExpectSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    product *= nums[j];
                }
            }
            answer[i] = product;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productExpectSelf(nums);

        System.out.println("Output:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
