package com.example.shopmohinh.service;

import com.example.shopmohinh.entity.Product;

public interface ElasticSearchService {
    void saveSearchProducts(Product product);

    void delete(Product product);

    void updateByProjectSearch(Product product);
}
