/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.joptionpaneactivty;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class CalculatorTest {
    
    

    
    /**
     * Test of subtract method, of class Calculator.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        double a = 0.0;
        double b = 0.0;
        Calculator instance = new Calculator();
        double expResult = 0.0;
        double result = instance.subtract(a, b);
        assertEquals(expResult, result, 0);
       
    }
    @Test
    public void testfailedSubtract() {
        System.out.println("subtract");
        double a = 0.0;
        double b = 0.0;
        Calculator instance = new Calculator();
        double expResult = 0.0;
        double result = instance.subtract(a, b);
        assertEquals(expResult, result, 0);
       
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        double a = 0.0;
        double b = 0.0;
        Calculator instance = new Calculator();
        double expResult = 0.0;
        double result = instance.multiply(a, b);
        assertEquals(expResult, result, 0);
       
    }
     @Test
    public void testfailedMultiply() {
        System.out.println("multiply");
        double a = 3.0;
        double b = 4.0;
        Calculator instance = new Calculator();
        double expResult = 12.0;
        double result = instance.multiply(a, b);
        assertEquals(expResult, result, 0);
       
    }

    /**
     * Test of divide method, of class Calculator.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        double a = 10.0;
        double b = 2.0;
        Calculator instance = new Calculator();
        double expResult = 5.0;
        double result = instance.divide(a, b);
        assertEquals(expResult, result, 0);
       
    }
    @Test
    public void testfailedDivide() {
        System.out.println("divide");
        double a = 10.0;
        double b = 3.0;
        Calculator instance = new Calculator();
        double expResult = 10.0 / 3.0;
        double result = instance.divide(a, b);
         assertEquals(expResult, result, 0.01);
       
    }
    
}
