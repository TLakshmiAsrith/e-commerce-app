package com.tla.ecommerc.kafka;

import com.tla.ecommerc.customer.CustomerResponse;
import com.tla.ecommerc.order.PaymentMethod;
import com.tla.ecommerc.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod, CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
