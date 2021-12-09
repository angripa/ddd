package ddd.sample.infrastructure.repository;

import ddd.sample.domain.model.Order;
import ddd.sample.domain.model.Product;
import ddd.sample.domain.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MySqlOrderRepository implements OrderRepository {
   private final SpringDataOrderRepository orderRepository;

   @Autowired
   public MySqlOrderRepository(final SpringDataOrderRepository orderRepository) {
      this.orderRepository = orderRepository;
   }

   @Override
   public Optional<Order> findById(Long id) {
      return orderRepository.findById(id);
   }

   @Override
   public Order create(List<Product> productList) {
      return null;
   }
}
