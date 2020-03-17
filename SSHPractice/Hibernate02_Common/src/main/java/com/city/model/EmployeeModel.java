package com.city.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

//员工Model类
@Data
public class EmployeeModel implements Serializable {
	private String id=null;
	private String name=null;
	private String sex=null;
	private Date birthday=null;
	private Double salary=null;
}
