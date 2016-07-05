package com.ice.wangwang.dao;

import com.ice.wangwang.bean.User;
import com.ice.wangwang.bean.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_user
     * @author MyBatis Generator
     */
    int countByExample(UserExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_user
     * @author MyBatis Generator
     */
    int deleteByExample(UserExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_user
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_user
     * @author MyBatis Generator
     */
    int insert(User record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_user
     * @author MyBatis Generator
     */
    int insertSelective(User record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_user
     * @author MyBatis Generator
     */
    List<User> selectByExample(UserExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_user
     * @author MyBatis Generator
     */
    User selectByPrimaryKey(Integer id);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_user
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_user
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_user
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_user
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(User record);
}