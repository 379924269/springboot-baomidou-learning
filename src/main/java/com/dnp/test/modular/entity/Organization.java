package com.dnp.test.modular.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
 * 组织机构
 * </p>
 *
 * @author huazai
 * @since 2018-11-15
 */
@XmlRootElement(name = "organization" )
@XmlAccessorType(XmlAccessType.NONE)
@ApiModel(value = "organization" , description = "组织机构" )
public class Organization extends Model<Organization> {

private static final long serialVersionUID=1L;

            /**
     * 主键id
     */
                        @TableId(value = "id" , type = IdType.AUTO)
                
@XmlAttribute
@ApiModelProperty(value = "主键id" , dataType = "Long" )
private Long id;
            /**
     * 组织名
     */
            
@XmlAttribute
@ApiModelProperty(value = "组织名" , dataType = "String" )
private String name;
            /**
     * 地址
     */
            
@XmlAttribute
@ApiModelProperty(value = "地址" , dataType = "String" )
private String address;
            /**
     * 编号
     */
            
@XmlAttribute
@ApiModelProperty(value = "编号" , dataType = "String" )
private String code;
            /**
     * 图标
     */
            
@XmlAttribute
@ApiModelProperty(value = "图标" , dataType = "String" )
private String icon;
            /**
     * 父级主键
     */
            
@XmlAttribute
@ApiModelProperty(value = "父级主键" , dataType = "Long" )
private Long pid;
            /**
     * 排序
     */
            
@XmlAttribute
@ApiModelProperty(value = "排序" , dataType = "Integer" )
private Integer seq;
            /**
     * 创建时间
     */
            
@XmlAttribute
@ApiModelProperty(value = "创建时间" , dataType = "LocalDateTime" )
private LocalDateTime createTime;


public Organization(){
        }



public Organization(
                                            String name
                                ,
                                            String address
                                ,
                                            String code
                                ,
                                            String icon
                                ,
                                            Long pid
                                ,
                                            Integer seq
                                ,
                                            LocalDateTime createTime
                                ){
                                                this.name = name;
                                    this.address = address;
                                    this.code = code;
                                    this.icon = icon;
                                    this.pid = pid;
                                    this.seq = seq;
                                    this.createTime = createTime;
                    }

                    
    public Long getId(){
            return id;
            }

                public void setId(Long id) {
                    this.id = id;
                    }
                    
    public String getName(){
            return name;
            }

                public void setName(String name) {
                    this.name = name;
                    }
                    
    public String getAddress(){
            return address;
            }

                public void setAddress(String address) {
                    this.address = address;
                    }
                    
    public String getCode(){
            return code;
            }

                public void setCode(String code) {
                    this.code = code;
                    }
                    
    public String getIcon(){
            return icon;
            }

                public void setIcon(String icon) {
                    this.icon = icon;
                    }
                    
    public Long getPid(){
            return pid;
            }

                public void setPid(Long pid) {
                    this.pid = pid;
                    }
                    
    public Integer getSeq(){
            return seq;
            }

                public void setSeq(Integer seq) {
                    this.seq = seq;
                    }
                    
    public LocalDateTime getCreateTime(){
            return createTime;
            }

                public void setCreateTime(LocalDateTime createTime) {
                    this.createTime = createTime;
                    }
    
@Override
protected Serializable pkVal(){
                return this.id;
            }

@Override
public String toString(){
        return"Organization{"+
                            "id="+ id +
                                    ", name="+ name +
                                    ", address="+ address +
                                    ", code="+ code +
                                    ", icon="+ icon +
                                    ", pid="+ pid +
                                    ", seq="+ seq +
                                    ", createTime="+ createTime +
                    "}";
        }
        }
