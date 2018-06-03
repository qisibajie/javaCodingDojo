package com.mock;

import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.util.Arrays;
import java.util.List;

public class BaseMockAnswer implements Answer<Object> {
    private List<Object> arguments;
    private Object return4Answer;

    @Override
    public Object answer(InvocationOnMock invocationOnMock) {
        arguments = Arrays.asList(invocationOnMock.getArguments());
        return return4Answer;
    }

    public List<Object> getArguments() {
        return arguments;
    }

    public void setReturn4Answer(Object return4Answer) {
        this.return4Answer = return4Answer;
    }
}
