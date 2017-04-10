package com.mycompany.services;

import com.mycompany.config.JpaIntegrationConfig;
import com.mycompany.domain.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by jt on 12/14/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("jpadao")
public class ProductServiceJapDaoImplTest {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @Test
    public void testListMethod() throws Exception {

        List<Product> products = (List<Product>) productService.listAll();

        assert products.size() == 5;

    }
}
