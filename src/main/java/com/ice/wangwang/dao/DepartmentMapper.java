package com.ice.wangwang.dao;

import com.ice.wangwang.bean.Department;
import com.ice.wangwang.bean.DepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_department
     * @author MyBatis Generator
     */
    int countByExample(DepartmentExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_department
     * @author MyBatis Generator
     */
    int deleteByExample(DepartmentExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_department
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_department
     * @author MyBatis Generator
     */
    int insert(Department record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_department
     * @author MyBatis Generator
     */
    int insertSelective(Department record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_department
     * @author MyBatis Generator
     */
    List<Department> selectByExample(DepartmentExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_department
     * @author MyBatis Generator
     */
    Department selectByPrimaryKey(Integer id);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_department
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_department
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_department
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(Department record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: t_department
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(Department record);
}