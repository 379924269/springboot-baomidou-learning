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
 * 资源
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
@XmlRootElement(name = "resource")
@XmlAccessorType(XmlAccessType.NONE)
@ApiModel(value = "resource", description = "资源")
public class Resource extends Model<Resource> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)

    @XmlAttribute
    @ApiModelProperty(value = "主键", dataType = "Long")
    private Long id;
    /**
     * 资源名称
     */

    @XmlAttribute
    @ApiModelProperty(value = "资源名称", dataType = "String")
    private String name;
    /**
     * 资源路径
     */

    @XmlAttribute
    @ApiModelProperty(value = "资源路径", dataType = "String")
    private String url;
    /**
     * 打开方式 ajax,iframe
     */

    @XmlAttribute
    @ApiModelProperty(value = "打开方式 ajax,iframe", dataType = "String")
    private String openMode;
    /**
     * 资源介绍
     */

    @XmlAttribute
    @ApiModelProperty(value = "资源介绍", dataType = "String")
    private String description;
    /**
     * 资源图标
     */

    @XmlAttribute
    @ApiModelProperty(value = "资源图标", dataType = "String")
    private String icon;
    /**
     * 父级资源id
     */

    @XmlAttribute
    @ApiModelProperty(value = "父级资源id", dataType = "Long")
    private Long pid;
    /**
     * 排序
     */

    @XmlAttribute
    @ApiModelProperty(value = "排序", dataType = "Integer")
    private Integer seq;
    /**
     * 状态
     */

    @XmlAttribute
    @ApiModelProperty(value = "状态", dataType = "Integer")
    private Integer status;
    /**
     * 打开状态
     */

    @XmlAttribute
    @ApiModelProperty(value = "打开状态", dataType = "Integer")
    private Integer opened;
    /**
     * 资源类别
     */

    @XmlAttribute
    @ApiModelProperty(value = "资源类别", dataType = "Integer")
    private Integer resourceType;
    /**
     * 创建时间
     */

    @XmlAttribute
    @ApiModelProperty(value = "创建时间", dataType = "LocalDateTime")
    private LocalDateTime createTime;
    /**
     * 请求方法：get、post......
     */

    @XmlAttribute
    @ApiModelProperty(value = "请求方法：get、post......", dataType = "String")
    private String method;


    public Resource() {
    }


    public Resource(
            String name
            ,
            String url
            ,
            String openMode
            ,
            String description
            ,
            String icon
            ,
            Long pid
            ,
            Integer seq
            ,
            Integer status
            ,
            Integer opened
            ,
            Integer resourceType
            ,
            LocalDateTime createTime
            ,
            String method
    ) {
        this.name = name;
        this.url = url;
        this.openMode = openMode;
        this.description = description;
        this.icon = icon;
        this.pid = pid;
        this.seq = seq;
        this.status = status;
        this.opened = opened;
        this.resourceType = resourceType;
        this.createTime = createTime;
        this.method = method;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOpenMode() {
        return openMode;
    }

    public void setOpenMode(String openMode) {
        this.openMode = openMode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOpened() {
        return opened;
    }

    public void setOpened(Integer opened) {
        this.opened = opened;
    }

    public Integer getResourceType() {
        return resourceType;
    }

    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "id=" + id +
                ", name=" + name +
                ", url=" + url +
                ", openMode=" + openMode +
                ", description=" + description +
                ", icon=" + icon +
                ", pid=" + pid +
                ", seq=" + seq +
                ", status=" + status +
                ", opened=" + opened +
                ", resourceType=" + resourceType +
                ", createTime=" + createTime +
                ", method=" + method +
                "}";
    }
}
