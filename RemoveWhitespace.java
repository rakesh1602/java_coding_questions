import java.util.stream.Collectors;

public class RemoveWhitespace {

    public static String removeWhiteSpace(String string){
        String noSpace = string.chars()
                .filter(c-> !Character.isWhitespace(c))
                .mapToObj(c-> String.valueOf((char)c))
                .collect(Collectors.joining());
        System.out.println(noSpace);
        return noSpace;
    }


    public static void removeWhiteSpaceTrad(String string){
        char[] charArrays = string.toCharArray();
        StringBuilder out = new StringBuilder();
        for (char s : charArrays){
            if (!Character.isWhitespace(s)){
                out.append(s);
            }
        }
        System.out.println(out);
    }

    public static void main(String[] args) {
        removeWhiteSpace("rakesh Chavan");
        removeWhiteSpaceTrad("email Id Of the Person");
    }
}
