package com.ketech.learnfreemarker;

import com.ketech.bo.Address;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * 包名: com.ketech.learnfreemarker <br/>
 * 类名: PagesController <br/>
 * 版本: version 1.0 <br/>
 * 作者: WuGuoHua <br/>
 * 创建日期: 2017年10月10日 <br/>
 * 描述: 页面跳转控制 <br/>.
 */

@Controller
public class PagesController {

    @RequestMapping("/one")
    public String one() {
        return "page/one";
    }

    @RequestMapping("/two")
    public String two() {
        return "page/two";
    }

    @RequestMapping("/showAddress")
    public String showAddress(ModelMap modelMap) {
        List<Address> list = new ArrayList<>();
        list.add(new Address("中国","杭州"));
        list.add(new Address("中国","盐城"));
        list.add(new Address("美国","纽约"));
        modelMap.put("addList",list);
        return "page/addressPage";
    }

}
