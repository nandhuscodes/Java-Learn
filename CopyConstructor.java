public class CopyConstructor {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 10;
        p1.y = 20;
        Point p2 = p1;
        p2.x = 30;
        // Non-primitive talks about ref
        System.out.println(p1.x+" "+p2.x);
    }
}
