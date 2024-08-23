package com.tla.ecommerc.payment;

import com.tla.ecommerc.customer.CustomerResponse;
import com.tla.ecommerc.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer

) {
}
