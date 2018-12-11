package com.github.ovchingus.model;

import javax.persistence.*;

@Entity
@Table(name = "Stocks")
public class Stocks {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ProductID")
    private Integer productId;

    @Column(name = "Qty")
    private Integer qty;

    public Stocks() {
    }

    public Stocks(int qty) {
        this.qty = qty;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
