package com.ketech.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 包名: com.ketech.spring.aop <br/>
 * 类名: AopConfig <br/>
 * 版本: version 1.0 <br/>
 * 作者: WuGuoHua <br/>
 * 创建日期: 2017年10月13日 <br/>
 * 描述: AOP的配置类 <br/>.
 */

@Configuration
@ComponentScan("com.ketech.spring.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
