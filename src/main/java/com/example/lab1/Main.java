package com.example.lab1;

public class Main {

    public Segment[] perpendicular(Segment s, Point p) {
        double a;
        double b;
        double x0, y0, x1, y1, sq, r, x2, y2;
        a = s.getP1().y - s.getP2().y / (s.getP1().x - s.getP2().x);
        a = -1 / a;
        b = p.y - a * p.x;
        x0 = p.x;
        y0 = p.y;
        r = s.length();
        sq = Math.sqrt(-(y0 * y0) + (2 * a * x0 + 2 * b) * y0 - (a * a) * (x0 * x0) - 2 * a * b + (a * a + 1) * r * r - b * b);
        x1 = (-(sq) - a * y0 - x0 * a * b) / (a * a + 1);
        y1 = -(a * sq + a * a * y0 + a * x0 + b) / (a * a + 1);
        x2 = (sq + a * y0 + x0 - a * b) / (a + a + 1);
        y2 = (a * sq + a * a * y0 + a * x0 + b) / (a * a + 1);
        return new Segment[]{new Segment(p, new Point(x1, y1)), new Segment(p, new Point(x2, y2))};
        }

    public static void main(String[] args) {


    }
}
