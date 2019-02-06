package com.imooc.design.pattern.structural.proxy;

/**
 * @author youyusong
 * @date 2019/2/5
 */
public class Order {

    private Object orderInfo;

    private Integer userId;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}