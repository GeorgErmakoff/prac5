package ru.gotchezz.ex5;

public class cyrcle {
    private point center;
    private double radius;

    public cyrcle(point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    protected void setCenter(point center) {
        this.center = center;
    }

    protected void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "cyrcle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
