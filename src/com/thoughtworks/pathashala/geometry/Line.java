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
        double length1 = Math.pow(startX - endX, 2);
        double length2 = Math.pow(startY - endY, 2);
        return Math.sqrt(length1 + length2);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject != null) {
            if (this.getClass() == otherObject.getClass()) {
                Line otherLine = (Line) otherObject;
                boolean areEqual = false;

                if (startX == otherLine.startX)
                    if (startY == otherLine.startY)
                        if (endX == otherLine.endX)
                            if (endY == otherLine.endY)
                                areEqual = true;

                if (areEqual == false)
                    if (startX == otherLine.endX)
                        if (startY == otherLine.endY)
                            if (endX == otherLine.startX)
                                if (endY == otherLine.startY)
                                    areEqual = true;

                return areEqual;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hashCode;
        hashCode = 31 * startX + startY;
        hashCode += 31 * endX + endY;
        return hashCode;
    }
}