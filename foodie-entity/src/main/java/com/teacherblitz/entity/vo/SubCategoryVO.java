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
@ApiModel(value = "SubCategoryVO", description = "子种类VO")
@Data
public class SubCategoryVO implements Serializable {

    private static final long serialVersionUID = 3039925956732856446L;

    @ApiModelProperty(value = "种类id", name = "cId")
    private Integer cId;

    @ApiModelProperty(value = "分类名称", name = "cName")
    private String cName;

    @ApiModelProperty(value = "分类类型", name = "cType")
    private Integer cType;

    @ApiModelProperty(value = "父分类id", name = "cFatherId")
    private Integer cFatherId;

    @ApiModelProperty(value = "分类图", name = "cCatImage")
    private String cCatImage;

    @ApiModelProperty(value = "背景颜色", name = "cBgColor")
    private String cBgColor;
}
