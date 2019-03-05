package com.greenfoxacademy.experiments.controller;

import com.greenfoxacademy.experiments.model.BulkProduct;
import com.greenfoxacademy.experiments.model.IdentifiedProduct;
import com.greenfoxacademy.experiments.model.Product;
import com.greenfoxacademy.experiments.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductRESTController {

  private ProductService productService;

  @Autowired
  public ProductRESTController (ProductService productService){
    this.productService = productService;
  }

  @GetMapping("/products")
  public ResponseEntity<List<Product>> listProducts(@RequestParam(value="searchterm", required = false) String searchterm){
    return new ResponseEntity<>(productService.getAll(), HttpStatus.OK);
  }

  @PostMapping(path = "/products/bulk")
  public void addBulkProduct(@RequestBody ProductDto productDto){
    BulkProduct newProduct = new BulkProduct();
    newProduct.setName(productDto.name);
    newProduct.setNetPice(productDto.netPrice);
    newProduct.setStock(productDto.stock);
    productService.addBulkProduct(newProduct);
  }

  @PostMapping(path = "/products/identity")
  public void addIdentifiedProduct(@RequestBody ProductDto productDto){
    IdentifiedProduct newProduct = new IdentifiedProduct();
    newProduct.setName(productDto.name);
    newProduct.setNetPice(productDto.netPrice);
    newProduct.setStock(productDto.stock);
    productService.addIdentifiedProduct(newProduct);
  }
}
