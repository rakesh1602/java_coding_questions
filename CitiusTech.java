public class CitiusTech {

    //Write a program to print all combinations of the given string ABC - ABC, ACB, BAC, BCA, CAB, CBA.

    public static void generatePermutations(String str, String result) {
        if (str.isEmpty()) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            generatePermutations(remaining, result + ch);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        generatePermutations(str, "");
    }
}
