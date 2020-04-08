package com.zxc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "productcategory")
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "GNO")
    private Integer no;

    @Basic
    @Column(name = "GNAME")
    private String name;

    @ToString.Exclude //排除在ToString方法外，避免循环调用
    //一对多映射
    @OneToMany(mappedBy = "category",cascade = {CascadeType.REMOVE})
    private Set<Product> products;

}
