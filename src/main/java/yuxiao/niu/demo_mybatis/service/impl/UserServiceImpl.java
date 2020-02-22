package yuxiao.niu.demo_mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yuxiao.niu.demo_mybatis.entity.User;
import yuxiao.niu.demo_mybatis.mapper.UserMapper;
import yuxiao.niu.demo_mybatis.service.UserService;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listUser(Map<String, Object> params) {
        return userMapper.listUser(params);
    }

    @Override
    public User getUser(int id) {
        User user = new User();
        user.setId(id);
        return userMapper.getUser(user);
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public void deleteUser(int id) {
        User user = new User();
        user.setId(id);
        userMapper.deleteUser(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }
}
