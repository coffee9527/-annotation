package com.coffee.deprecated;

import java.util.Date;

/**
 * Deprecated注解的定义
 * @Documented
	@Retention(RetentionPolicy.RUNTIME)
	@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
	public @interface Deprecated {
	}
	
	该注解主要用于表示方法过时，不建议再使用
 * @author coffee
 *
 */
public class DeprecatedTest {
	@Deprecated
	public Date getDate() {
		return new Date();
	}
}
