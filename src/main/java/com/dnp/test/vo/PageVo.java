package com.dnp.test.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.Length;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "pageVo")
@XmlAccessorType(XmlAccessType.NONE)
@ApiModel(value = "pavaVo", description = "分页信息")
public class PageVo implements Serializable {

    private static final long serialVersionUID = -5466182189778460506L;

    // 查询时排序方式，可选，默认descasc 升序 desc降序
    @XmlAttribute
    @ApiModelProperty(value = "升序降序字段,如：casc 升序 desc降序", dataType = "String")
    @Length(max = 3, message = "字段长度不能小于3")
    private String order;
    // 排序字段，可选，默认id
    @XmlAttribute
    @ApiModelProperty(value = "排序字段", dataType = "String")
    @Length(max = 64)
    private String sort;
    // 查询偏移量，可选，默认0
    @XmlAttribute
    @ApiModelProperty(value = "偏移量", dataType = "Integer")
    private Integer offset;
    // 查询长度，可选，默认20
    @XmlAttribute
    @ApiModelProperty(value = "页大小", dataType = "Integer")
    private Integer limit;

    public PageVo() {
    }

    /**
     * <p>
     * 分页包含的一些字段
     *
     * @param order  排序字段，默认降序
     * @param sort   排序字段，默认id
     * @param limit  页大小，默认20
     * @param offset 分页偏移量，默认0
     */
    public PageVo(String order, String sort, Integer limit, Integer offset) {
        if (StringUtils.isEmpty(order)) {
            this.order = "desc";
        } else {
            this.order = order;
        }
        if (StringUtils.isEmpty(sort)) {
            this.sort = "id";
        } else {
            this.sort = sort;
        }
        if (isEmptyNumber(limit)) {
            this.limit = 20;
        } else {
            this.limit = limit;
        }
        if (isEmptyNumber(offset)) {
            this.offset = 0;
        } else {
            this.offset = offset;
        }
    }

    public String getOrder() {
        if (StringUtils.isEmpty(order)) {
            this.order = "desc";
        }
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getSort() {
        if (StringUtils.isEmpty(sort)) {
            this.sort = "id";
        }
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Integer getLimit() {
        if (isEmptyNumber(limit)) {
            this.limit = 20;
        }
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        if (isEmptyNumber(offset)) {
            this.offset = 0;
        }
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public static boolean isEmptyNumber(Integer number) {
        if (number == null || String.valueOf(number) == "") {
            return true;
        } else {
            return false;
        }
    }
}
