package xyz.hcworld.mybatis.pagedemo.mapper;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import xyz.hcworld.mybatis.pagedemo.entity.UserInfo;

import java.util.List;

/**
 * @ClassName: UserMapper
 * @Author: 张红尘
 * @Date: 2021-07-29
 * @Version： 1.0
 */
@Component
public interface UserMapper {


    /**
     * 查询全部用户（可手动设置按分页）
     * @return
     */
    Page<UserInfo> findAllUser();

    /**
     * 分页获取用户，第三种方法
     * @param pageNum
     * @param pageSize
     * @return
     */
    Page<UserInfo> findAllUser(@Param("pageNum") Integer pageNum,
                               @Param("pageSize") Integer pageSize);



    /**
     * 新增
     * @param userInfos
     */
    void addUserInfo(List<UserInfo> userInfos);

}
