package com.example.backend;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统日志记录表（不要改名哦！）
 * @TableName sys_req_log
 */
public class SysReqLog implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Integer userId;

    /**
     * 
     */
    private String phone;

    /**
     * 
     */
    private String userName;

    /**
     * 
     */
    private String token;

    /**
     * 
     */
    private String reqUrl;

    /**
     * 
     */
    private String reqUri;

    /**
     * 
     */
    private Integer time;

    /**
     * 
     */
    private String method;

    /**
     * 
     */
    private String reqParams;

    /**
     * 
     */
    private String respParams;

    /**
     * 
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 
     */
    public String getToken() {
        return token;
    }

    /**
     * 
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * 
     */
    public String getReqUrl() {
        return reqUrl;
    }

    /**
     * 
     */
    public void setReqUrl(String reqUrl) {
        this.reqUrl = reqUrl;
    }

    /**
     * 
     */
    public String getReqUri() {
        return reqUri;
    }

    /**
     * 
     */
    public void setReqUri(String reqUri) {
        this.reqUri = reqUri;
    }

    /**
     * 
     */
    public Integer getTime() {
        return time;
    }

    /**
     * 
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    /**
     * 
     */
    public String getMethod() {
        return method;
    }

    /**
     * 
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * 
     */
    public String getReqParams() {
        return reqParams;
    }

    /**
     * 
     */
    public void setReqParams(String reqParams) {
        this.reqParams = reqParams;
    }

    /**
     * 
     */
    public String getRespParams() {
        return respParams;
    }

    /**
     * 
     */
    public void setRespParams(String respParams) {
        this.respParams = respParams;
    }

    /**
     * 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        SysReqLog other = (SysReqLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getToken() == null ? other.getToken() == null : this.getToken().equals(other.getToken()))
            && (this.getReqUrl() == null ? other.getReqUrl() == null : this.getReqUrl().equals(other.getReqUrl()))
            && (this.getReqUri() == null ? other.getReqUri() == null : this.getReqUri().equals(other.getReqUri()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getMethod() == null ? other.getMethod() == null : this.getMethod().equals(other.getMethod()))
            && (this.getReqParams() == null ? other.getReqParams() == null : this.getReqParams().equals(other.getReqParams()))
            && (this.getRespParams() == null ? other.getRespParams() == null : this.getRespParams().equals(other.getRespParams()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getToken() == null) ? 0 : getToken().hashCode());
        result = prime * result + ((getReqUrl() == null) ? 0 : getReqUrl().hashCode());
        result = prime * result + ((getReqUri() == null) ? 0 : getReqUri().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getMethod() == null) ? 0 : getMethod().hashCode());
        result = prime * result + ((getReqParams() == null) ? 0 : getReqParams().hashCode());
        result = prime * result + ((getRespParams() == null) ? 0 : getRespParams().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", phone=").append(phone);
        sb.append(", userName=").append(userName);
        sb.append(", token=").append(token);
        sb.append(", reqUrl=").append(reqUrl);
        sb.append(", reqUri=").append(reqUri);
        sb.append(", time=").append(time);
        sb.append(", method=").append(method);
        sb.append(", reqParams=").append(reqParams);
        sb.append(", respParams=").append(respParams);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}