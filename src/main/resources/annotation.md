# Annotation
有一个例子是Unit Test的注解@Test，这个注解并没有做什么事情，加了注解的方法
是通过放射机制来运行的。

Java内置了三个注解：
@Override, @Deprecated, @SuppressWarnings

Java提供了另外4个元注解，用于创建自己的注解。

注解适用于描述性质的类和接口，而且如果产生重复了就可以使用注解来简化和自动化这个过程。
注解的使用方式几乎与修饰符的使用一模一样。

#元注解
元注解用于创建新的注解
@target:表示该注解用在method,package或者别的地方   
@Retention:表示在什么级别保存该注解，@Source, @Class, @Runtime   
@Documented：将此注解包含在Javadoc中   
@Inherited:允许子类继承父类中的注解

#注解处理器
