package com.lambdaschool.crudyrestaurants.model;

import javax.persistence.*;

@Entity
@Table(name = "menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long menuid;

    @Column(nullable = false)
    private String dish;
    private double price;

    @ManyToOne
    @JoinColumn(name = "restaurantid", nullable = false)
    private Restaurant restaurant;
}
