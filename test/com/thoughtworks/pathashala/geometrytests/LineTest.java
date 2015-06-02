package com.thoughtworks.pathashala.geometrytests;

import com.thoughtworks.pathashala.geometry.Line;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class LineTest {

    @Test
    public void lineOfLengthZero() {
        Line line = new Line(3, 3, 3, 3);

        double actual = line.length();

        Assert.assertThat(actual, is(0.0));
    }

    @Test
    public void lineOfUnitLength() {
        Line line = new Line(3, 3, 4, 3);

        double actual = line.length();

        Assert.assertThat(actual, is(1.0));
    }
    
}
