package com.city.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "sap_product", schema = "saperp")
public class ProductModel implements Serializable {
    private Integer no;
    private String code;
    private String name;
    private Date date;
    private Double unitPrice;
    private Double qtyInStock;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PNO")
    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    @Basic
    @Column(name = "PCODE")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "PNAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "PDATE")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "UNITPRICE")
    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Basic
    @Column(name = "QTYInStock")
    public Double getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(Double qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductModel that = (ProductModel) o;
        return no == that.no &&
                Objects.equals(code, that.code) &&
                Objects.equals(name, that.name) &&
                Objects.equals(date, that.date) &&
                Objects.equals(unitPrice, that.unitPrice) &&
                Objects.equals(qtyInStock, that.qtyInStock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, code, name, date, unitPrice, qtyInStock);
    }
}
