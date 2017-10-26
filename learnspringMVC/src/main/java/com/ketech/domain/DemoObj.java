package com.ketech.domain;

/**
 * 包名: com.ketech.domain <br/>
 * 类名: DemoObj <br/>
 * 版本: version 1.0 <br/>
 * 作者: 武国华 <br/>
 * @author: WuGuoHua <br/>
 * 创建日期: 2017年10月26日 <br/>
 * 描述: Demo测试类 <br/>.
 */

public class DemoObj {

    private Long id;
    private String name;

    public DemoObj() {
        super();
    }

    public DemoObj(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
