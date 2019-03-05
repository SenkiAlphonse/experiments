package com.greenfoxacademy.experiments.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "identified_products")
public class IdentifiedProduct extends Product {
}
