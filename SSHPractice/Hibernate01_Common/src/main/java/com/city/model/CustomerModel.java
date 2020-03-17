package com.city.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//部门Model类
@Data
@Entity
@Table(name="customer")
public class CustomerModel implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CNO")
	private int no=0;
	@Column(name="CCODE")
	private String code=null;
	@Column(name="CNAME")
	private String name=null;
	@Column(name="STAFFNUM")
	private int num;
	@Column(name="CREATEDATE")
	private Date date;
	@Column(name="YEARSALES")
	private Double yearsales;
	@Column(name="Address")
	private String address;
	@Column(name="TEL")
	private String tel;
}
