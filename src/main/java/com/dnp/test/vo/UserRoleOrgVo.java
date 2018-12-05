package com.dnp.test.vo;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
@XmlRootElement(name = "UserRoleOrgVo")
@XmlAccessorType(XmlAccessType.NONE)
@ApiModel(value = "UserRoleOrgVo", description = "用户角色部门关系")
public class UserRoleOrgVo extends Model<UserRoleOrgVo> {
    private static final long serialVersionUID = 1L;


    @XmlAttribute
    @ApiModelProperty(value = "主键id", dataType = "Long")
    private Long userId;
    /**
     * 用户名
     */

    @XmlAttribute
    @ApiModelProperty(value = "用户名", dataType = "String")
    private String username;
    /**
     * 密码
     */

    @XmlAttribute
    @ApiModelProperty(value = "密码", dataType = "String")
    private String password;

    /**
     * 手机号
     */

    @XmlAttribute
    @ApiModelProperty(value = "手机号", dataType = "String")
    private String phone;

    /**
     * 所属机构
     */

    @XmlAttribute
    @ApiModelProperty(value = "所属机构Id", dataType = "Integer")
    private Integer organizationId;


    @XmlAttribute
    @ApiModelProperty(value = "所属机构名称", dataType = "String")
    private String organizationName;
    /**
     * 创建时间
     */

    @XmlAttribute
    @ApiModelProperty(value = "创建时间", dataType = "createTime")
    private LocalDateTime createTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}
