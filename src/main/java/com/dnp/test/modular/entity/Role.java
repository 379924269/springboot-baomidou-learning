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

/**
 * <p>
 * 角色
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
@XmlRootElement(name = "role")
@XmlAccessorType(XmlAccessType.NONE)
@ApiModel(value = "role", description = "角色")
public class Role extends Model<Role> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)

    @XmlAttribute
    @ApiModelProperty(value = "主键id", dataType = "Long")
    private Long id;
    /**
     * 角色名
     */

    @XmlAttribute
    @ApiModelProperty(value = "角色名", dataType = "String")
    private String name;
    /**
     * 排序号
     */

    @XmlAttribute
    @ApiModelProperty(value = "排序号", dataType = "Integer")
    private Integer seq;
    /**
     * 简介
     */

    @XmlAttribute
    @ApiModelProperty(value = "简介", dataType = "String")
    private String description;
    /**
     * 状态
     */

    @XmlAttribute
    @ApiModelProperty(value = "状态", dataType = "Integer")
    private Integer status;


    public Role() {
    }


    public Role(
            String name
            ,
            Integer seq
            ,
            String description
            ,
            Integer status
    ) {
        this.name = name;
        this.seq = seq;
        this.description = description;
        this.status = status;
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

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name=" + name +
                ", seq=" + seq +
                ", description=" + description +
                ", status=" + status +
                "}";
    }
}
