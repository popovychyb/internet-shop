package com.internet.shop.controller;

import com.internet.shop.lib.Injector;
import com.internet.shop.model.User;
import com.internet.shop.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistrationController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("com.internet.shop");
    private final UserService userService = (UserService) injector.getInstance(UserService.class);


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/registration.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name = req.getParameter("name");
        String login = req.getParameter("login");
        String password = req.getParameter("pwd");
        String passwordRepeat = req.getParameter("pwd-repeat");

        if (password.equals(passwordRepeat)) {
            userService.create(new User(name, login, password));
            resp.sendRedirect(req.getContextPath() + "/");
        } else {
            req.setAttribute("message", "Password and repeat password aren't same");
            req.getRequestDispatcher("/WEB-INF/views/registration.jsp")
                    .forward(req, resp);
        }
    }
}
