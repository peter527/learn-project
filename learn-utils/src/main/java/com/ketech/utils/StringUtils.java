package com.ketech.utils;

/**
 * 包名: com.ketech.utils <br/>
 * 类名: StringUtils <br/>
 * 版本: version 1.0 <br/>
 * 作者: WuGuoHua <br/>
 * 创建日期: 2017年09月15日 <br/>
 * 描述: 字符串类型工具类 <br/>.
 */

public class StringUtils {

    /**
     * 判断字符串是否为空或者为空字符串
     * @param targetString 待检测的字符串
     * @return true，false
     */
    public static boolean isNullOrEmpty(String targetString){
        return (null == targetString) || targetString.equals("");
    }

    /**
     * 判断字符串是否不为空或者为空字符串
     * @param targetString 待检测的字符串
     * @return true，false
     */
    public static boolean isNotNullNorEmpty(String targetString){
        return (null != targetString) && !targetString.equals("");
    }

}
