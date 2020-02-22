package yuxiao.niu.demo_springboot_with_mybatis.service;

import org.springframework.stereotype.Service;
import yuxiao.niu.demo_springboot_with_mybatis.entity.User;

import java.util.List;
import java.util.Map;

@Service
public interface UserService {
    List<User> listUser(Map<String, Object> params);

    User getUser(int id);

    void addUser(User user);

    void deleteUser(int id);

    void updateUser(User user);
}