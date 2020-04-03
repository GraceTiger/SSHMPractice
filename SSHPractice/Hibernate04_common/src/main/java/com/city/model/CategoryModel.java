package com.city.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "productcategory")
public class CategoryModel implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "GNO")
    private Integer no;

    @Basic
    @Column(name = "GNAME")
    private String name;

    //一对多映射
    @OneToMany(mappedBy = "category",cascade = {CascadeType.REMOVE},fetch = FetchType.EAGER)
    private Set<ProductModel> products;

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

    public Set<ProductModel> getProducts() {
        return products;
    }

    public void setProducts(Set<ProductModel> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "CategoryModel{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
