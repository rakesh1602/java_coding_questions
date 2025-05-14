abstract class Animal {
    void getAnimal(){
        System.out.println("animal");
    }

    abstract int getArea();
    abstract String getName();
}

abstract class newAnimal{
    String name(){
      return "djf";
    }
}

class Abstraction extends Animal{
    void letPrint(){
        System.out.println("printing");
    }

    @Override
    int getArea() {
        System.out.println("true = " + true);
        return 0;
    }

    @Override
    String getName() {
        return "";
    }

    public static void main(String[] args) {
        Abstraction abstraction = new Abstraction();
        abstraction.letPrint();
        abstraction.getArea();
    }
}
