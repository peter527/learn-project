package com.ketech.vo;

import com.ketech.po.SysUser;

import java.util.List;

/**
 * 包名: com.ketech.vo <br/>
 * 类名: UserRolesVO <br/>
 * 版本: version 1.0 <br/>
 * 作者: WuGuoHua <br/>
 * 创建日期: 2017年09月20日 <br/>
 * 描述: 角色权限实体类 <br/>.
 */

public class UserRolesVO extends SysUser {

    private List<RolePrivilegeVO> roles;

    public List<RolePrivilegeVO> getRoles() {
        return roles;
    }

    public void setRoles(List<RolePrivilegeVO> roles) {
        this.roles = roles;
    }
}
