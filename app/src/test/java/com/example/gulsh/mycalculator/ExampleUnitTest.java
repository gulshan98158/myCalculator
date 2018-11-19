package com.example.gulsh.mycalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


        MainActivity_calculator c;

        @Before
        public void setUp()throws Exception
        {
            c=new MainActivity_calculator();
        }

    // TEST CASES FOR ADDITION
        @Test
        //test 1

        public void testAddition_input4and4_output8() throws Exception {
            //  Arrange
            double i = 4;
            double j = 4;

            //  Act
            double result = c.addition(i, j);

            // Assert
            assertEquals(8, result,0);
        }

        @Test
        //test 2


        public void testAddition_input0and4_output4() throws Exception {
            //  Arrange
            double i = 0;
            double j = 4;

            // Act
            double result = c.addition(i, j);

            //  Assert
            assertEquals(4.0, result,0);
        }



        @Test
        //test 3

        public void testAddition_twoAndNegativeTwoPointTwo_negativeZeroPointTwo() throws Exception {
            //  Arrange
            double i = 2.0;
            double j = -2.2;


            //  Act
            double result = c.addition(i, j);

            // Assert
            assertEquals(-0.2, result,1);
        }



        // TEST CASES FOR SUBTRACTION

        @Test
        //test 4

        public void testSubtraction_3and2_1() throws Exception {
            //  Arrange
            double i = 3;
            double j = 2;

            // Act
            double result = c.subtraction(i, j);

            //  Assert
            assertEquals(1.0, result,0 );
        }

        @Test
        //test 5

        public void testSubtraction_negative11And4_negative7() throws Exception {
            //  Arrange
            double i = -11;
            double j = -4;

            //  Act
            double result = c.subtraction(i, j);

            // Assert
            assertEquals(-7.0, result,0);
        }



    @Test
    // Test 6

    public void testSubtraction3_negative7and4_negative10() throws Exception {
        // Arrange
        double i = -7;
        double j = 4;

        //  Act
        double result = c.subtraction(i, j);

        //  Assert
        assertEquals(-11, result,0);
    }




    // TEST CASES FOR MULTIPLICATION

        @Test
        // Test 7

        public void testMultiplication_100And10_1000() throws Exception {
            // 1. Arrange
            double i = 100;
            double j = 10;

            // 2. Act
            double result = c.multiplication(i, j);

            // 3. Assert
            assertEquals(1000.0, result,0);
        }

        @Test
        // Test 8
        public void testMultiplication_Negative2_Negative3_Positive6() throws Exception {
            // 1. Arrange
            double i = -2;
            double j = -3;

            // 2. Act
            double result = c.multiplication(i, j);

            // 3. Assert
            assertEquals(6.0, result,0);
        }

        @Test
        // Test 9

        public void testMultiplication_0AndNegative5_0() throws Exception {
            //  Arrange
            double i = 0;
            double j = -5;

            // Act
            double result = c.multiplication(i, j);

            // Assert
            assertEquals(0.0, result,0);
        }



        // TEST CASES FOR DIVISION

        @Test
        // Test 10

        public void testDivision_1and1_1() throws Exception {
            // Arrange
            double i = 1;
            double j = 1;

            // Act
            double result = c.division(i, j);

            // Assert
            assertEquals(1, result,0);
        }


        @Test
        // Test 11

        public void testDivision_2And1_2() throws Exception {
            //  Arrange
            double i = 2;
            double j = 1;

            // Act
            double result = c.division(i, j);

            //  Assert
            assertEquals(2, result,0);
        }


        @Test
        // Test 12

        public void testDivision_9And3Point3() throws Exception {
            // Arrange
            double i = 9;
            double j = 3;

            //  Act
            double result = c.division(i, j);

            //  Assert
            assertEquals(3, result,0);
        }


    }

