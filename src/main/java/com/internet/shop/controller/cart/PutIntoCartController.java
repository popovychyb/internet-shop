package com.internet.shop.controller.cart;

import com.internet.shop.lib.Injector;
import com.internet.shop.service.ProductService;
import com.internet.shop.service.ShoppingCartService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PutIntoCartController extends HttpServlet {
    private static final Long USER_ID = 1L;

    private static final Injector injector = Injector.getInstance("com.internet.shop");
    private final ShoppingCartService shoppingCartService =
            (ShoppingCartService) injector.getInstance(ShoppingCartService.class);
    private final ProductService productService =
            (ProductService) injector.getInstance(ProductService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
//        ShoppingCart shoppingCart = shoppingCartService.getByUserId(USER_ID);
//        String productId = req.getParameter("id");
//        Product product = productService.get(Long.valueOf(productId));
//        shoppingCartService.addProduct(shoppingCart, product);
//        resp.sendRedirect(req.getContextPath() + "/");

        shoppingCartService.addProduct(shoppingCartService.getByUserId(USER_ID),
                productService.get(Long.parseLong(req.getParameter("id"))));
        resp.sendRedirect(req.getContextPath() + "/product/all");
    }
}
