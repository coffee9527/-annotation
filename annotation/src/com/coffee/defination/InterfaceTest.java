package com.coffee.defination;
/**
 * 使用@interface来定义注解，
 * 这种方式实际上是自动继承了java.lang.annotation.Annotation接口，
 * 但没有导入java.lang.annotation包
 * 如果显示的继承了Annotation接口则不会有注解的效果，只是普通的接口继承
 * @author Administrator
 *
 */
public @interface InterfaceTest {

}
