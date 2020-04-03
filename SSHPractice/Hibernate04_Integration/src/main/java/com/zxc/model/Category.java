package com.zxc.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@Entity
@Table(name = "productcategory")
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "GNO")
    private Integer no;

    @Basic
    @Column(name = "GNAME")
    private String name;

    //一对多映射
    @OneToMany(mappedBy = "category",cascade = {CascadeType.REMOVE})
    private Set<Product> products;

}
