package com.zxc.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "product")
public class Product implements Serializable {
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

    //多对一映射
    @ManyToOne
    @JoinColumn(name = "GNO")
    private Category category;
}
