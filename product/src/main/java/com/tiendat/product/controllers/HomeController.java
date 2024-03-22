package com.tiendat.product.controllers;
import com.tiendat.product.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {
    @Autowired
    private Environment env;


    @RequestMapping("/service01")
    public List<Product> getImages() {
        List<Product> products = Arrays.asList(
                new Product(1, "Product1", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3842005760"),
                new Product(2, "Product2", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272"),
                new Product(3, "Product3", "https://www.imdb.com/title/tt0096697/mediaviewer/rm1445594112"));
        return products;
    }
}
