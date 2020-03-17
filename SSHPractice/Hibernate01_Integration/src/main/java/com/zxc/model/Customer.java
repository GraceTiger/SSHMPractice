package com.zxc.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "customer", schema = "citymis")
public class Customer implements Serializable {
    private Integer no;
    private String code;
    private String name;
    private Integer staffNum;
    private Date createDate;
    private Double yearSales;
    private String address;
    private String tel;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CNO")
    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    @Basic
    @Column(name = "CCODE")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "CNAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "STAFFNUM")
    public Integer getStaffNum() {
        return staffNum;
    }

    public void setStaffNum(Integer staffNum) {
        this.staffNum = staffNum;
    }

    @Basic
    @Column(name = "CREATEDATE")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "YEARSALES")
    public Double getYearSales() {
        return yearSales;
    }

    public void setYearSales(Double yearSales) {
        this.yearSales = yearSales;
    }

    @Basic
    @Column(name = "ADDRESS")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "TEL")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer that = (Customer) o;
        return Objects.equals(no, that.no) &&
                Objects.equals(code, that.code) &&
                Objects.equals(name, that.name) &&
                Objects.equals(staffNum, that.staffNum) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(yearSales, that.yearSales) &&
                Objects.equals(address, that.address) &&
                Objects.equals(tel, that.tel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, code, name, staffNum, createDate, yearSales, address, tel);
    }
}
