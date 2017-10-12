package com.ketech.test;

import com.ketech.mapper.UserRoleMapper;
import com.ketech.vo.UserRoleVO;
import com.ketech.vo.UserRolesVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.Reader;
import java.util.List;

/**
 * 包名: com.ketech.test <br/>
 * 类名: MybatisTest <br/>
 * 版本: version 1.0 <br/>
 * 作者: WuGuoHua <br/>
 * 创建日期: 2017年09月15日 <br/>
 * 描述: Mybatis工程测试类 <br/>.
 */

public class MybatisTest {

    private static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void init(){
        try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            reader.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }


    @Test
    public void testSelectUserRoleByUserId(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserRoleMapper userRoleMapper = sqlSession.getMapper(UserRoleMapper.class);
            UserRoleVO userRole = userRoleMapper.selectUserAndRoleById(1001L);
            System.out.println(userRole.getRole().getRoleName());
        } finally {
            sqlSession.close();
        }

    }

    @Test
    public void testSelectUserRoleByUserId2(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserRoleMapper userRoleMapper = sqlSession.getMapper(UserRoleMapper.class);
            UserRoleVO userRole = userRoleMapper.selectUserAndRoleById2(1001L);
            System.out.println(userRole.getRole().getRoleName());
        } finally {
            sqlSession.close();
        }

    }

    @Test
    public void testSelectUserRoleByUserId3(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserRoleMapper userRoleMapper = sqlSession.getMapper(UserRoleMapper.class);
            UserRoleVO userRole = userRoleMapper.selectUserAndRoleById3(1001L);
            System.out.println(userRole.getUserName());
            System.out.println("*************************");
            System.out.println(userRole.getRole().getRoleName());
        } finally {
            sqlSession.close();
        }

    }

    @Test
    public void testSelectUserRoleByUserId4(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserRoleMapper userRoleMapper = sqlSession.getMapper(UserRoleMapper.class);
            List<UserRolesVO> userRoles = userRoleMapper.selectUserAndRoleById4(1L);
            System.out.println(userRoles.size());
        } finally {
            sqlSession.close();
        }

    }

    @Test
    public void selectUserAndRoleAll(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserRoleMapper userRoleMapper = sqlSession.getMapper(UserRoleMapper.class);
            List<UserRolesVO> userRoles = userRoleMapper.selectUserAndRoleAll();
            System.out.println(userRoles.size());
        } finally {
            sqlSession.close();
        }

    }

    @Test
    public void selectURPAll(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserRoleMapper userRoleMapper = sqlSession.getMapper(UserRoleMapper.class);
            List<UserRolesVO> userRoles = userRoleMapper.selectURPAll();
            System.out.println(userRoles.size());
        } finally {
            sqlSession.close();
        }

    }

    @Test
    public void selectAllInfoLazy(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserRoleMapper userRoleMapper = sqlSession.getMapper(UserRoleMapper.class);
            List<UserRolesVO> userRoles = userRoleMapper.selectAllInfoLazy();
            System.out.println(userRoles.size());
        } finally {
            sqlSession.close();
        }

    }

}
