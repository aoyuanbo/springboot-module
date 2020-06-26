package com.bonc.demo.service;

import com.bonc.demo.entity.User;
import com.bonc.demo.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author aoyuanbo
 * @since 2020-06-25 23:04:33
 */
@Service("userService")
public class UserService{
    @Resource
    private UserDao userDao;

    

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    public User insert(User user) {
        this.userDao.insert(user);
        return user;
    }


    public List<User> queryAll() {
        return userDao.queryAll(new User());
    }

}