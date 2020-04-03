package com.zxc.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "sap_product", schema = "saperp")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PNO")
    private Integer no;
    @Column(name = "PCODE")
    private String code;
    @Column(name = "PNAME")
    private String name;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Column(name = "PDATE")
    private Date date;
    @Column(name = "UNITPRICE")
    private Double unitPrice;
    @Column(name = "QTYInStock")
    private Double qtyInStock;
}
