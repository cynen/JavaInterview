package com.myth.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestMapping {
	/**
     * 表示访问该方法的url
     * 该注解可以添加在类上,也可以添加在方法上.
     * 注解扫描的时候,是先扫描类上的注解,后续再扫描方法上的注解,并存入到一个Map集合.
     * 通过Dispatcher转发的请求,会去handler容器中进行匹配,匹配成功就会返回需要被调用的类下面的具体的方法.
     * 
     * @return
     */
    String value() default "";

}
