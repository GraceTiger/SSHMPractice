package com.zxc.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@Table(name = "erp_areas", schema = "cityerp")
public class Area {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ANO")
    private Integer no;
    @Basic
    @Column(name = "ANAME")
    private String name;
    //多对多映射
    @ManyToMany(mappedBy = "areas")
    private List<Product> products;
}
