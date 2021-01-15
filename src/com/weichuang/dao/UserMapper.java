package com.weichuang.dao;

import com.weichuang.pojo.User;
import com.weichuang.vo.QueryVo;

import java.util.List;

public interface UserMapper {

    List<User> getAllUser();

    User getUserById(int id);

    int deleteUserById(int id);

    int getUserTotal();

    List<User> getUsersByQueryVo(QueryVo vo);
}
