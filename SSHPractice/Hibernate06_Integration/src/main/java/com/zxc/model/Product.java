package com.zxc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.bind.PrintConversionEvent;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
    private Double price;

    @Basic
    @Column(name = "QTY")
    private Integer qty;

    //多对一映射
    @ManyToOne
    @JoinColumn(name = "GNO")
    private Category category;
}
