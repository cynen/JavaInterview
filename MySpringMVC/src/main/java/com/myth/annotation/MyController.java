package com.myth.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyController {
	/**
     * 给Controller添加注解,系统加载的时候,就可以加载到该注解注释的类.
     * 
     */
    String value() default "";

}
