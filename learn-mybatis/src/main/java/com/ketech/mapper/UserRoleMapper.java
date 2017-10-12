package com.ketech.mapper;

import com.ketech.vo.UserRoleVO;
import com.ketech.vo.UserRolesVO;

import java.util.List;

/**
 * 作者: WuGuoHua <br/>
 * 创建日期: 2017年09月20日 <br/>.
 */
public interface UserRoleMapper {

    UserRoleVO selectUserAndRoleById(Long id);

    UserRoleVO selectUserAndRoleById2(Long id);

    UserRoleVO selectUserAndRoleById3(Long id);

    List<UserRolesVO> selectUserAndRoleById4(Long id);

    List<UserRolesVO> selectUserAndRoleAll();

    List<UserRolesVO> selectURPAll();

    List<UserRolesVO> selectAllInfoLazy();

}
