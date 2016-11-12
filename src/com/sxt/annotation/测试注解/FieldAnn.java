package com.sxt.annotation.²âÊÔ×¢½â;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.FIELD})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface FieldAnn {
	
	String fieldname() default "name1";

}
