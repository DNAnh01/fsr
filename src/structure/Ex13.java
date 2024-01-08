package structure;

import structure.bean.Circle;
import structure.bean.CirclePosition;
import structure.bean.Point;

/**
 * Viết chương trình tìm "vị trí tương đối" của một điểm A so với đường tròn tâm
 * O bán kính R A(5, 7), [O(0, 0), R = 6]
 */
public class Ex13 {
    public static void main(String[] args) {
        Point pA = new Point(3, 3);
        Point pO = new Point(0, 0);
        int R = 5;
        Circle circle = new Circle(pO, R);

        CirclePosition position = findPosition(pA, circle);
        System.out.println("position: " + position);

        // TODO: replace == with equals
        if (position == CirclePosition.INSIDE) {
            System.out.println("Do further things ....");
        }

    }

    private static CirclePosition findPosition(Point pA, Circle circle) {
        double distance = Math.sqrt(Math.pow((pA.x - circle.point.x), 2) + Math.pow((pA.y - circle.point.y), 2));
        if (distance == circle.R) {
            return CirclePosition.ONSIDE;
        }
        if (distance < circle.R) {
            return CirclePosition.INSIDE;
        }
        return CirclePosition.OUTSIDE;
    }
}
