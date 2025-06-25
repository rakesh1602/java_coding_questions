public class PolymorphisamExample extends InheritanceExample1 {

    @Override
    public int add(int i, int i2) {
        return super.add(i, i2);
    }

    public int add(int i, int i2, int i3){
        return i + i2 + i3;
    }

    public static void main(String[] args) {
     InheritanceExample1 example = new PolymorphisamExample();
     example.add(1,2);
    }
}
