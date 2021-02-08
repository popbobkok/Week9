package Program3;

class Cube extends Rectangle {

    int length;

    public Cube(int w, int h, int l) {
        super(w, h);
        this.length = l;
    }

    // overiding method
    public String toString() {

        return "This is a cube with the side of " + length;
    }
}