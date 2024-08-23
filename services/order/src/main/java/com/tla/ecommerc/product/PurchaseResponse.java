package com.tla.ecommerc.product;

import java.math.BigDecimal;

public record PurchaseResponse(
        Integer productId,

        String name,

        String description,

        BigDecimal price,

        double quantity

) {
}
