package com.staticUsage;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class MainClassTest {

    @Test
    public void testReturnValue(){
        //given
        BaseClass baseClass = new ChildClass();

        //then
        assertThat(BaseClass.returnValue(), is("Base"));
        assertThat(ChildClass.returnValue(), is("Child"));
        assertThat(baseClass.returnValue(), is("Base"));//Base, but not Child, 和一般的override不同
    }

    @Test
    public void testGetNormalMethod(){
        //given
        BaseClass baseClass = new ChildClass();

        //then
        assertThat(baseClass.getNormalMethod(), is("Child Normal"));
    }

}