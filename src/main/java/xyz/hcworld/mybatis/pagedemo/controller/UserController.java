package xyz.hcworld.mybatis.pagedemo.controller;

import com.github.pagehelper.PageHelper;
import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.hcworld.mybatis.pagedemo.entity.UserInfo;
import xyz.hcworld.mybatis.pagedemo.lang.Result;
import xyz.hcworld.mybatis.pagedemo.service.UserServer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: UserController
 * @Author: 张红尘
 * @Date: 2021-07-29
 * @Version： 1.0
 */
@RestController
public class UserController {
    @Autowired
    UserServer userServer;

    /**
     * 第一种分页方式
     * @param pageNum 页数
     * @param pageSize 每页多少条
     * @return
     */
    @GetMapping("/userinfo1")
    public Result userInfoList1(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "10") Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        return Result.success(userServer.userList());
    }

    /**
     * 第二种分页方式
     * @param pageNum 从第几条数据开始
     * @param pageSize 获取多少条多少条
     * @return
     */
    @GetMapping("/userinfo2")
    public Result userInfoList2(@RequestParam(defaultValue = "1") Integer pageNum,@RequestParam(defaultValue = "10") Integer pageSize){
        PageHelper.offsetPage(pageNum,pageSize);
        return Result.success(userServer.userList());
    }

    /**
     * 第三种分页方式
     * @param pageNum 页数
     * @param pageSize 每页多少条
     * @return
     */
    @GetMapping("/userinfo3")
    public Result userInfoList3(@RequestParam(defaultValue = "1") Integer pageNum,@RequestParam(defaultValue = "10") Integer pageSize){
        /**
         * 在mapper中加入@Param("pageNum") int pageNum,@Param("pageSize") int pageSize设置要获取的页码和每页数据数
         *
         */
        return Result.success(userServer.userList(pageNum,pageSize));
    }


    @GetMapping("/addUserinfo")
    public void addUserInfoList(){
        List<UserInfo> list = new ArrayList<>(101);
        for (int i =  0;i<100;i++){
            UserInfo userInfo = new UserInfo();
            userInfo.setUserName("张三第"+i+"号");
            userInfo.setProvince("广州xxxx第"+i+"号");
            userInfo.setCreateTime(new Date());
            list.add(userInfo);
        }
        userServer.addUser(list);
    }




}
