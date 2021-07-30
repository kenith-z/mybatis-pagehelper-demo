package xyz.hcworld.mybatis.pagedemo.entity;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName: UserInfo
 * @Author: 张红尘
 * @Date: 2021-07-29
 * @Version： 1.0
 */
@Data
public class UserInfo {


    /**
     * 用户编号
     */
    private int userId;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 省份
     */
    private String province;
    /**
     * 注册时间
     */
    private Date createTime;

}
