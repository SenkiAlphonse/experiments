package com.greenfoxacademy.experiments.service;

import com.greenfoxacademy.experiments.model.BulkProduct;
import com.greenfoxacademy.experiments.model.IdentifiedProduct;
import com.greenfoxacademy.experiments.model.Product;

import java.util.List;

public interface ProductService {
  List<Product> getAll();
  void addBulkProduct(BulkProduct bulkProduct);
  void addIdentifiedProduct(IdentifiedProduct identifiedProduct);
  void addArticleToIdentifiedProductGroup();
}

