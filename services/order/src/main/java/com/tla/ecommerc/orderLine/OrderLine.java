package com.tla.ecommerc.orderLine;

import com.tla.ecommerc.order.Order;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "customer_line")
public class OrderLine {
    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne
    @JoinColumn(name= "order_id")
    private Order order;
    private Integer productId;
    private double quantity;
}
