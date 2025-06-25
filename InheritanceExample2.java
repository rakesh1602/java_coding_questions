public class InheritanceExample2 extends InheritanceExample1 {

    private void newMessage1(){
        System.out.println("new message");
    }

    public void getMessage() {
        super.getMessage();
        System.out.println("getMessage 2");
    }


    public static void main(String[] args) {
        InheritanceExample2 inheritanceExample2 = new InheritanceExample2();
        inheritanceExample2.getMessage();
    }
}
