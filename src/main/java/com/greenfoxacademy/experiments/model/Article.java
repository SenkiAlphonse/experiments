package com.greenfoxacademy.experiments.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "unique_products")
public class Article extends IdentifiedProduct {

  private String artNr;

  public String getArtNr() {
    return artNr;
  }

  public void setArtNr(String artNr) {
    this.artNr = artNr;
  }
}
