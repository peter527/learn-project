package com.ketech.vo;

import com.ketech.po.SysRole;
import com.ketech.po.SysUser;

/**
 * 包名: com.ketech.vo <br/>
 * 类名: UserRoleVO <br/>
 * 版本: version 1.0 <br/>
 * 作者: WuGuoHua <br/>
 * 创建日期: 2017年09月20日 <br/>
 * 描述: 带权限的用户实体类 <br/>.
 */

public class UserRoleVO extends SysUser {

    private SysRole role;

    private Long roleId;

    public SysRole getRole() {
        return role;
    }

    public void setRole(SysRole role) {
        this.role = role;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
