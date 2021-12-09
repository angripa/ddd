package ddd.sample.domain.repository;

import ddd.sample.domain.model.Order;
import ddd.sample.domain.model.Product;

import java.util.List;
import java.util.Optional;

public interface OrderRepository {
   Optional<Order> findById(Long id);

   Order create(List<Product> productList);
}
