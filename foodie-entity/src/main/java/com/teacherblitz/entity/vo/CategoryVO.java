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
@ApiModel(value = "种类VO",description = "种类VO")
@Data
public class CategoryVO implements Serializable {

    private static final long serialVersionUID = 3165436591616667830L;

    @ApiModelProperty(value = "种类id", name = "id")
    private Integer id;

    @ApiModelProperty(value = "分类名称", name = "name")
    private String name;

    @ApiModelProperty(value = "父分类id", name = "fatherId")
    private Integer fatherId;

    @ApiModelProperty(value = "分类类型", name = "type")
    private Integer type;

    @ApiModelProperty(value = "分类图", name = "catImage")
    private String catImage;

    @ApiModelProperty(value = "背景颜色", name = "bgColor")
    private String bgColor;

    @ApiModelProperty(value = "子种类集合", name = "list")
    private List<SubCategoryVO> subCategoryVO;

}
