package com.tla.ecommerce.email;

import lombok.*;

public enum EmailTemplates {

    PAYMENT_CONFIRMATION("payment-confirmation.html", "Payment Successfully processed"),
    ORDER_CONFIRMATION("order-confirmation.html","Order confirmation");

    @Getter
    private String template;

    @Getter
    private String subject;

    EmailTemplates(String template, String subject) {
        this.template = template;
        this.subject = subject;
    }
}
