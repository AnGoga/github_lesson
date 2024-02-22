package module2;

import java.util.Locale;

public class Vector2D {
    public double vX;
    public double vY;

    public static int count;

    public Vector2D() {
        count += 1;
        this.vX = 1d;
        this.vY = 1d;
    }

    public Vector2D(double vX, double vY) {
        count += 1;
        this.vX = vX;
        this.vY = vY;
    }

    public Vector2D(Vector2D vector) {
        count += 1;
        this.vX = vector.vX;
        this.vY = vector.vY;
    }


    public double length() {
        return Math.sqrt(vX * vX + vY * vY);
    }

    public void normalized() {
        double l = length();
        this.vX /= l;
        this.vY /= l;
    }

    public void add(Vector2D v) {
        this.vX += v.vX;
        this.vY += v.vY;
    }

    public void sub(Vector2D v) {
        this.vX -= v.vX;
        this.vY -= v.vY;
    }

    public void scale(double scaleFactor) {
        this.vX *= scaleFactor;
        this.vY *= scaleFactor;
    }

    public double dotProduct(Vector2D v) {
        return this.vX * v.vX + this.vY * v.vY;
    }

    public void print() {
        String stringVX = String.format(Locale.US, "%.2f", vX);
        String stringVY = String.format(Locale.US, "%.2f", vY);
        System.out.println("(" + stringVX + ", " + stringVY + ")");
    }
}
