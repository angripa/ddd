package ddd.sample.infrastructure.repository;

import ddd.sample.domain.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataOrderRepository extends JpaRepository<Order, Long>, CommonRepository<Order>  {
}
