package com.ice.wangwang.bean;

import java.io.Serializable;

public class User implements Serializable {
    public static final long serialVersionUID = 303999313L;

    /**
     * : t_user.id
     * @author MyBatis Generator
     */
    private Integer id;

    /**
     * : t_user.user_name
     * @author MyBatis Generator
     */
    private String userName;

    /**
     * : t_user.age
     * @author MyBatis Generator
     */
    private Integer age;

    /**
     * 0为女，1为男: t_user.sex
     * @author MyBatis Generator
     */
    private Integer sex;

    /**
     * : t_user.address
     * @author MyBatis Generator
     */
    private String address;

    /**
     * : t_user.phone
     * @author MyBatis Generator
     */
    private String phone;

    /**
     * : t_user.photopath
     * @author MyBatis Generator
     */
    private String photopath;

    /**
     * : t_user.hobby
     * @author MyBatis Generator
     */
    private String hobby;

    /**
     * : t_user.user_desc
     * @author MyBatis Generator
     */
    private String userDesc;

    /**
     * 获取: t_user.id
     * @return : t_user.id
     * @author MyBatis Generator
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置: t_user.id
     * @param id 映射数据库字段: t_user.id
     * @author MyBatis Generator
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取: t_user.user_name
     * @return : t_user.user_name
     * @author MyBatis Generator
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置: t_user.user_name
     * @param userName 映射数据库字段: t_user.user_name
     * @author MyBatis Generator
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取: t_user.age
     * @return : t_user.age
     * @author MyBatis Generator
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置: t_user.age
     * @param age 映射数据库字段: t_user.age
     * @author MyBatis Generator
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取0为女，1为男: t_user.sex
     * @return 0为女，1为男: t_user.sex
     * @author MyBatis Generator
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置0为女，1为男: t_user.sex
     * @param sex 映射数据库字段: t_user.sex
     * @author MyBatis Generator
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取: t_user.address
     * @return : t_user.address
     * @author MyBatis Generator
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置: t_user.address
     * @param address 映射数据库字段: t_user.address
     * @author MyBatis Generator
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取: t_user.phone
     * @return : t_user.phone
     * @author MyBatis Generator
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置: t_user.phone
     * @param phone 映射数据库字段: t_user.phone
     * @author MyBatis Generator
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取: t_user.photopath
     * @return : t_user.photopath
     * @author MyBatis Generator
     */
    public String getPhotopath() {
        return photopath;
    }

    /**
     * 设置: t_user.photopath
     * @param photopath 映射数据库字段: t_user.photopath
     * @author MyBatis Generator
     */
    public void setPhotopath(String photopath) {
        this.photopath = photopath == null ? null : photopath.trim();
    }

    /**
     * 获取: t_user.hobby
     * @return : t_user.hobby
     * @author MyBatis Generator
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * 设置: t_user.hobby
     * @param hobby 映射数据库字段: t_user.hobby
     * @author MyBatis Generator
     */
    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    /**
     * 获取: t_user.user_desc
     * @return : t_user.user_desc
     * @author MyBatis Generator
     */
    public String getUserDesc() {
        return userDesc;
    }

    /**
     * 设置: t_user.user_desc
     * @param userDesc 映射数据库字段: t_user.user_desc
     * @author MyBatis Generator
     */
    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc == null ? null : userDesc.trim();
    }
}