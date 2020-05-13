package com.teacherblitz.entity.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 种类BO
 * @author: teacherblitz
 * @since: 2020/5/12
 */
@Data
@ApiModel(value = "CategoryBO", description = "种类BO")
public class CategoryBO implements Serializable {

    private static final long serialVersionUID = 8229277263047626814L;

    @ApiModelProperty(value = "种类id", name = "id")
    @NotNull(message = "id不能为空")
    private Integer id;
}
