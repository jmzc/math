/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.math;

import com.test.math.exception.InvalidRangeException;
import java.util.HashMap;
import java.util.Map;

/**
 * Math test class
 * @author jmzc
 */
public class MathTest {
    
    private static final Map<Integer,Integer> CACHE = new HashMap();
    /**
     * Return fibonnaci value 
     * @param n
     * @return 
     * @throws com.test.math.exception.InvalidRangeException 
     * 
     * 0 1 1 2 3 5 8 
     */
    public static int fibonacci100(int n) throws InvalidRangeException{
        
        if ( n <= 0)
            throw new InvalidRangeException("Invalid range: must be > 0");
        
        switch(n) {
            case 1:
               return 0; 
            case 2: {
               return 1; 
            }  
            default: {
                 
                 Integer r = CACHE.putIfAbsent(n,fibonacci100(n-2) + fibonacci100(n-1));

                 return ( r != null )? r: CACHE.get(n);
            }
               
        }
  
    }
    
    public static boolean prime(int n) throws InvalidRangeException{
        
         if ( n <= 0)
            throw new InvalidRangeException("Invalid range: must be > 0");

         int sqrt = (int)Math.sqrt(n) + 1;

         for (int i=2; i <= sqrt ; i++) {
         
            if (n % i == 0)
                return false;
 
         }
                    
         return true;
         
         
    }
    
    
    
    
    
    
}
