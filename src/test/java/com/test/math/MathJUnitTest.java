/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.math;

import static com.test.math.MathTest.prime;
import com.test.math.exception.InvalidRangeException;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author jmzc
 */
public class MathJUnitTest {
    
    
    
    public MathJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

  
    @Test(expected = InvalidRangeException.class)
    public void test1() throws Exception{
    
        MathTest.fibonacci1(-1);
        
        
    
    }
    
    @Test
    public void test2() throws Exception{
    
        int n = MathTest.fibonacci1(7);
        Assert.assertEquals(8, n);
        
        
    
    }
    
    @Test
    public void test3() throws Exception{
    
        Assert.assertTrue(MathTest.prime(7));
        
        
    
    }
    
    @Test
    public void test4() throws Exception{
    
        Assert.assertFalse(MathTest.prime(100));
        
        
    
    }

}
