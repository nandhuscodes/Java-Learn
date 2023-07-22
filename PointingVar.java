class Point{
    int x;
    int y;
}
public class PointingVar {
    public static void main(String[] args) {
        Point p = new Point();
        // Primitive have no def value, but non-primitive have
        System.out.println(p.x+" "+p.y);
        p.x = 10;
        p.y = 20;
        System.out.println(p.x+" "+p.y);
    }
}
