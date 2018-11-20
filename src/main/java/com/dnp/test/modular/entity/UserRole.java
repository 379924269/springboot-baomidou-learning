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
 * 用户角色
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
@XmlRootElement(name = "userRole" )
@XmlAccessorType(XmlAccessType.NONE)
@ApiModel(value = "userRole" , description = "用户角色" )
public class UserRole extends Model<UserRole> {

private static final long serialVersionUID=1L;

            /**
     * 主键id
     */
                        @TableId(value = "id" , type = IdType.AUTO)
                
@XmlAttribute
@ApiModelProperty(value = "主键id" , dataType = "Long" )
private Long id;
            /**
     * 用户id
     */
            
@XmlAttribute
@ApiModelProperty(value = "用户id" , dataType = "Long" )
private Long userId;
            /**
     * 角色id
     */
            
@XmlAttribute
@ApiModelProperty(value = "角色id" , dataType = "Long" )
private Long roleId;


public UserRole(){
        }



public UserRole(
                                            Long userId
                                ,
                                            Long roleId
                                ){
                                                this.userId = userId;
                                    this.roleId = roleId;
                    }

                    
    public Long getId(){
            return id;
            }

                public void setId(Long id) {
                    this.id = id;
                    }
                    
    public Long getUserId(){
            return userId;
            }

                public void setUserId(Long userId) {
                    this.userId = userId;
                    }
                    
    public Long getRoleId(){
            return roleId;
            }

                public void setRoleId(Long roleId) {
                    this.roleId = roleId;
                    }
    
@Override
protected Serializable pkVal(){
                return this.id;
            }

@Override
public String toString(){
        return"UserRole{"+
                            "id="+ id +
                                    ", userId="+ userId +
                                    ", roleId="+ roleId +
                    "}";
        }
        }
