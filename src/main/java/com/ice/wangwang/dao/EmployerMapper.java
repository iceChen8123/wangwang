package com.ice.wangwang.dao;

import com.ice.wangwang.bean.Employer;
import com.ice.wangwang.bean.EmployerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployerMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_employer
     * @author MyBatis Generator
     */
    int countByExample(EmployerExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_employer
     * @author MyBatis Generator
     */
    int deleteByExample(EmployerExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_employer
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_employer
     * @author MyBatis Generator
     */
    int insert(Employer record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_employer
     * @author MyBatis Generator
     */
    int insertSelective(Employer record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_employer
     * @author MyBatis Generator
     */
    List<Employer> selectByExample(EmployerExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_employer
     * @author MyBatis Generator
     */
    Employer selectByPrimaryKey(Integer id);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_employer
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") Employer record, @Param("example") EmployerExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_employer
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") Employer record, @Param("example") EmployerExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_employer
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(Employer record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_employer
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(Employer record);
}