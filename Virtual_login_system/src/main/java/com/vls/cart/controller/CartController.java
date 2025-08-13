package com.vls.cart.controller;

import com.vls.cart.model.CartModel;
import com.vls.cart.service.CartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/** Endpoints for in-memory cart operations. */
@RestController
@RequestMapping("/api/cart")
public class CartController {

    private final CartService cartService;
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    /** GET /api/cart */
    @GetMapping
    public ResponseEntity<List<CartModel>> listCart() {
        return ResponseEntity.ok(cartService.getAll());
    }

    /** POST /api/cart/add/{courseId} */
    @PostMapping("/add/{courseId}")
    public ResponseEntity<CartModel> add(@PathVariable Integer courseId) {
        return ResponseEntity.ok(cartService.addCourse(courseId));
    }

    /** DELETE /api/cart/{courseId} */
    @DeleteMapping("/{courseId}")
    public ResponseEntity<Void> remove(@PathVariable Integer courseId) {
        cartService.removeCourse(courseId);
        return ResponseEntity.noContent().build();
    }

    /** DELETE /api/cart/clear */
    @DeleteMapping("/clear")
    public ResponseEntity<Void> clear() {
        cartService.clear();
        return ResponseEntity.noContent().build();
    }
}
