package com.ice.wangwang.bean;

import java.io.Serializable;

public class Department implements Serializable {
    public static final long serialVersionUID = -1518910376L;

    /**
     * : t_department.id
     * @author MyBatis Generator
     */
    private Integer id;

    /**
     * 部门名称: t_department.dname
     * @author MyBatis Generator
     */
    private String dname;

    /**
     * 获取: t_department.id
     * @return : t_department.id
     * @author MyBatis Generator
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置: t_department.id
     * @param id 映射数据库字段: t_department.id
     * @author MyBatis Generator
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取部门名称: t_department.dname
     * @return 部门名称: t_department.dname
     * @author MyBatis Generator
     */
    public String getDname() {
        return dname;
    }

    /**
     * 设置部门名称: t_department.dname
     * @param dname 映射数据库字段: t_department.dname
     * @author MyBatis Generator
     */
    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }
}