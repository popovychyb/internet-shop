package com.internet.shop.dao;

import com.internet.shop.model.ShoppingCart;

import java.util.List;
import java.util.Optional;

public interface ShoppingCartDao {
    ShoppingCart create(ShoppingCart shoppingCart);

    Optional<ShoppingCart> get(Long id);

    ShoppingCart update(ShoppingCart shoppingCart);

    boolean delete(Long id);

    List<ShoppingCart> getAll();
}
