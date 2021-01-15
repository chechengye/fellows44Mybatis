package com.weichuang.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {


    public static SqlSession getSqlSession(){
        SqlSession sqlSession = null;
        try {
            //1、获取主配置文件的位置
            String res = "sqlMapConfig.xml";
            //2、根据主配置文件获取输入流
            InputStream stream = null;
            stream = Resources.getResourceAsStream(res);
            //3、根据流对象获取SqlSessionFactory
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
            //4、根据会话工厂生产一个sqlSession会话
            sqlSession = sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSession;
    }
}
