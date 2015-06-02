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
    public void equalityOfLineAndNothing() {
        Line firstLine = new Line(3, 3, 3, 3);

        boolean actual = firstLine.equals(null);

        Assert.assertThat(actual, is(false));
    }
}
