package com.city.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "info_employee", schema = "cityinfo")
public class EmployeeModel {
    @Id
    @Column(name = "EID")
    private String id;

    @Basic
    @Column(name = "ENAME")
    private String name;

    @Basic
    @Column(name = "SEX")
    private String sex;

    @Basic
    @Column(name = "BIRTHDAY")
    private Date birthday;

    @Basic
    @Column(name = "JOINDATE")
    private Date joinDate;

    @Basic
    @Column(name = "CARDID")
    private String cardId;
}
