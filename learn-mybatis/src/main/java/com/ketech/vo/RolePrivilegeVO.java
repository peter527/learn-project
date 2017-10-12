package com.ketech.vo;

import com.ketech.po.SysPrivilege;
import com.ketech.po.SysRole;

import java.util.List;

/**
 * 包名: com.ketech.vo <br/>
 * 类名: RolePrivilegeVO <br/>
 * 版本: version 1.0 <br/>
 * 作者: WuGuoHua <br/>
 * 创建日期: 2017年09月20日 <br/>
 * 描述: 角色权限实体类 <br/>.
 */

public class RolePrivilegeVO extends SysRole {

    private List<SysPrivilege> privileges;

    public List<SysPrivilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<SysPrivilege> privileges) {
        this.privileges = privileges;
    }
}
