package com.ketech.learnwebsocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * 包名: com.ketech.learnwebsocket <br/>
 * 类名: BaiDuWebSocket <br/>
 * 版本: version 1.0 <br/>
 * 作者: 武国华 <br/>
 * @author: WuGuoHua <br/>
 * 创建日期: 2017年10月23日 <br/>
 * 描述: 百度的WebSocket类 <br/>.
 */

/*@ServerEndpoint("ws://femtocellsms.sjws.baidu.com/openfemtocellsms")*/
@Component
public class BaiDuWebSocket {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    private static int onlineCount = 0;
    private static CopyOnWriteArraySet<BaiDuWebSocket> webSocketSet = new CopyOnWriteArraySet<>();
    private Session session;

    @OnOpen
    public void onOpen(Session session) throws IOException{
        this.session = session;
        webSocketSet.add(this);
        incrOnlineCount();
        for(BaiDuWebSocket item : webSocketSet){
            if(!item.equals(this)) { //send to others only.
                item.sendMessage("someone just joined in.");
            }
        }
        logger.info("new connection...current online count: {}", getOnlineCount());
        System.out.println("onOpen");
    }

    @OnClose
    public void onClose() throws IOException {
        webSocketSet.remove(this);
        decOnlineCount();
        for(BaiDuWebSocket item : webSocketSet){
            item.sendMessage("someone just closed a connection.");
        }
        logger.info("one connection closed...current online count: {}", getOnlineCount());
        System.out.println("onClose");
    }

    @OnMessage
    public void onMessage(String message, Session session) throws IOException {
        logger.info("message received: {}", message);
        // broadcast received message
        for(BaiDuWebSocket item : webSocketSet){
            item.sendMessage(message);
        }
        System.out.println("onMessage");
    }

    public void sendMessage(String message) throws IOException {
        this.session.getBasicRemote().sendText(message);
    }

    public static synchronized int getOnlineCount(){
        return BaiDuWebSocket.onlineCount;
    }

    public static synchronized void incrOnlineCount(){
        BaiDuWebSocket.onlineCount++;
    }

    public static synchronized void decOnlineCount(){
        BaiDuWebSocket.onlineCount--;
    }
}
