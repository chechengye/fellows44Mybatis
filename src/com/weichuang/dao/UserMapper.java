package com.weichuang.dao;

import com.weichuang.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> getAllUser();

    User getUserById(int id);
}
