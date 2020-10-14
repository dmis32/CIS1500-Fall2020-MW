package chapter6.classses;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        if (length > 0) {
            this.length = length;
        } else {
            this.length = 0;
        }

        if (width > 0) {
            this.width = width;
        } else {
            this.width = 0;
        }
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getPerimeter() {
        return length * 2 + width * 2;
    }

    public int getArea() {
        return length * width;
    }

    public boolean equals(Rectangle other) {
        return length == other.length && width == other.width;
    }
}
