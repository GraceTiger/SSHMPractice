package com.zxc.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.mapping.Constraint;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "erp_productpackaging", schema = "cityerp")
public class Packaging {
    @Id
    //外键策略模式，取值和Product类主键相同
    @GenericGenerator(
            name = "PNO_PK_GEN",
            strategy = "foreign",
            parameters = {
                    @org.hibernate.annotations.Parameter(
                            name = "property",
                            value = "product"
                    )})
    @GeneratedValue(generator = "PNO_PK_GEN")
    @Column(name = "PNO")
    private Integer no;
    @Basic
    @Column(name = "PTYPE")
    private String type;
    @Basic
    @Column(name = "PSIZE")
    private Integer size;

    //一对一关联(共享主键模式)
    @OneToOne
    @PrimaryKeyJoinColumn
    private Product product;

}
