package ddd.sample.application.rest;

import ddd.sample.application.request.CreateOrderRequest;
import ddd.sample.application.response.CreateOrderResponse;
import ddd.sample.domain.model.Order;
import ddd.sample.domain.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
   private final OrderService orderService;

   @Autowired
   public OrderController(OrderService orderService) {
      this.orderService = orderService;
   }

   @PostMapping
   CreateOrderResponse createOrder(@RequestBody final CreateOrderRequest createOrderRequest) {
      Order order = orderService.createOrder(createOrderRequest.getProductList());
      return null;

   }
}
