interface Area {
    void getArea(int a, int b);
}

interface Square {
    void getSquare(int a);
}

interface module extends Square {
    void getModule();
}

class Rectangle implements Area, Square, module {
    @Override
    public void getArea(int a, int b) {
        System.out.println(a * b);
    }

    @Override
    public void getSquare(int a) {
        int newResult = a * a % 2 *4 + 6;
        System.out.println("a*a = " + a*a);
        System.out.println("newResult = " + newResult);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.getArea(4,5);
        rectangle.getSquare(5);
    }

    @Override
    public void getModule() {

    }
}

