package com.ketech.spring.profile;

/**
 * 包名: com.ketech.spring.profile <br/>
 * 类名: DemoBean <br/>
 * 版本: version 1.0 <br/>
 * 作者: WuGuoHua <br/>
 * 创建日期: 2017年10月13日 <br/>
 * 描述: Profile测试类 <br/>.
 */

public class DemoBean {

    private String content;

    public DemoBean(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
