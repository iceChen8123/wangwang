package com.ice.wangwang.dao;

import com.ice.wangwang.bean.EmployerInfo;
import com.ice.wangwang.bean.EmployerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployerInfoMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_employer_info
     * @author MyBatis Generator
     */
    int countByExample(EmployerInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_employer_info
     * @author MyBatis Generator
     */
    int deleteByExample(EmployerInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_employer_info
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_employer_info
     * @author MyBatis Generator
     */
    int insert(EmployerInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_employer_info
     * @author MyBatis Generator
     */
    int insertSelective(EmployerInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_employer_info
     * @author MyBatis Generator
     */
    List<EmployerInfo> selectByExample(EmployerInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_employer_info
     * @author MyBatis Generator
     */
    EmployerInfo selectByPrimaryKey(Integer id);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_employer_info
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") EmployerInfo record, @Param("example") EmployerInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_employer_info
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") EmployerInfo record, @Param("example") EmployerInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_employer_info
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(EmployerInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_employer_info
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(EmployerInfo record);
}