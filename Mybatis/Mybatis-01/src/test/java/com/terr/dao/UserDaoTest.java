package com.terr.dao;

import com.terr.pojo.User;
import com.terr.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        //第一步,获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //方式一:getMapper
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }
        //关闭sqlSession
        sqlSession.close();
    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = userDao.getUserById(1);

        System.out.println(user);
        sqlSession.close();
    }
}
