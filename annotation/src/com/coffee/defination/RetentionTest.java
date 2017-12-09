package com.coffee.defination;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/**
 * @Retention定义该注解的生命周期。
 * RetentionPolicy.SOURCE-在编译阶段丢弃。这些注解在编译结束后就不再有任何意义，所以
 * 他们不会写入字节码。@Override,@SupperssWarnings都是属于这类注解
 * 
 * RetentionPolicy.CLADD-在类加载的时候丢弃，在字节码文件的处理中有用。注解默认使用这种方式
 * 
 * RetentionPolicy.RUNTIME-始终不会丢弃，运行期也保留该注解，可由vm读入，因此可以使用反射机制读取该注解
 * 的信息。我们自定义的注解通常使用这种方式。
 * 搭配反射（Reflection）机制，就可以达到这个目的
 * java.lang.reflect.AnnotatedElement接口
 * public Annotation getAnnotation(Class annotationType);
 * public Annotation[] getAnnotation();
 * public Annotation[] getDeclaredAnnotation();
 * public boolean isAnnotationPresent(Class annotationType);
 * AnnotatedElement,Constructor,Field,Method,Package等类别，都实现了AnnotatedElement接口
 *  定义Annotation时必须定义RetentionPolicy为RUNTIME,,也就是可以在VM中读取Annotation信息  参见程序
 * @author coffee
 *
 */
@Retention(RetentionPolicy.RUNTIME)//
public @interface RetentionTest {

}
