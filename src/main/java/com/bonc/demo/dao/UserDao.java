package com.bonc.demo.dao;

import com.bonc.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author aoyuanbo
 * @since 2020-06-25 23:04:33
 */
@Repository
public interface UserDao {


    /**
     * 通过实体作为筛选条件查询
     *
     * @param user 实例对象
     * @return 对象列表
     */
    List<User> queryAll(User user);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    int insert(User user);


}