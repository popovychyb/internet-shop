package com.internet.shop;

import com.internet.shop.lib.Injector;
import com.internet.shop.model.Product;
import com.internet.shop.service.ProductService;

import java.math.BigDecimal;

public class Application {
    private static Injector injector = Injector.getInstance("com.internet.shop");

    public static void main(String[] args) {
        final ProductService productService =
                (ProductService) injector.getInstance(ProductService.class);

        System.out.println(" Create products: ");
        Product iphone11 = productService.create(new Product("Iphone 11", 1200));
        Product iphoneX = productService.create(new Product("Iphone X", 1000));
        productService.getAll().forEach(System.out::println);

        System.out.println(" Get product by id 1: ");
        System.out.println(productService.get(1L));
        System.out.println(productService.get(iphone11.getId()));

        System.out.println(" Update price of product id 1, all: ");
        iphone11.setPrice(BigDecimal.valueOf(5000));
        productService.update(iphone11);
        productService.getAll().forEach(System.out::println);

        System.out.println(" Delete product iphoneX, all: ");
        productService.delete(iphoneX.getId());
        productService.getAll().forEach(System.out::println);
    }

}
