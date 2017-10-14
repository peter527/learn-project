package com.ketech.spring.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 包名: com.ketech.spring.el <br/>
 * 类名: DemoService <br/>
 * 版本: version 1.0 <br/>
 * 作者: WuGuoHua <br/>
 * 创建日期: 2017年10月13日 <br/>
 * 描述: SpringEL测试类 <br/>.
 */

@Service
public class DemoService {

    @Value("其它属性类型")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
