package com.imooc.product.exeception;

import lombok.Getter;

@Getter
public enum ExceptionCode {

    QUERY_PARAMS_ERROR(000001,"请求参数异常"),

    PRODUCT_IS_NULL_ERROR(000002,"请求参数异常"),

    STOCK_INSUFFICIENT_ERROR(000003,"请求参数异常"),

    DECR_PRODUCT_STOCK_ERROR(000004,"减去商品库存异常")

    ;


    private Integer errorCode;

    private String errorMsg;

    ExceptionCode(Integer errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
}
