package by.epam.task02.entity;

public class Point {
    private double x;
    private double y;
    private double z;
    private double k;
    private double a;


    public Point(double x, double y, double z, double k, double a) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.k = k;
        this.a = a;
    }

    public Point(Point point) {
        x = point.x;
        y = point.y;
        z = point.z;
        k = point.k;
        a = point.a;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0 &&
                Double.compare(point.z, z) == 0 &&
                Double.compare(point.k, k) == 0 &&
                Double.compare(point.a, a) == 0;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result += result * 31 + x;
        result += result * 31 + y;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Point{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", z =").append(z);
        sb.append(", k =").append(k);
        sb.append(", a =").append(a);
        sb.append('}');
        return sb.toString();
    }
}
