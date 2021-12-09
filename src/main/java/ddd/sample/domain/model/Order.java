package ddd.sample.domain.model;

import ddd.sample.domain.OrderStatus;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order extends BaseEntity{

   @Enumerated(EnumType.STRING)
   OrderStatus status;

   @OneToMany(cascade = CascadeType.PERSIST, targetEntity = Product.class)
   List<Product> productList = new ArrayList<>();

   public OrderStatus getStatus() {
      return status;
   }

   public void setStatus(OrderStatus status) {
      this.status = status;
   }

   public List<Product> getProductList() {
      return productList;
   }

   public void setProductList(List<Product> productList) {
      this.productList = productList;
   }
}
