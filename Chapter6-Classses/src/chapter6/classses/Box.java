package chapter6.classses;

public class Box {

    private Rectangle topAndBottom;
    private Rectangle frontAndBack;
    private Rectangle sides;

    public Box(int topLength, int topWidth, int frontWidth) {
        // topLength == frontLength 
        // topWidth == sideLength
        // frontWidth == sideWidth

        if (topLength < 1) {
            topLength = 1;
        }

        if (topWidth < 1) {
            topWidth = 1;
        }

        if (frontWidth < 1) {
            frontWidth = 1;
        }

        topAndBottom = new Rectangle(topLength, topWidth);
        frontAndBack = new Rectangle(topLength, frontWidth);
        sides = new Rectangle(topWidth, frontWidth);
    }

    public int surfaceArea() {
        return topAndBottom.getArea() * 2 + frontAndBack.getArea() * 2
                + sides.getArea() * 2;
    }

    public int getVolume() {
        return topAndBottom.getArea() * frontAndBack.getWidth();
    }
}
