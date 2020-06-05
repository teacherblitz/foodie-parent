package com.teacherblitz.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 子种类VO
 * @author: teacherblitz
 * @since: 2020/5/12
 */
@ApiModel(description = "子种类VO")
@Data
public class SubCategoryVO implements Serializable {

    private static final long serialVersionUID = 3039925956732856446L;

    @ApiModelProperty(value = "种类id")
    private Integer cId;

    @ApiModelProperty(value = "分类名称")
    private String cName;

    @ApiModelProperty(value = "分类类型")
    private Integer cType;

    @ApiModelProperty(value = "父分类id")
    private Integer cFatherId;

    @ApiModelProperty(value = "分类图")
    private String cCatImage;

    @ApiModelProperty(value = "背景颜色")
    private String cBgColor;
}
