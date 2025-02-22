package com.example.sistemaECommerce.API.services;

import com.example.sistemaECommerce.API.dtos.ProductDTO;

import java.util.List;

public interface ProductService {

    ProductDTO registerProduct(ProductDTO productDTO, String name);
    List<ProductDTO> getAllProducts();
    void deleteProduct(Long id);
}