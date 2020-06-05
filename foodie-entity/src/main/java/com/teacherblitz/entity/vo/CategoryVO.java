package com.teacherblitz.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 种类VO
 * @author: teacherblitz
 * @since: 2020/5/12
 */
@ApiModel(description = "种类VO")
@Data
public class CategoryVO implements Serializable {

    private static final long serialVersionUID = 3165436591616667830L;

    @ApiModelProperty(value = "种类id")
    private Integer id;

    @ApiModelProperty(value = "分类名称")
    private String name;

    @ApiModelProperty(value = "父分类id")
    private Integer fatherId;

    @ApiModelProperty(value = "分类类型")
    private Integer type;

    @ApiModelProperty(value = "分类图")
    private String catImage;

    @ApiModelProperty(value = "背景颜色")
    private String bgColor;

    @ApiModelProperty(value = "子种类集合")
    private List<SubCategoryVO> list;

}
