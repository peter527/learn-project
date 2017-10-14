package com.ketech.spring.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 包名: com.ketech.spring.javaconfig <br/>
 * 类名: App <br/>
 * 版本: version 1.0 <br/>
 * 作者: WuGuoHua <br/>
 * 创建日期: 2017年10月13日 <br/>
 * 描述: Java配置方式主入口 <br/>.
 */

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("Peter"));
    }

}
