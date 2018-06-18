package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@target这个注解用于表示自定义的注解使用的地方(方法或者一个域)
@Target(ElementType.METHOD)
//@Retention这个用于定义注解使用的级别(Source, Class, Runtime)
@Retention(RetentionPolicy.RUNTIME)
//没有元素的注解被称为标记注解
public @interface UseCase {
    int id();
    String description() default "no description";
}
