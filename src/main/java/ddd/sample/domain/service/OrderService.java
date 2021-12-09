package ddd.sample.domain.service;

import ddd.sample.domain.model.Order;
import ddd.sample.domain.model.Product;

import java.util.List;

public interface OrderService {
   Order createOrder(List<Product> productList);
}
