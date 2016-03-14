/**
 * Generated by Agitar build: AgitarOne Version 5.3.0.000022 (Build date: Jan 04, 2012) [5.3.0.000022]
 * JDK Version: 1.6.0_14
 *
 * Generated on 29 Jul, 2013 5:08:58 PM
 * Time to generate: 00:13.491 seconds
 *
 */

package com.huawei.unibi.molap.engine.executer.impl;

import com.agitar.lib.junit.AgitarTestCase;

public class ResultComparartorAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return ResultComparartor.class;
    }
    
    public void testConstructor() throws Throwable {
        ResultComparartor resultComparartor = new ResultComparartor(100);
        assertEquals("resultComparartor.queryDimLen", 100, ((Number) getPrivateField(resultComparartor, "queryDimLen")).intValue());
    }
    
    public void testCompare() throws Throwable {
        double[] o2 = new double[4];
        double[] o1 = new double[4];
        o1[2] = 100.0;
        int result = new ResultComparartor(100).compare(o1, o2);
        assertEquals("result", 1, result);
    }
    
    public void testCompare1() throws Throwable {
        double[] o1 = new double[2];
        double[] o2 = new double[2];
        o2[0] = 100.0;
        int result = new ResultComparartor(100).compare(o1, o2);
        assertEquals("result", -1, result);
    }
    
    public void testCompare2() throws Throwable {
        double[] o2 = new double[6];
        double[] o1 = new double[4];
        int result = new ResultComparartor(1).compare(o1, o2);
        assertEquals("result", 0, result);
    }
    
    public void testCompare3() throws Throwable {
        double[] o2 = new double[6];
        double[] o1 = new double[4];
        o1[0] = 0.10000000149011612;
        int result = new ResultComparartor(100).compare(o1, o2);
        assertEquals("result", 1, result);
    }
    
    public void testCompare4() throws Throwable {
        double[] o1 = new double[6];
        double[] o2 = new double[4];
        o2[2] = 15.23753547668457;
        o2[3] = 100.0;
        int result = new ResultComparartor(100).compare(o1, o2);
        assertEquals("result", -1, result);
    }
    
    public void testCompare5() throws Throwable {
        double[] o1 = new double[5];
        double[] o2 = new double[4];
        int result = new ResultComparartor(0).compare(o1, o2);
        assertEquals("result", 0, result);
    }
    
    public void testCompareThrowsArrayIndexOutOfBoundsException() throws Throwable {
        double[] o2 = new double[0];
        double[] o1 = new double[3];
        try {
            new ResultComparartor(100).compare(o1, o2);
            fail("Expected ArrayIndexOutOfBoundsException to be thrown");
        } catch (ArrayIndexOutOfBoundsException ex) {
            assertEquals("ex.getMessage()", "0", ex.getMessage());
            assertThrownBy(ResultComparartor.class, ex);
        }
    }
    
    public void testCompareThrowsArrayIndexOutOfBoundsException1() throws Throwable {
        double[] o2 = new double[1];
        double[] o1 = new double[3];
        try {
            new ResultComparartor(100).compare(o1, o2);
            fail("Expected ArrayIndexOutOfBoundsException to be thrown");
        } catch (ArrayIndexOutOfBoundsException ex) {
            assertEquals("ex.getMessage()", "1", ex.getMessage());
            assertThrownBy(ResultComparartor.class, ex);
        }
    }
    
    public void testCompareThrowsNullPointerException() throws Throwable {
        double[] o2 = new double[0];
        try {
            new ResultComparartor(100).compare((double[]) null, o2);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException ex) {
            assertNull("ex.getMessage()", ex.getMessage());
            assertThrownBy(ResultComparartor.class, ex);
        }
    }
}
