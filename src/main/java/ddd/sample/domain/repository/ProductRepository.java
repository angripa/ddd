package ddd.sample.domain.repository;

import ddd.sample.domain.model.Product;

import java.util.Optional;

public interface ProductRepository {
   Optional<Product> findById(Long id);

   void create(Product order);
}
