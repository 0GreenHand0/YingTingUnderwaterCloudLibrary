package com.yupi.tangpicture.infrastructure.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //只对方法生效
@Retention(RetentionPolicy.RUNTIME) //只在运行时生效
public @interface AuthCheck {
    /**
     * 必须具有某个角色
     */
    String mustRole() default "";//例子：@AuthCheck(mustRole = "admin"),则只有admin角色的用户可以使用下面的方法
}
