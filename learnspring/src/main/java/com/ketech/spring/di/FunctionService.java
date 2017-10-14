package com.ketech.spring.di;

import org.springframework.stereotype.Service;

/**
 * 包名: com.ketech.spring.di <br/>
 * 类名: FunctionService <br/>
 * 版本: version 1.0 <br/>
 * 作者: WuGuoHua <br/>
 * 创建日期: 2017年10月13日 <br/>
 * 描述: Spring依赖注入的学习类 <br/>.
 */

@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello " + word + "!";
    }
}
