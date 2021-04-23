package online.danbao.mall.api.controller.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author jingjing
 * @data 2021/4/23 10:28
 * @description UpdateCartItemParam
 **/
@Data
public class UpdateCartItemParam implements Serializable {
    @ApiModelProperty("购物项id")
    private Long cartItemId;
    @ApiModelProperty("商品数量")
    private Integer goodsCount;
}
