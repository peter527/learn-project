package com.ketech.spring.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 包名: com.ketech.spring.prepost <br/>
 * 类名: PrePostConfig <br/>
 * 版本: version 1.0 <br/>
 * 作者: WuGuoHua <br/>
 * 创建日期: 2017年10月13日 <br/>
 * 描述: PrePost配置类 <br/>.
 */

@Configuration
@ComponentScan("com.ketech.spring.prepost")
public class PrePostConfig {

    @Bean(initMethod="init",destroyMethod="destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

}
