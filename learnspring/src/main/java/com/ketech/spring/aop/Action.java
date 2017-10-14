package com.ketech.spring.aop;

import java.lang.annotation.*;

/**
 * 作者: WuGuoHua <br/>
 * 创建日期: 2017年10月13日 <br/>.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
