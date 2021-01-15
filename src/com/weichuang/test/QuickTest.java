package com.weichuang.test;

import com.weichuang.dao.OrderMapper;
import com.weichuang.dao.UserMapper;
import com.weichuang.pojo.Order;
import com.weichuang.pojo.User;
import com.weichuang.util.SqlSessionUtil;
import com.weichuang.vo.QueryVo;
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
        User user = userMapper.getUserById(1);
        System.out.println(user);
    }

    @Test
    public void testFn2(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int rows = userMapper.deleteUserById(3);
        System.out.println(rows);
    }

    @Test
    public void testFn3(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        Order order = orderMapper.getOrderById(1);
        System.out.println(order);
    }

    @Test
    public void testFn4(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int count = userMapper.getUserTotal();
        System.out.println(count);
    }

    @Test
    public void testFn5(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        Order order = new Order();
        order.setOno("dsgdhsghds111111");
        order.setCreateTime("2020-01-15");
        int rows = orderMapper.insertOrder(order);
        System.out.println(rows);
    }

    /**
     * 需求：根据用户名模糊查询用户信息，查询条件放到QueryVo的user属性中。
     */
    @Test
    public void testFn6(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setName("六");
        QueryVo vo = new QueryVo();
        vo.setUser(user);
        List<User> userList = userMapper.getUsersByQueryVo(vo);
        System.out.println(userList);
    }

    /**
     * 需求：查询订单表order的所有数据
     */
    @Test
    public void testFn7(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orderList = orderMapper.getAllOrders();
        System.out.println(orderList);
    }
}
