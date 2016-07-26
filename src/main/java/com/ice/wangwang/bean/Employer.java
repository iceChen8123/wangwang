package com.ice.wangwang.bean;

import java.io.Serializable;

public class Employer implements Serializable {
    public static final long serialVersionUID = 2084860225L;

    /**
     * : t_employer.id
     * @author MyBatis Generator
     */
    private Integer id;

    /**
     * : t_employer.user_id
     * @author MyBatis Generator
     */
    private Integer userId;

    /**
     * 名字: t_employer.user_name
     * @author MyBatis Generator
     */
    private String userName;

    /**
     * 英文名: t_employer.eng_name
     * @author MyBatis Generator
     */
    private String engName;

    /**
     * 部门: t_employer.department_id
     * @author MyBatis Generator
     */
    private Integer departmentId;

    /**
     * 工资: t_employer.salary
     * @author MyBatis Generator
     */
    private Integer salary;

    /**
     * 薪资月数，12/13....: t_employer.months
     * @author MyBatis Generator
     */
    private Integer months;

    /**
     * 获取: t_employer.id
     * @return : t_employer.id
     * @author MyBatis Generator
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置: t_employer.id
     * @param id 映射数据库字段: t_employer.id
     * @author MyBatis Generator
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取: t_employer.user_id
     * @return : t_employer.user_id
     * @author MyBatis Generator
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置: t_employer.user_id
     * @param userId 映射数据库字段: t_employer.user_id
     * @author MyBatis Generator
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取名字: t_employer.user_name
     * @return 名字: t_employer.user_name
     * @author MyBatis Generator
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置名字: t_employer.user_name
     * @param userName 映射数据库字段: t_employer.user_name
     * @author MyBatis Generator
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取英文名: t_employer.eng_name
     * @return 英文名: t_employer.eng_name
     * @author MyBatis Generator
     */
    public String getEngName() {
        return engName;
    }

    /**
     * 设置英文名: t_employer.eng_name
     * @param engName 映射数据库字段: t_employer.eng_name
     * @author MyBatis Generator
     */
    public void setEngName(String engName) {
        this.engName = engName == null ? null : engName.trim();
    }

    /**
     * 获取部门: t_employer.department_id
     * @return 部门: t_employer.department_id
     * @author MyBatis Generator
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置部门: t_employer.department_id
     * @param departmentId 映射数据库字段: t_employer.department_id
     * @author MyBatis Generator
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 获取工资: t_employer.salary
     * @return 工资: t_employer.salary
     * @author MyBatis Generator
     */
    public Integer getSalary() {
        return salary;
    }

    /**
     * 设置工资: t_employer.salary
     * @param salary 映射数据库字段: t_employer.salary
     * @author MyBatis Generator
     */
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    /**
     * 获取薪资月数，12/13....: t_employer.months
     * @return 薪资月数，12/13....: t_employer.months
     * @author MyBatis Generator
     */
    public Integer getMonths() {
        return months;
    }

    /**
     * 设置薪资月数，12/13....: t_employer.months
     * @param months 映射数据库字段: t_employer.months
     * @author MyBatis Generator
     */
    public void setMonths(Integer months) {
        this.months = months;
    }
}