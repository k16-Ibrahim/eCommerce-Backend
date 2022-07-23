package com.example.ecommerce.entity;



import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="product_category")
//@Data
@Getter
@Setter
public class ProductCategory {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="category_name")
    private String category_name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Product> productSet;


}
