package com.lambdaschool.crudyrestaurants.model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "restaurant")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long restaurantid;

    @Column(unique = true, nullable = false)
    private String name;

    private String address;
    private String city;
    private String state;
    private String telephone;

    @OneToMany(mappedBy = "restaurant",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private ArrayList<Menu> menus = new ArrayList<>();
}
