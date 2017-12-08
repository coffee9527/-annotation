package com.coffee.override;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * jdk内建注解之override
 * java.lang.Override是个Marker annotation
	用于标示的Annotation,Annotation名称本身即表示了要给工具程序的信息  
	
	override保证了方法覆写的成功性,避免覆写出错的可能
 * @author coffee
 *
 */
public class OverrideTest extends ParentClass {
	/**
	 * @Target(ElementType.METHOD)//只能用于方法上
		@Retention(RetentionPolicy.SOURCE)//只存在于源码中
		public @interface Override {//没有属性
		}
	 */
	@Override
	void doSomething() {
		System.out.println("aaa");
		
	}
	
}

abstract class ParentClass {
	abstract void doSomething();
}
