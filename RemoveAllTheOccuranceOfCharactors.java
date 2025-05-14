public class RemoveAllTheOccuranceOfCharactors {

    static String removeOccuranceOfCharacter(String string){
        return string.replace("a", "");
    }

    public static void main(String[] args) {
        String removeOccuranceOfCharacter = removeOccuranceOfCharacter("raakesha");
        System.out.println("removeOccuranceOfCharacter = " + removeOccuranceOfCharacter);
    }
}
