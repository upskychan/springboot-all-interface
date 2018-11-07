package com.upsky.springboot.service;

import com.upsky.springboot.model.User;

import java.util.List;
import java.util.Map;

public interface IUserService {
    /**
     * 分页查询用户。
     * @param paramMap 参数
     * @return 用户列表
     */
    List<User> listUsersByPage(Map<String,Object> paramMap);

    /**
     * 获取总用户数。
     * @return 总用户数
     */
    int getTotalUser();

    /**
     * 通过ID查询用户。
     * @param userId
     * @return
     */
    User getUserById(Integer userId);

    /**
     * 添加用户
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 修改用户
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteUser(Integer id);
}
