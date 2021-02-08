package Program3;

public class Rectangle {
    int width, height;

    public Rectangle(int w, int h) {

        this.width = w;
        this.height = h;
    }

    // overiding method
    public String toString() {

        return "This rectangle with width as " + width + " and height as " + height;
    }
}
