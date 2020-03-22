package com.zxc.model;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "employee")
public class Employee implements Serializable {
    @Id
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SEX")
    private String sex;
    @Column(name = "AGE")
    private Integer age;
    @Column(name = "BIRTHDAY")
    private Date birthday;
    @Column(name = "SALARY")
    private BigDecimal salary;
}
