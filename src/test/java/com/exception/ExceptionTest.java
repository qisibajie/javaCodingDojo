package com.exception;

import org.junit.Test;

public class ExceptionTest {

    @Test(expected = NullPointerException.class)
    public void testRuntimeExceptionForThrowException() {
        PersonThrowException personThrowException = new PersonThrowException();

        personThrowException.throwNullPointException();

    }

    @Test(expected = NullPointerException.class)
    public void testRuntimeExceptionForNoThrowException() {
        PersonThrowException personThrowException = new PersonThrowException();

        personThrowException.noThrowNullPointException();

    }

    @Test
    public void test2(){
        int total = 0;
        for(int i=0; i<10;i++){
            total += 8.28 * getSubTotal(i+1);
            System.out.println(8.28 * getSubTotal(i+1));
        }
        System.out.println(total);
    }

    public double getSubTotal(int i){
        double subTotal = 1;
        for(int j =0; j< i; j++){
            subTotal = subTotal * (1.15/1.09);
        }
        return subTotal;
    }
}
