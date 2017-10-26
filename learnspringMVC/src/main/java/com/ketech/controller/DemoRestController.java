package com.ketech.controller;

/**
 * 包名: com.ketech.controller <br/>
 * 类名: RestController <br/>
 * 版本: version 1.0 <br/>
 * 作者: 武国华 <br/>
 * @author: WuGuoHua <br/>
 * 创建日期: 2017年10月26日 <br/>
 * 描述: RestController <br/>.
 */

import com.ketech.domain.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class DemoRestController {

    @RequestMapping(value = "/getjson", produces = "application/json;charset=UTF-8")
    public DemoObj getjson(DemoObj obj){
        return new DemoObj(obj.getId() + 1, obj.getName() + "yy");
    }

    @RequestMapping(value = "/getxml", produces = "application/xml;charset=UTF-8")
    public DemoObj getxml(DemoObj obj){
        return new DemoObj(obj.getId() + 1, obj.getName() + "yy");
    }

}
