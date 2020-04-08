package com.zxc.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "erp_products", schema = "cityerp")
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "PNO")
    private Integer no;

    @Column(name = "PNAME")
    private String name;

    @Column(name = "PDATE")
    //日期类型转换
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date date;

    @Column(name = "UNITPRICE")
    private Integer unitPrice;

    @Column(name = "QTY")
    private Integer qty;

    //多对多映射
    @ManyToMany
    @JoinTable(
            name = "erp_productarea",
            joinColumns = {@JoinColumn(name = "PNO",referencedColumnName = "PNO")},
            inverseJoinColumns = {@JoinColumn(name = "ANO",referencedColumnName = "ANO")}
    )
    private List<Area> areas;

    //一对一映射(共享主键模式)
    @OneToOne(mappedBy = "product",cascade = {CascadeType.ALL})
    private Packaging packaging;//外键关联的区域
}
