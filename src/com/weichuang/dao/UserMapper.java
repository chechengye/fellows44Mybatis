package com.weichuang.dao;

import com.weichuang.pojo.User;
import com.weichuang.vo.QueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<User> getAllUser();

    User getUserById(int id);

    int deleteUserById(int id);

    int getUserTotal();

    List<User> getUsersByQueryVo(QueryVo vo);

    //向mapper.xml文件中传递多个参数时，要使用@Param告诉配置文件名称.
    List<User> getUsersByNameAndSex(@Param("name") String name11, @Param("sex") Integer sex22);

    List<User> getUsersByIds(List<Integer> ids);

    List<User> getUsersByArr(Integer[] arr);

    //List<User> getUsersByNameAndSex(User user);
}
