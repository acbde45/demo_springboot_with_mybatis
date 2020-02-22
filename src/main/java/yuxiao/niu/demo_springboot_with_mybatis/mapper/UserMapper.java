package yuxiao.niu.demo_springboot_with_mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import yuxiao.niu.demo_springboot_with_mybatis.entity.User;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface UserMapper {
    List<User> listUser(Map<String, Object> params);

    User getUser(User user);

    void addUser(User user);

    void deleteUser(User user);

    void updateUser(User user);
}