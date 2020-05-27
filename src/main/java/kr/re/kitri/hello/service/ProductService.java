package kr.re.kitri.hello.service;

import kr.re.kitri.hello.model.Product;
import org.springframework.stereotype.Service;


public interface ProductService {
    public String  retrieveProducts();
    public Product viewProductDetail(int i);
}
