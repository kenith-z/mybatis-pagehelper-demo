package xyz.hcworld.mybatis.pagedemo.service;


import com.github.pagehelper.Page;
import com.sun.istack.internal.NotNull;
import xyz.hcworld.mybatis.pagedemo.entity.UserInfo;

import java.util.List;

/**
 * @ClassName: UserServer
 * @Author: 张红尘
 * @Date: 2021-07-29
 * @Version： 1.0
 */
public interface UserServer {
    /**
     *  查询用户
     * @return
     */
    Page<UserInfo> userList();

    /**
     *  分页查询用户
     * @return
     */
    Page<UserInfo> userList(Integer pageNum,Integer pageSize);

    /**
     * 新增用户
     */
    void addUser(List<UserInfo> list);

}
