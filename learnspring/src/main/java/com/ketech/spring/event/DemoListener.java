package com.ketech.spring.event;

import org.springframework.context.ApplicationListener;

/**
 * 包名: com.ketech.spring.event <br/>
 * 类名: DemoListener <br/>
 * 版本: version 1.0 <br/>
 * 作者: WuGuoHua <br/>
 * 创建日期: 2017年10月13日 <br/>
 * 描述: 自定义监听器 <br/>.
 */

public class DemoListener implements ApplicationListener<DemoEvent> {

    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();
        System.out.println(msg);
    }
}
