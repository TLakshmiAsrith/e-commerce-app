package com.tla.ecommerc.orderLine;

public record OrderLineRequest(
        Integer id,
        Integer orderId,
        Integer productId ,
        double quantity) {
}
