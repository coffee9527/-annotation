package com.coffee.defination;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @Target-表示该注解用于什么地方，如果不明确指出，该注解可以放在任何地方，以下是一些可用的参数。
 * 要说明的是：属性的注解是兼容的
 * ElementType.PACKAGE
 * ElementType.TYPE:用于描述类，接口或enum声明
 * ElementType.FIELD:用于描述实例变量
 * ElementType.CONSTRUCTOR:用于构造方法
 * ElementType.METHOD:用于方法
 * ElementType.PARAMETER:用于方法参数上
 * ElementType.LOCAL_VARIABLE:
 * ElementType.ANNOTATION_TYPE
 * 
 * @author coffee
 *
 */
@Target(ElementType.METHOD)//只能用于方法上
public @interface TargetTest {
	String value();
}
