package com.exception;

public class PersonThrowException {
    public void throwNullPointException() throws NullPointerException{
        popUpNullPointException();
    }

    public void noThrowNullPointException(){
        popUpNullPointException();
    }

    private void popUpNullPointException() {
        int[] indexes = null;
        System.out.println(indexes.length);
    }
}
