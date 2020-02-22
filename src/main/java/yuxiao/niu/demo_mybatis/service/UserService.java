package yuxiao.niu.demo_mybatis.service;

import yuxiao.niu.demo_mybatis.entity.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> listUser(Map<String, Object> params);

    User getUser(int id);

    void addUser(User user);

    void deleteUser(int id);

    void updateUser(User user);
}