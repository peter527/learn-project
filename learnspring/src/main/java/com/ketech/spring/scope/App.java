package com.ketech.spring.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 包名: com.ketech.spring.scope <br/>
 * 类名: App <br/>
 * 版本: version 1.0 <br/>
 * 作者: WuGuoHua <br/>
 * 创建日期: 2017年10月13日 <br/>
 * 描述: Scope主程序入口 <br/>.
 */

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);
        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);
        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("p1 equals p2: " + p1.equals(p2));
    }

}
