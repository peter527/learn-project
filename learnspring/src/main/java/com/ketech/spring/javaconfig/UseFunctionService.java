package com.ketech.spring.javaconfig;

/**
 * 包名: com.ketech.spring.javaconfig <br/>
 * 类名: UseFunctionService <br/>
 * 版本: version 1.0 <br/>
 * 作者: WuGuoHua <br/>
 * 创建日期: 2017年10月13日 <br/>
 * 描述: Java配置方式测试类 <br/>.
 */

public class UseFunctionService {

    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word){
        return functionService.sayHello(word);
    }

}
