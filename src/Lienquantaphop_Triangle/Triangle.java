package Lienquantaphop_Triangle;
public class Triangle {
    private Point vertice1;
    private Point vertice2;
    private Point vertice3;

    public Triangle(Point vertice1, Point vertice2, Point vertice3) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    public void setVertice1(Point vertice1) {
        this.vertice1 = vertice1;
    }

    public Point getVertice1() {
        return vertice1;
    }

    public void setVertice2(Point vertice2) {
        this.vertice2 = vertice2;
    }

    public Point getVertice2() {
        return vertice2;
    }

    public void setVertice3(Point vertice3) {
        this.vertice3 = vertice3;
    }

    public Point getVertice3() {
        return vertice3;
    }

    public double getPerimeter() {
        return distance(vertice1, vertice2) + distance(vertice2, vertice3) + distance(vertice3, vertice1);
    }

    private static double distance(Point p1, Point p2) {
        int xDiff = p2.getX() - p1.getX();
        int yDiff = p2.getY() - p1.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
    @Override
    public String toString() {
        return "Tam giác với các đỉnh: " + vertice1 + ", " + vertice2 + ", " + vertice3;
    }
}
