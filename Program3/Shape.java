package Program3;

public class Shape {

    public String toString() {
        return "This is a shape";
    }

    public static void main(String[] args) {

        Shape a = new Shape();
        Rectangle Rec, Cube;
        Rec = new Rectangle(4, 8);
        Cube = new Cube(2, 2, 2);

        System.out.println(a.toString());
        System.out.println(Rec.toString());
        System.out.println(Cube.toString());

    }

}
