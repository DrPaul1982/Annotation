package app;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)

@interface MethodInfo {
    String methodName() default "Method name";
    String methodType() default "Method type";
    String methodDescription() default "Method description";
}

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String firstName() default "First name";
    String secondName() default "Second name";
}