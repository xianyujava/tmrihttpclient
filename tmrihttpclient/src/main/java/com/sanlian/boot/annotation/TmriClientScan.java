package com.sanlian.boot.annotation;/**
 * Created by Soft001 on 2020/9/23.
 */

import java.lang.annotation.*;

/**
 * @ClassName TmriClientScan
 * @Description: TODO
 * @Author Soft001
 * @Date 2020/9/23
 * @Version V1.0
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TmriClientScan {

    String functionId() default "";

    //方法参数字段（顺序与方法参数顺序一致；字段类型为string）
    String[] paramNameInfo() default {};
}
