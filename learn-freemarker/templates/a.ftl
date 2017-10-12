if测试语句
------------------------------
当前用户为：${user}
<#if user == "Peter">
Nice
</#if>
------------------------------
Random数值为：${random}
<#if random gt 60>
及格
<#else>
不及格
</#if>
------------------------------
<#if random gte 90>
优秀
<#elseif random gte 80>
良好
<#else>
一般
</#if>
------------------------------
<#list lst as address>
国家：${address.country}，城市：${address.city}
</#list>
------------------------------
<#include "included.txt">
<#macro m1 a b c>
    ${a}--${b}--${c}
    <#nested>
</#macro>
<@m1 "peter" "lollipop" "eason">
    This is Test Nested
</@m1>