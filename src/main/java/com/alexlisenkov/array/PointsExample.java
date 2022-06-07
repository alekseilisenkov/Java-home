package com.alexlisenkov.array;

import java.awt.*;
import java.util.*;

public class PointsExample {
    int x;
    int y;

    public void Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Comparator<Point> sortByX = new Comparator<Point>() {
        @Override
        public int compare(Point p1, Point p2) {
            return p1.x - p2.x;
        }
    };

    public static Comparator<Point> sortByY = new Comparator<Point>() {
        @Override
        public int compare(Point p1, Point p2) {
            return p1.y - p2.y;
        }
    };

    @Override
    public String toString() {
        return "[" + x + "," + y + "]";
    }

    public static void main(String[] args) {

        Point[] points = new Point[4];

        points[0] = new Point(5, 2);
        points[1] = new Point(3, 4);
        points[2] = new Point(4, 5);
        points[3] = new Point(5, 6);

        Arrays.sort(points, sortByX);
        System.out.println("Сортировка byX: " + Arrays.toString(points));
        Arrays.sort(points, sortByY);
        System.out.println("Сортировка byY: " + Arrays.toString(points));
    }
}
