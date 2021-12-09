package ddd.sample.application.request;

import ddd.sample.domain.model.Product;

import java.util.List;

public class CreateOrderRequest {
   private List<Product> productList;

   public List<Product> getProductList() {
      return productList;
   }

   public void setProductList(List<Product> productList) {
      this.productList = productList;
   }
}
