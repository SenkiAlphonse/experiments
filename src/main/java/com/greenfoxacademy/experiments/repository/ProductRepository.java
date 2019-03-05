package com.greenfoxacademy.experiments.repository;

import com.greenfoxacademy.experiments.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
  List<Product> findAll();
}
