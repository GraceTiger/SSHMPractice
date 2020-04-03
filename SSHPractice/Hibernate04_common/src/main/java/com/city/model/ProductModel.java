package com.city.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "product")
public class ProductModel implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "PNO")
    private Integer no;

    @Basic
    @Column(name = "PNAME")
    private String name;

    @Basic
    @Column(name = "Price")
    private String price;

    @Basic
    @Column(name = "QTY")
    private Integer qty;

    @ManyToOne
    @JoinColumn(name = "GNO")
    private CategoryModel category;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public CategoryModel getCategory() {
        return category;
    }

    public void setCategory(CategoryModel category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", qty=" + qty +
                ", category=" + category +
                '}';
    }
}
