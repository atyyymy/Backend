package com.example.backend.dao;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName teacher_info_table
 */
@TableName(value ="teacher_info_table")
@Data
public class TeacherInfoTable implements Serializable {
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
    private String sex;

    /**
     * 
     */
    private String idNum;

    /**
     * 
     */
    private String techTitle;

    /**
     * 
     */
    private String department;

    /**
     * 
     */
    private String specialty;

    /**
     * 
     */
    private String topAcademic;

    /**
     * 
     */
    private String topDegree;

    /**
     * 
     */
    private String telephone;

    /**
     * 
     */
    private String phoneNum;

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
    private Integer level;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

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
        TeacherInfoTable other = (TeacherInfoTable) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLoginId() == null ? other.getLoginId() == null : this.getLoginId().equals(other.getLoginId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getIdNum() == null ? other.getIdNum() == null : this.getIdNum().equals(other.getIdNum()))
            && (this.getTechTitle() == null ? other.getTechTitle() == null : this.getTechTitle().equals(other.getTechTitle()))
            && (this.getDepartment() == null ? other.getDepartment() == null : this.getDepartment().equals(other.getDepartment()))
            && (this.getSpecialty() == null ? other.getSpecialty() == null : this.getSpecialty().equals(other.getSpecialty()))
            && (this.getTopAcademic() == null ? other.getTopAcademic() == null : this.getTopAcademic().equals(other.getTopAcademic()))
            && (this.getTopDegree() == null ? other.getTopDegree() == null : this.getTopDegree().equals(other.getTopDegree()))
            && (this.getTelephone() == null ? other.getTelephone() == null : this.getTelephone().equals(other.getTelephone()))
            && (this.getPhoneNum() == null ? other.getPhoneNum() == null : this.getPhoneNum().equals(other.getPhoneNum()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getImgface() == null ? other.getImgface() == null : this.getImgface().equals(other.getImgface()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLoginId() == null) ? 0 : getLoginId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getIdNum() == null) ? 0 : getIdNum().hashCode());
        result = prime * result + ((getTechTitle() == null) ? 0 : getTechTitle().hashCode());
        result = prime * result + ((getDepartment() == null) ? 0 : getDepartment().hashCode());
        result = prime * result + ((getSpecialty() == null) ? 0 : getSpecialty().hashCode());
        result = prime * result + ((getTopAcademic() == null) ? 0 : getTopAcademic().hashCode());
        result = prime * result + ((getTopDegree() == null) ? 0 : getTopDegree().hashCode());
        result = prime * result + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        result = prime * result + ((getPhoneNum() == null) ? 0 : getPhoneNum().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getImgface() == null) ? 0 : getImgface().hashCode());
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
        sb.append(", sex=").append(sex);
        sb.append(", idNum=").append(idNum);
        sb.append(", techTitle=").append(techTitle);
        sb.append(", department=").append(department);
        sb.append(", specialty=").append(specialty);
        sb.append(", topAcademic=").append(topAcademic);
        sb.append(", topDegree=").append(topDegree);
        sb.append(", telephone=").append(telephone);
        sb.append(", phoneNum=").append(phoneNum);
        sb.append(", email=").append(email);
        sb.append(", imgface=").append(imgface);
        sb.append(", level=").append(level);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}