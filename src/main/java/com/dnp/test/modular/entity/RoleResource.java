package com.dnp.test.modular.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p>
 * 角色资源
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
@XmlRootElement(name = "roleResource" )
@XmlAccessorType(XmlAccessType.NONE)
@ApiModel(value = "roleResource" , description = "角色资源" )
public class RoleResource extends Model<RoleResource> {

private static final long serialVersionUID=1L;

            /**
     * 主键id
     */
                        @TableId(value = "id" , type = IdType.AUTO)
                
@XmlAttribute
@ApiModelProperty(value = "主键id" , dataType = "Long" )
private Long id;
            /**
     * 角色id
     */
            
@XmlAttribute
@ApiModelProperty(value = "角色id" , dataType = "Long" )
private Long roleId;
            /**
     * 资源id
     */
            
@XmlAttribute
@ApiModelProperty(value = "资源id" , dataType = "Long" )
private Long resourceId;


public RoleResource(){
        }



public RoleResource(
                                            Long roleId
                                ,
                                            Long resourceId
                                ){
                                                this.roleId = roleId;
                                    this.resourceId = resourceId;
                    }

                    
    public Long getId(){
            return id;
            }

                public void setId(Long id) {
                    this.id = id;
                    }
                    
    public Long getRoleId(){
            return roleId;
            }

                public void setRoleId(Long roleId) {
                    this.roleId = roleId;
                    }
                    
    public Long getResourceId(){
            return resourceId;
            }

                public void setResourceId(Long resourceId) {
                    this.resourceId = resourceId;
                    }
    
@Override
protected Serializable pkVal(){
                return this.id;
            }

@Override
public String toString(){
        return"RoleResource{"+
                            "id="+ id +
                                    ", roleId="+ roleId +
                                    ", resourceId="+ resourceId +
                    "}";
        }
        }
