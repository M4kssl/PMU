package com.example.laba1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void testMax() {
        MainActivity m = new MainActivity();
        assertEquals(m.Max(1,2),2);
    }
    @Test
    public void testMin() {
        MainActivity m = new MainActivity();
        assertEquals(m.Min(1,2),1);
    }
    @Test
    public void testMax2() {
        MainActivity m = new MainActivity();
        assertEquals(m.Max(2,1),2);
    }
    @Test
    public void testMin2() {
        MainActivity m = new MainActivity();
        assertEquals(m.Min(2,1),1);
    }
    @Test
    public void testMax3() {
        MainActivity m = new MainActivity();
        assertEquals(m.Max(1,1),1);
    }
    @Test
    public void testMin3() {
        MainActivity m = new MainActivity();
        assertEquals(m.Min(1,1),1);
    }
    @Test
    public void testMax4() {
        MainActivity m = new MainActivity();
        assertEquals(m.Max(0,0),0);
    }
    @Test
    public void testMin4() {
        MainActivity m = new MainActivity();
        assertEquals(m.Min(0,0),0);
    }
}