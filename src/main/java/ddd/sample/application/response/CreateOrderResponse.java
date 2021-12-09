package ddd.sample.application.response;

import ddd.sample.domain.model.Product;

import java.util.List;

public class CreateOrderResponse {
   Long id;
   private List<Product> productList;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public List<Product> getProductList() {
      return productList;
   }

   public void setProductList(List<Product> productList) {
      this.productList = productList;
   }
}
