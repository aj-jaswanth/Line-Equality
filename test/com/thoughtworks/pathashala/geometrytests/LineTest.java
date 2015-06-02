package com.thoughtworks.pathashala.geometrytests;

import com.thoughtworks.pathashala.geometry.Line;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class LineTest {

    @Test
    public void lengthOfLineHavingZeroLength() {
        Line line = new Line(3, 3, 3, 3);

        double actual = line.length();

        Assert.assertThat(actual, is(0.0));
    }

    @Test
    public void lengthOfLineHavingUnitLength() {
        Line line = new Line(3, 3, 4, 3);

        double actual = line.length();

        Assert.assertThat(actual, is(1.0));
    }

    @Test
    public void lengthOfLineNotHavingUnitLength() {
        Line line = new Line(0, 0, 3, 4);

        double actual = line.length();

        Assert.assertThat(actual, is(5.0));
    }

    @Test
    public void equalityOfLinesOriginatingAndEndingAtSamePoint() {
        Line firstLine = new Line(3, 3, 3, 3);
        Line secondLine = new Line(3, 3, 3, 3);

        boolean actual = firstLine.equals(secondLine);

        Assert.assertThat(actual, is(true));
    }

    @Test
    public void equalityOfLinesOriginatingAndEndingAtDifferentPoint() {
        Line firstLine = new Line(-1, -2, 3, 9);
        Line secondLine = new Line(3, 9, -1, -2);

        boolean actual = firstLine.equals(secondLine);

        Assert.assertThat(actual, is(true));
    }

    @Test
    public void equalityOfLineAndNothing() {
        Line firstLine = new Line(3, 3, 3, 3);

        boolean actual = firstLine.equals(null);

        Assert.assertThat(actual, is(false));
    }

    @Test
    public void equalityOfLineAndOtherObject() {
        Line firstLine = new Line(3, 3, 3, 3);

        boolean actual = firstLine.equals("OtherString");

        Assert.assertThat(actual, is(false));
    }

    @Test
    public void reflexivePropertyOfEqualsMethod() {
        Line line = new Line(3, 3, 3, 3);

        boolean actual = line.equals(line);

        Assert.assertThat(actual, is(true));
    }

    @Test
    public void symmetricPropertyOfEqualsMethod() {
        Line firstLine = new Line(3, 3, 2, 1);
        Line secondLine = new Line(3, 3, 2, 1);

        boolean actual = firstLine.equals(secondLine) == secondLine.equals(firstLine);

        Assert.assertThat(actual, is(true));
    }

    @Test
    public void transitivePropertyOfEqualsMethod() {
        Line firstLine = new Line(3, 3, 4, 4);
        Line secondLine = new Line(3, 3, 4, 4);
        Line thirdLine = new Line(3, 3, 4, 4);

        boolean actual = firstLine.equals(secondLine) && secondLine.equals(thirdLine) && firstLine.equals(thirdLine);

        Assert.assertThat(actual, is(true));
    }
}
