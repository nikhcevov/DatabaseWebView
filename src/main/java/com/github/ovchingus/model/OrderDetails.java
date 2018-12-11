package com.github.ovchingus.model;

import javax.persistence.*;

@Entity
@Table(name = "OrderDetails")
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "OrderID")
    private Integer orderId;

    @Column(name = "LineItem")
    private Integer lineItem;

    @Column(name = "ProductID")
    private Integer productId;

    @Column(name = "Qty")
    private Integer qty;

    @Column(name = "Price")
    private Double price;

    @Column(name = "TotalPrice")
    private Double totalPrice;

    public OrderDetails() {
    }

    public OrderDetails(int lineItem, int productId,
                        int qty, Double price, Double totalPrice) {
        this.lineItem = lineItem;
        this.productId = productId;
        this.qty = qty;
        this.price = price;
        this.totalPrice = totalPrice;
    }

    public OrderDetails(int orderId, int lineItem,
                        int productId, int qty, Double price,
                        Double totalPrice) {
        this.orderId = orderId;
        this.lineItem = lineItem;
        this.productId = productId;
        this.qty = qty;
        this.price = price;
        this.totalPrice = totalPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getLineItem() {
        return lineItem;
    }

    public void setLineItem(int lineItem) {
        this.lineItem = lineItem;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
