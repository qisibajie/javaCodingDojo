package com.mock;

import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class PersonPrinterAnswer implements Answer<Object> {

    private Person person;

    @Override
    public Person answer(InvocationOnMock invocationOnMock) {
        Object[] args = invocationOnMock.getArguments();
        person = (Person) args[0];
        return person;
    }

    public Person getPerson() {
        return person;
    }
}
