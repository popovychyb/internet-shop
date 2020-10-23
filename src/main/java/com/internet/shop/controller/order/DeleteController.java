package com.internet.shop.controller.order;

import com.internet.shop.lib.Injector;
import com.internet.shop.service.OrderService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("com.internet.shop");
    private final OrderService orderService =
            (OrderService) injector.getInstance(OrderService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        orderService.delete(Long.valueOf(req.getParameter("id")));
        resp.sendRedirect(req.getContextPath() + "/order/allAdmin");
    }
}
