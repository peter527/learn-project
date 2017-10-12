package com.ketech.test;

import com.ketech.utils.UUIDUtils;
import org.junit.Test;

/**
 * 包名: com.ketech.test <br/>
 * 类名: UUIDUtilsTest <br/>
 * 版本: version 1.0 <br/>
 * 作者: WuGuoHua <br/>
 * 创建日期: 2017年09月15日 <br/>
 * 描述: UUID工具类测试 <br/>.
 */

public class UUIDUtilsTest {

    @Test
    public void testGenerateUUID(){
        System.out.println(UUIDUtils.generateUUID(true));
        System.out.println(UUIDUtils.generateUUID(false));
        String[] uuids = UUIDUtils.generateUUIDs(10,true);
        for (String uuid : uuids){
            System.out.println(uuid);
        }
        String[] uuids2 = UUIDUtils.generateUUIDs(10,false);
        for (String uuid : uuids2){
            System.out.println(uuid);
        }
    }

}
