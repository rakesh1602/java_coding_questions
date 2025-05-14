public class CountingValleys {

    //hiker climb from sea level
    //Mountain - step above sea level
    //Valley - steps below sea level
    // Count number if valley hiker passed

    // count steps gone below the sea level
    // altitude < 0 --> valley increase

    public static int countingValley(int steps, String path) {
        int altitude = 0;
        int valley = 0;

        for (int i = 0; i <steps; i++) {
            char step = path.charAt(i);
            if (step == 'U') {
                altitude++;
                //Check if come up to the sea level from a valley
                if (altitude == 0) {
                    valley++;
                }
            } else if (step == 'D') {
                altitude--;
            }
        }
        return valley;
    }

    public static void main(String[] args) {
        int steps = 12;
        String path = "DDUUDDUDUUUD";
        System.out.println("Number of valleys: " + countingValley(
                steps, path));
    }


}
