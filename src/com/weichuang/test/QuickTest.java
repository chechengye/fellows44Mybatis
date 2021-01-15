package com.weichuang.test;

import com.weichuang.dao.UserMapper;
import com.weichuang.pojo.User;
import com.weichuang.util.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class QuickTest {

    @Test
    public void testFn() throws IOException {
        //1、获取主配置文件的位置
        String res = "sqlMapConfig.xml";
        //2、根据主配置文件获取输入流
        InputStream stream = Resources.getResourceAsStream(res);
        //3、根据流对象获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
        //4、根据会话工厂生产一个sqlSession会话
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //5、根据sql会话，获取Mappered Satatement，进而操作SQL
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getAllUser();

        System.out.println(userList);
    }

    @Test
    public void testFn1(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(2);
        System.out.println(user);
    }
}
