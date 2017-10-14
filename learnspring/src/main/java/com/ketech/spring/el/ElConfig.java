package com.ketech.spring.el;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 包名: com.ketech.spring.el <br/>
 * 类名: ElConfig <br/>
 * 版本: version 1.0 <br/>
 * 作者: WuGuoHua <br/>
 * 创建日期: 2017年10月13日 <br/>
 * 描述: SpringEL配置类 <br/>.
 */

@Configuration
@ComponentScan("com.ketech.spring.el")
@PropertySource("classpath:com/ketech/spring/el/test.properties")
public class ElConfig {

    @Autowired
    DemoService demoService;

    @Value("I Love You!")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{demoService.another}")
    private String fromAnother;

    @Value("${book.author}")
    private String bookName;

    public void outputResource(){
        System.out.println(normal);
        System.out.println(osName);
        System.out.println(fromAnother);
        System.out.println(bookName);
    }

}
