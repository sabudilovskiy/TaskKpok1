package Geometry;

public class Triangle {
    private Point[] points;
    public Triangle(Point a, Point b, Point c){
        points = new Point[3];
        points[0] = a;
        points[1] = b;
        points[2] = c;
    }
    public double getArea(){
        return Vector.vectorMultiple (
                new Vector (points[0], points[1]),
                new Vector (points[1], points[2])).length ()/2;
    }
}
