package com.ketech.spring.aop;

import org.springframework.stereotype.Service;

/**
 * 包名: com.ketech.spring.aop <br/>
 * 类名: DemoAnnotationService <br/>
 * 版本: version 1.0 <br/>
 * 作者: WuGuoHua <br/>
 * 创建日期: 2017年10月13日 <br/>
 * 描述: AOP注解方式 <br/>.
 */

@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add操作")
    public void add(){}

}
