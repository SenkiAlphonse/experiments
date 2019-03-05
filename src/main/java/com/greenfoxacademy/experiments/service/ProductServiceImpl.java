package com.greenfoxacademy.experiments.service;

import com.greenfoxacademy.experiments.model.BulkProduct;
import com.greenfoxacademy.experiments.model.IdentifiedProduct;
import com.greenfoxacademy.experiments.model.Product;
import com.greenfoxacademy.experiments.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

  private ProductRepository productRepo;

  @Autowired
  public ProductServiceImpl(ProductRepository productRepo){
    this.productRepo = productRepo;
  }

  @Override
  public List<Product> getAll() {
    return productRepo.findAll();
  }

  @Override
  public void addBulkProduct(BulkProduct bulkProduct) {
    productRepo.save(bulkProduct);
  }

  @Override
  public void addIdentifiedProduct(IdentifiedProduct identifiedProduct) {
    productRepo.save(identifiedProduct);
  }

  @Override
  public void addArticleToIdentifiedProductGroup() {

  }
}
