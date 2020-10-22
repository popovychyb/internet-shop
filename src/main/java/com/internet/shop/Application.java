package com.internet.shop;

import com.internet.shop.lib.Injector;
import com.internet.shop.model.Product;
import com.internet.shop.model.User;
import com.internet.shop.service.OrderService;
import com.internet.shop.service.ProductService;
import com.internet.shop.service.ShoppingCartService;
import com.internet.shop.service.UserService;

import java.math.BigDecimal;

public class Application {
    private static final Injector injector = Injector.getInstance("com.internet.shop");

    public static void main(String[] args) {
        final ProductService productService =
                (ProductService) injector.getInstance(ProductService.class);
        final UserService userService =
                (UserService) injector.getInstance(UserService.class);
        final ShoppingCartService shoppingCartService =
                (ShoppingCartService) injector.getInstance(ShoppingCartService.class);
        final OrderService orderService =
                (OrderService) injector.getInstance(OrderService.class);

        System.out.println(" Create products: ");
        Product iphone11 = productService.create(new Product("Iphone 11", 1200));
        Product iphoneX = productService.create(new Product("Iphone X", 1000));
        Product iphoneCE = productService.create(new Product("Iphone CE", 1500));
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

        System.out.println("\n Create users: ");
        User ivan = userService.create(new User("Ivan", "ivanlog", "12345"));
        User lena = userService.create(new User("Lena", "lenalog", "qwerty"));
        userService.getAll().forEach(System.out::println);

        System.out.println(" Get user by id 1 and 2: ");
        System.out.println(userService.get(1L));
        System.out.println(userService.get(lena.getId()));

        System.out.println(" Update name of user id 1, all: ");
        ivan.setName("New Ivan");
        userService.update(ivan);
        userService.getAll().forEach(System.out::println);

        System.out.println(" Delete user Lena, all: ");
        userService.delete(lena.getId());
        userService.getAll().forEach(System.out::println);

//        System.out.println("\n Create shopping cart for Ivan add product: ");
//        ShoppingCart shoppingCart =
//                shoppingCartService.create(new ShoppingCart(new ArrayList<>(), 1L));
//        shoppingCartService.addProduct(shoppingCart, iphone11);
//        shoppingCartService.addProduct(shoppingCart, iphoneCE);
//        shoppingCartService.getAll().forEach(System.out::println);
//
//        System.out.println(" Delete iphone11 from shopping cart, all: ");
//        shoppingCartService.deleteProduct(shoppingCart, iphone11);
//        shoppingCartService.getAll().forEach(System.out::println);
//
//        System.out.println(" Get shopping cart user by id 1:");
//        System.out.println(shoppingCartService.getByUserId(1L));
//
//        System.out.println(" Clear shopping cart:");
//        shoppingCartService.clear(shoppingCart);
//        shoppingCartService.getAll().forEach(System.out::println);
//
//        System.out.println(" Delete shopping cart, all:");
//        shoppingCartService.delete(1L);
//        shoppingCartService.getAll().forEach(System.out::println);
//
//        System.out.println("\n Create order for Ivan: ");
//        ShoppingCart shoppingCartIvan =
//                shoppingCartService.create(new ShoppingCart(new ArrayList<>(), 1L));
//        shoppingCartService.addProduct(shoppingCartIvan, iphone11);
//        shoppingCartService.addProduct(shoppingCartIvan, iphoneCE);
//        orderService.completeOrder(shoppingCartIvan);
//        orderService.getAll().forEach(System.out::println);

        System.out.println(" Get User Orders: ");
        orderService.getUserOrders(1L).forEach(System.out::println);

        System.out.println(" Get Order by id: ");
        System.out.println(orderService.get(1L));

        System.out.println(" Delete Order by id: ");
        orderService.delete(1L);
        orderService.getAll().forEach(System.out::println);
    }
}
