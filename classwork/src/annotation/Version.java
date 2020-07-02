package annotation;


import java.lang.annotation.ElementType;

import java.lang.annotation.Target;


@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Version {
 String description() default "Дефолтное описание";
 String value() default "1. 0. 0";

}
