package com.example.lab1;
class main {
    public static void main(String[] args) {
        Segment seg = new Segment(new Point(0, 0), new Point(10, 10));
        Segment arr[] = Segment.perpendicular(seg, new Point(0, 5));
        System.out.println(arr[0].toSvg());
    }
}