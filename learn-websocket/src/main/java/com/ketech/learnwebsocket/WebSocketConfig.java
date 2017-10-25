package com.ketech.learnwebsocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * 包名: com.ketech.learnwebsocket <br/>
 * 类名: WebSocketConfig <br/>
 * 版本: version 1.0 <br/>
 * 作者: 武国华 <br/>
 * @author: WuGuoHua <br/>
 * 创建日期: 2017年10月23日 <br/>
 * 描述: WebSocket配置类 <br/>.
 */

@Configuration
public class WebSocketConfig{

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

}
