package com.dnp.test.modular.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 系统日志
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
@XmlRootElement(name = "sysLog")
@XmlAccessorType(XmlAccessType.NONE)
@ApiModel(value = "sysLog", description = "系统日志")
public class SysLog extends Model<SysLog> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)

    @XmlAttribute
    @ApiModelProperty(value = "主键id", dataType = "Long")
    private Long id;
    /**
     * 登陆名
     */

    @XmlAttribute
    @ApiModelProperty(value = "登陆名", dataType = "String")
    private String loginName;
    /**
     * 角色名
     */

    @XmlAttribute
    @ApiModelProperty(value = "角色名", dataType = "String")
    private String roleName;
    /**
     * 内容
     */

    @XmlAttribute
    @ApiModelProperty(value = "内容", dataType = "String")
    private String optContent;
    /**
     * 客户端ip
     */

    @XmlAttribute
    @ApiModelProperty(value = "客户端ip", dataType = "String")
    private String clientIp;
    /**
     * 创建时间
     */

    @XmlAttribute
    @ApiModelProperty(value = "创建时间", dataType = "LocalDateTime")
    private LocalDateTime createTime;


    public SysLog() {
    }


    public SysLog(
            String loginName
            ,
            String roleName
            ,
            String optContent
            ,
            String clientIp
            ,
            LocalDateTime createTime
    ) {
        this.loginName = loginName;
        this.roleName = roleName;
        this.optContent = optContent;
        this.clientIp = clientIp;
        this.createTime = createTime;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getOptContent() {
        return optContent;
    }

    public void setOptContent(String optContent) {
        this.optContent = optContent;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SysLog{" +
                "id=" + id +
                ", loginName=" + loginName +
                ", roleName=" + roleName +
                ", optContent=" + optContent +
                ", clientIp=" + clientIp +
                ", createTime=" + createTime +
                "}";
    }
}
