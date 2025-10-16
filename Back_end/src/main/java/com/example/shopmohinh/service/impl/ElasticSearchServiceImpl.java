//package com.example.shopmohinh.service.impl;
//
//import com.example.shopmohinh.entity.Product;
//import com.example.shopmohinh.entity.elasticsearch.ProductSearchEntity;
//import com.example.shopmohinh.repository.elasticsearch.ProductSearchRepository;
//import com.example.shopmohinh.service.ElasticSearchService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class ElasticSearchServiceImpl implements ElasticSearchService {
//    ProductSearchRepository searchRepository;
//
//    @Override
//    public void saveSearchProducts(Product product){
//        ProductSearchEntity productSearch = new ProductSearchEntity();
//        productSearch.setCode(product.getCode());
//        productSearch.setName(product.getName());
//        productSearch.setCreatedDate(product.getCreatedDate());
//        searchRepository.save(productSearch);
//    }
//
//    @Override
//    public void delete(Product product){
//        ProductSearchEntity deleteProduct = searchRepository.findByCode(product.getCode());
//        if (deleteProduct != null) {
//            searchRepository.delete(deleteProduct);
//        }
//    }
//
//    public void updateByProjectSearch(Product product){
//        ProductSearchEntity search = searchRepository.findByCode(product.getCode());
//        if (search != null) {
//            search.setCode(product.getCode());
//            search.setName(product.getName());
//            search.setCreatedDate(product.getCreatedDate());
//            searchRepository.save(search);
//        }else{
//            ProductSearchEntity newSearch = new ProductSearchEntity();
//            newSearch.setCode(product.getCode());
//            newSearch.setName(product.getName());
//            newSearch.setCreatedDate(product.getCreatedDate());
//            searchRepository.save(newSearch);
//        }
//    }
//
//
//
//
//}
