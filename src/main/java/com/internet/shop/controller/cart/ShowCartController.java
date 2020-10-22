package com.internet.shop.controller.cart;

import com.internet.shop.lib.Injector;
import com.internet.shop.model.Product;
import com.internet.shop.service.ShoppingCartService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ShowCartController extends HttpServlet {
    private static final Long USER_ID = 1L;
    private static final Injector ingector = Injector.getInstance("com.internet.shop");
    private final ShoppingCartService shoppingCartService =
            (ShoppingCartService) ingector.getInstance(ShoppingCartService.class);


    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        List<Product> products = shoppingCartService.getByUserId(USER_ID).getProducts();
        req.setAttribute("products", products);
        req.getRequestDispatcher("/WEB-INF/views/cart/show.jsp").forward(req, resp);
    }
}
