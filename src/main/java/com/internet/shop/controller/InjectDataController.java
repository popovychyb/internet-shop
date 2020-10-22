package com.internet.shop.controller;

import com.internet.shop.lib.Injector;
import com.internet.shop.model.Product;
import com.internet.shop.model.ShoppingCart;
import com.internet.shop.model.User;
import com.internet.shop.service.ProductService;
import com.internet.shop.service.ShoppingCartService;
import com.internet.shop.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class InjectDataController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("com.internet.shop");
    private final UserService userService = (UserService) injector.getInstance(UserService.class);
    private final ProductService productService = (ProductService) injector.getInstance(ProductService.class);
    private final ShoppingCartService shoppingCartService = (ShoppingCartService) injector.getInstance(ShoppingCartService.class);


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        userService.create(new User("Ivan", "ivanlog", "12345"));
        userService.create(new User("Lena", "lenalog", "qwerty"));
        productService.create(new Product("BMW M3", 30000));
        productService.create(new Product("AUDI A4", 45000));
        shoppingCartService.create(new ShoppingCart(1L));
        req.getRequestDispatcher("/WEB-INF/views/injectData.jsp")
                .forward(req, resp);
    }
}
