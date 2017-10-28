/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.math.exception;

/**
 *
 * @author jmzc
 */
public class InvalidRangeException extends Exception {

    /**
     * Creates a new instance of <code>InvalidRangeException</code> without
     * detail message.
     */
    public InvalidRangeException() {
    }

    /**
     * Constructs an instance of <code>InvalidRangeException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidRangeException(String msg) {
        super(msg);
    }
}
