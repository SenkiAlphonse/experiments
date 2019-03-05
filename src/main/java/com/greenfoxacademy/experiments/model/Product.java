package com.greenfoxacademy.experiments.model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String name;

  private Float netPice;
  private Integer stock;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Float getNetPice() {
    return netPice;
  }

  public void setNetPice(Float netPrice) {
    this.netPice = netPrice;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getStock() {
    return stock;
  }

  public void setStock(Integer stock) {
    this.stock = stock;
  }
}
