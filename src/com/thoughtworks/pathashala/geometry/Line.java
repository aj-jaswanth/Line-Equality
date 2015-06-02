package com.thoughtworks.pathashala.geometry;

public class Line {
    private int startX, startY, endX, endY;

    public Line(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public double length() {
        double length1 = Math.pow(startX - startY, 2);
        double length2 = Math.pow(endX - endY, 2);
        return Math.sqrt(length1 + length2);
    }
}