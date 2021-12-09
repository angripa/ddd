package ddd.sample.domain.service;

import ddd.sample.domain.model.Order;
import ddd.sample.domain.model.Product;
import ddd.sample.domain.repository.OrderRepository;

import java.util.List;

public class DomainOrderService implements OrderService {
   private final OrderRepository orderRepository;

   public DomainOrderService(final OrderRepository orderRepository) {
      this.orderRepository = orderRepository;
   }

   @Override
   public Order createOrder(List<Product> productList) {
      return orderRepository.create(productList);
   }
}
