public class PangramCheck {

    //containing 26 character of alphabet or not
    public static String pangrams(String s) {
        long count = s.toLowerCase().chars().filter(Character::isLetter).distinct().count();
        return count == 26 ? "pangram" : "not pangram";
    }
}
