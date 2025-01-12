package com.atguigu.spzx.product.mapper;

import com.atguigu.spzx.model.dto.h5.ProductSkuDto;
import com.atguigu.spzx.model.entity.product.ProductSku;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: ProductSkuMapper
 * Description:
 *
 * @Author Refactoring
 * Create 2024/8/12 下午6:08
 * Version 1.8
 */

@Mapper
public interface ProductSkuMapper {

    //2 根据销量排序,获取前十条记录
    List<ProductSku> selectProductSkuBySale();

    // 分页查询
    List<ProductSku> findByPage(ProductSkuDto productSkuDto);

    //2 根据skuId获取sku信息
    ProductSku getById(Long skuId);

    //根据商品id获取商品所有sku列表
    List<ProductSku> findByProductId(Long productId);
}
