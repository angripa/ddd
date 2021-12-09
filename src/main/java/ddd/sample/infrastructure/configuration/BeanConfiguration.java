package ddd.sample.infrastructure.configuration;

import ddd.sample.DddSampleApplication;
import ddd.sample.domain.repository.OrderRepository;
import ddd.sample.domain.service.DomainOrderService;
import ddd.sample.domain.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = DddSampleApplication.class)
public class BeanConfiguration {

   @Bean
   OrderService orderService(final OrderRepository orderRepository) {
      return new DomainOrderService(orderRepository);
   }
}
