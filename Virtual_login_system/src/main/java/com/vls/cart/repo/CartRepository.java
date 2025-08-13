package com.vls.cart.repo;

import com.vls.cart.model.CartModel;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * In-memory store for a single moderator session (demo).
 * Uses LinkedHashMap to keep insertion order.
 */
@Repository
public class CartRepository {

    private final Map<Integer, CartModel> items = new LinkedHashMap<Integer, CartModel>();

    public List<CartModel> findAll() {
        return new ArrayList<CartModel>(items.values());
    }

    public Optional<CartModel> findByCourseId(Integer id) {
        return Optional.ofNullable(items.get(id));
    }

    public CartModel save(CartModel model) {
        items.put(model.getCourseId(), model);
        return model;
    }

    public void delete(Integer courseId) {
        items.remove(courseId);
    }

    public void clear() {
        items.clear();
    }

    public boolean exists(Integer courseId) {
        return items.containsKey(courseId);
    }
}
