package com.mock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.api.support.membermodification.MemberMatcher;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Student.class,PersonType.class})
public class PersonTest {

    @Test
    public void testMockInterface() {
        Person person = mock(Person.class);
        String mockPersonGetName = "mockPersonGetName";
        when(person.getName()).thenReturn(mockPersonGetName);

        assertThat(person.getName(), is(mockPersonGetName));
    }

    @Test
    public void testMockNormalMethod() {
        Student student = mock(Student.class);
        String mockStudentGetName = "mockStudentGetName";
        when(student.getName()).thenReturn(mockStudentGetName);

        assertThat(student.getName(), is(mockStudentGetName));
    }

    @Test
    public void testMockFinalMethod() {
        Student student = PowerMockito.mock(Student.class);
        String mockFinalMethod = "mockFinalMethod";
        when(student.getFinalMethod()).thenReturn(mockFinalMethod);

        assertThat(student.getFinalMethod(), is(mockFinalMethod));
    }

    @Test
    public void testMockPrivateMethod() throws Exception {
        Student student = PowerMockito.spy(new Student());
        String mockPrivateMethod = "mockPrivateMethod";

        PowerMockito.when(student, "getPrivateMethod").thenReturn(mockPrivateMethod);

        assertThat(student.callPrivateMethod(), is(mockPrivateMethod));
    }

    @Test
    public void testMockPrivateMethodWithStub() throws Exception {
        Student student = new Student();
        String mockPrivateMethod = "mockPrivateMethod";

        PowerMockito.stub(MemberMatcher.method(Student.class, "getPrivateMethod")).toReturn(mockPrivateMethod);

        assertThat(student.callPrivateMethod(), is(mockPrivateMethod));
    }

    @Test
    public void testMockStaticMethod(){
        mockStatic(Student.class);
        String mockStaticMethod = "mockStaticMethod";
        when(Student.getStaticMethod()).thenReturn(mockStaticMethod);

        assertThat(Student.getStaticMethod(), is(mockStaticMethod));
    }

    @Test
    public void testMockConstructMethod() throws Exception {
        Student student1000 = new Student(1000);
        PowerMockito.whenNew(Student.class).withArguments(10).thenReturn(student1000);

        Student student10 = new Student(10);

        assertThat(student10.getAge(), is(1000));
    }

    @Test
    public void testMockEnum(){
        PersonType personType = PowerMockito.mock(PersonType.class);
        Whitebox.setInternalState(PersonType.class, "N", personType);
        when(personType.getType()).thenReturn("mockN");

        assertThat(PersonType.N.getType(), is("mockN"));
        assertThat(PersonType.S.getType(), is("student"));
    }

}
