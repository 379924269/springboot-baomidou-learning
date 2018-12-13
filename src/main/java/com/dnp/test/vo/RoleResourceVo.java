package com.dnp.test.vo;

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
 * 资源
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
@XmlRootElement(name = "RoleResourceVo")
@XmlAccessorType(XmlAccessType.NONE)
@ApiModel(value = "RoleResourceVo", description = "角色资源信息")
public class RoleResourceVo extends Model<RoleResourceVo> {

    private static final long serialVersionUID = 1L;

    @XmlAttribute
    @ApiModelProperty(value = "资源路径", dataType = "String")
    private String url;

    @XmlAttribute
    @ApiModelProperty(value = "请求方法：get、post......", dataType = "String")
    private String method;

    @XmlAttribute
    @ApiModelProperty(value = "角色名称", dataType = "String")
    private String roleName;

    public RoleResourceVo() {
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
