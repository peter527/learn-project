package com.ketech.spring.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 包名: com.ketech.spring.scope <br/>
 * 类名: DemoPrototypeService <br/>
 * 版本: version 1.0 <br/>
 * 作者: WuGuoHua <br/>
 * 创建日期: 2017年10月13日 <br/>
 * 描述: Scope的Prototype测试 <br/>.
 */

@Service
@Scope("prototype")
public class DemoPrototypeService {
}
