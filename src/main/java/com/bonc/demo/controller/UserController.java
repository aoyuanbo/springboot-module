package com.bonc.demo.controller;

import com.bonc.demo.entity.User;
import com.bonc.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author aoyuanbo
 * @since 2020-06-25 23:11:22
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public List<User> queryAll() {
        return this.userService.queryAll();
    }

}