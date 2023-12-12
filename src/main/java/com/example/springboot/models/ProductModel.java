package com.example.springboot.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_PRODUCTS")
public class ProductModel implements Serializable {

     private static final long serialVersionUID = 1L;

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private UUID idProduct;

     public UUID getIdProduct() {
          return idProduct;
     }

     public void setIdProduct(UUID idProduct) {
          this.idProduct = idProduct;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     private String name;

     public BigDecimal getValue() {
          return value;
     }

     private String productDescription;

     public String getProductDescription() {
          return productDescription;
     }

     public void setProductDescription(String productDescription) {
          this.productDescription = productDescription;
     }

     public void setValue(BigDecimal value) {
          this.value = value;
     }

     private BigDecimal value;
}
