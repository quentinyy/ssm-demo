package cn.me.service;

import cn.me.dao.UserMapper;
import cn.me.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    public List<User> findUsers(){
        return userMapper.selectByExample(null);
    }
}
