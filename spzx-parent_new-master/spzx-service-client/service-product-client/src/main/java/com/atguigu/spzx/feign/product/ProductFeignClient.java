package com.atguigu.spzx.feign.product;

import com.atguigu.spzx.model.entity.order.OrderInfo;
import com.atguigu.spzx.model.entity.product.ProductSku;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * ClassName: ProductFeignClient
 * Description:
 *
 * @Author Refactoring
 * Create 2024/8/16 下午8:59
 * Version 1.8
 */

@FeignClient(value = "service-product")
public interface ProductFeignClient {

    @GetMapping("/api/product/getBySkuId/{skuId}")
    public ProductSku getBySkuId(@PathVariable("skuId") Long skuId);

}
