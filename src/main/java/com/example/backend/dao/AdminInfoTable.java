package com.example.backend.dao;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName admin_info_table
 */
@TableName(value ="admin_info_table")
public class AdminInfoTable implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer id;

    /**
     * 
     */
    private Integer loginId;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String phoneNum;

    /**
     * 
     */

    private String passWord;


    private String department;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String imgface;

    /**
     * 
     */
    private Integer isLocked;

    /**
     * 
     */
    private Integer level;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     */
    public Integer getLoginId() {
        return loginId;
    }

    /**
     * 
     */
    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    /**
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 
     */


    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * 
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     */
    public String getImgface() {
        return imgface;
    }

    /**
     * 
     */
    public void setImgface(String imgface) {
        this.imgface = imgface;
    }

    /**
     * 
     */
    public Integer getIsLocked() {
        return isLocked;
    }

    /**
     * 
     */
    public void setIsLocked(Integer isLocked) {
        this.isLocked = isLocked;
    }

    /**
     * 
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AdminInfoTable other = (AdminInfoTable) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLoginId() == null ? other.getLoginId() == null : this.getLoginId().equals(other.getLoginId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPhoneNum() == null ? other.getPhoneNum() == null : this.getPhoneNum().equals(other.getPhoneNum()))
            && (this.getPassWord() == null ? other.getPassWord() == null : this.getPassWord().equals(other.getPassWord()))
            && (this.getDepartment() == null ? other.getDepartment() == null : this.getDepartment().equals(other.getDepartment()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getImgface() == null ? other.getImgface() == null : this.getImgface().equals(other.getImgface()))
            && (this.getIsLocked() == null ? other.getIsLocked() == null : this.getIsLocked().equals(other.getIsLocked()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLoginId() == null) ? 0 : getLoginId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPhoneNum() == null) ? 0 : getPhoneNum().hashCode());
        result = prime * result + ((getPassWord() == null) ? 0 : getPassWord().hashCode());
        result = prime * result + ((getDepartment() == null) ? 0 : getDepartment().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getImgface() == null) ? 0 : getImgface().hashCode());
        result = prime * result + ((getIsLocked() == null) ? 0 : getIsLocked().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", loginId=").append(loginId);
        sb.append(", name=").append(name);
        sb.append(", phoneNum=").append(phoneNum);
        sb.append(", passWord=").append(passWord);
        sb.append(", department=").append(department);
        sb.append(", email=").append(email);
        sb.append(", imgface=").append(imgface);
        sb.append(", isLocked=").append(isLocked);
        sb.append(", level=").append(level);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}