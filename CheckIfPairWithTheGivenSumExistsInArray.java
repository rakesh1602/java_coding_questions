public class CheckIfPairWithTheGivenSumExistsInArray {

    //sum = 5
    //[1,2,3,1,0]
    //2+3 = sum (5) so pair exist return

    private static boolean checkIfPairWithTheGivenSumExists(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 1, 0};
        boolean checkIfPairWithTheGivenSumExists = checkIfPairWithTheGivenSumExists(arr, 1);
        System.out.println("checkIfPairWithTheGivenSumExists = " + checkIfPairWithTheGivenSumExists);
    }

}
