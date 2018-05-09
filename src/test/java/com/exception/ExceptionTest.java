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
}
