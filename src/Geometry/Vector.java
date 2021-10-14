package Geometry;

public class Vector {
    private double x,y,z;
    public Vector(double x,double y,double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector(Point begin, Point end){
        x = end.getX () - begin.getX ();
        y = end.getY () - begin.getY ();
        z = 0;
    }
    static public Vector vectorMultiple(Vector a, Vector b){
        return new Vector (
                a.y*b.z - a.z*b.y,
                a.z*b.x - a.x*b.z,
                a.x*b.y - a.y*b.x);
    }
    public double length() {
        return Math.sqrt (Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2));
    }
}
