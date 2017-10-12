package com.ketech.test;

import org.junit.Test;

/**
 * 包名: com.ketech.test <br/>
 * 类名: StringUtilsTest <br/>
 * 版本: version 1.0 <br/>
 * 作者: WuGuoHua <br/>
 * 创建日期: 2017年09月15日 <br/>
 * 描述: 字符换工具测试类 <br/>.
 */

public class StringUtilsTest {

    @Test
    public void testString(){
        /*String target = null;
        System.out.println(StringUtils.isNotNullNorEmpty(target));
        System.out.println(StringUtils.isNullOrEmpty(target));*/
        String receiveAddressCode = "310012浙江省杭州市";
        int index = receiveAddressCode.indexOf("-");
        System.out.println(receiveAddressCode.substring(0,index));
        System.out.println(receiveAddressCode.substring(index + 1));
    }


}
