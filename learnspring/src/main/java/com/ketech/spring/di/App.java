package com.ketech.spring.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 包名: com.ketech.spring.di <br/>
 * 类名: App <br/>
 * 版本: version 1.0 <br/>
 * 作者: WuGuoHua <br/>
 * 创建日期: 2017年10月13日 <br/>
 * 描述: Spring依赖注入主程序入口 <br/>.
 */

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("Peter"));
        context.close();
    }
}
