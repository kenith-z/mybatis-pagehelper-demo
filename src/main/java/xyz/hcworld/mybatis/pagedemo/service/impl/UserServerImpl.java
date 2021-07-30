package xyz.hcworld.mybatis.pagedemo.service.impl;

import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.hcworld.mybatis.pagedemo.entity.UserInfo;
import xyz.hcworld.mybatis.pagedemo.mapper.UserMapper;
import xyz.hcworld.mybatis.pagedemo.service.UserServer;

import java.util.List;

/**
 * @ClassName: UserServerImpl
 * @Author: 张红尘
 * @Date: 2021-07-29
 * @Version： 1.0
 */
@Service
public class UserServerImpl  implements UserServer {
    @Autowired
    UserMapper userMapper;

    @Override
    public Page<UserInfo> userList() {
        return userMapper.findAllUser();
    }

    @Override
    public Page<UserInfo> userList(Integer pageNum, Integer pageSize) {
        return userMapper.findAllUser(pageNum,pageSize);
    }



    @Override
    public void addUser(List<UserInfo> list) {
        userMapper.addUserInfo(list);
    }
}
