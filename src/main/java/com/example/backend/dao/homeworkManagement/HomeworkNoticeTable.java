package com.example.backend.dao.homeworkManagement;
import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
/**
 *
 * @TableName homework_notice_table
 * 作业通知表
 */
@TableName(value = "homework_notice_table")
@Data
public class HomeworkNoticeTable implements Serializable {
    @TableId(type=IdType.AUTO)
    private Integer id;
    private String from;
    private String to;
    private String content;
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
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
        HomeworkNoticeTable other = (HomeworkNoticeTable) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getFrom() == null ? other.getFrom() == null : this.getFrom().equals(other.getFrom()))
                && (this.getTo() == null ? other.getTo() == null : this.getTo().equals(other.getTo()))
                && (this.getContent()== null ? other.getContent() == null : this.getContent().equals(other.getContent()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFrom()== null) ? 0 : getFrom().hashCode());
        result = prime * result + ((getTo() == null) ? 0 : getTo().hashCode());
        result = prime * result + ((getContent()== null) ? 0 : getContent().hashCode());
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
        sb.append(", from=").append(from);
        sb.append(", to=").append(to);
        sb.append(", content=").append(content);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
