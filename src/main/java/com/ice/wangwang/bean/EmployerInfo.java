package com.ice.wangwang.bean;

import java.io.Serializable;

public class EmployerInfo implements Serializable {
    public static final long serialVersionUID = -161824369L;

    /**
     * : t_employer_info.id
     * @author MyBatis Generator
     */
    private Integer id;

    /**
     * 名字: t_employer_info.user_name
     * @author MyBatis Generator
     */
    private String userName;

    /**
     * : t_employer_info.age
     * @author MyBatis Generator
     */
    private Integer age;

    /**
     * 0为女，1为男: t_employer_info.sex
     * @author MyBatis Generator
     */
    private Integer sex;

    /**
     * : t_employer_info.address
     * @author MyBatis Generator
     */
    private String address;

    /**
     * 获取: t_employer_info.id
     * @return : t_employer_info.id
     * @author MyBatis Generator
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置: t_employer_info.id
     * @param id 映射数据库字段: t_employer_info.id
     * @author MyBatis Generator
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取名字: t_employer_info.user_name
     * @return 名字: t_employer_info.user_name
     * @author MyBatis Generator
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置名字: t_employer_info.user_name
     * @param userName 映射数据库字段: t_employer_info.user_name
     * @author MyBatis Generator
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取: t_employer_info.age
     * @return : t_employer_info.age
     * @author MyBatis Generator
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置: t_employer_info.age
     * @param age 映射数据库字段: t_employer_info.age
     * @author MyBatis Generator
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取0为女，1为男: t_employer_info.sex
     * @return 0为女，1为男: t_employer_info.sex
     * @author MyBatis Generator
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置0为女，1为男: t_employer_info.sex
     * @param sex 映射数据库字段: t_employer_info.sex
     * @author MyBatis Generator
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取: t_employer_info.address
     * @return : t_employer_info.address
     * @author MyBatis Generator
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置: t_employer_info.address
     * @param address 映射数据库字段: t_employer_info.address
     * @author MyBatis Generator
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}