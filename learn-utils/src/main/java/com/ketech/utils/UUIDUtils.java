package com.ketech.utils;

import java.util.UUID;

/**
 * 包名: com.ketech.utils <br/>
 * 类名: UUIDUtils <br/>
 * 版本: version 1.0 <br/>
 * 作者: WuGuoHua <br/>
 * 创建日期: 2017年09月15日 <br/>
 * 描述: UUID工具类 <br/>.
 */

public class UUIDUtils {

    /**
     * 生成UUID
     * @return 返回UUID
     */
    public static String generateUUID(){
        return UUID.randomUUID().toString();
    }

    /**
     * 生成不带-的UUID
     * @return 返回不带-的UUID
     */
    public static String generateUUIDWithoutHyphen(){
        return UUID.randomUUID().toString().replace("-","");
    }

    /**
     *  生成是否带有"-"的UUID，改方法是上述两种方法的合并
     * @param withoutHyphen 返回的UUID是不是不带"-"符号，true不带，false带
     * @return 返回UUID
     */
    public static String generateUUID(boolean withoutHyphen){
        if (withoutHyphen == true){
            return UUID.randomUUID().toString().replace("-","");
        } else {
            return UUID.randomUUID().toString();
        }
    }

    /**
     * 生成是否带有"-"的UUID的数组
     * @param number 生成的数量
     * @param withoutHyphen 返回的UUID是不是不带"-"符号，true不带，false带
     * @return 返回UUID数组
     */
    public static String[] generateUUIDs(int number, boolean withoutHyphen){
        if (number < 1){
            return null;
        }
        String[] uuids = new String[number];
        for (int i = 0; i < number; i++){
            uuids[i] = generateUUID(withoutHyphen);
        }
        return uuids;
    }


}
