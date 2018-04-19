package org.nav.solution.serviceImpl;

import org.nav.solution.model.Product;
import org.nav.solution.service.ProductService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    public void insert(Product product) {

    }
}
