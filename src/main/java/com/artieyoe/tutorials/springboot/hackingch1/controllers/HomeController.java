package com.artieyoe.tutorials.springboot.hackingch1.controllers;

import com.artieyoe.tutorials.springboot.hackingch1.models.Cart;
import com.artieyoe.tutorials.springboot.hackingch1.repositories.CartRepository;
import com.artieyoe.tutorials.springboot.hackingch1.repositories.ItemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.result.view.Rendering;
import reactor.core.publisher.Mono;

@Controller
public class HomeController {

    private ItemRepository itemRepository;
    private CartRepository cartRepository;

    public HomeController(ItemRepository itemRepository, CartRepository cartRepository) {
        this.itemRepository = itemRepository;
        this.cartRepository = cartRepository;
    }

    @GetMapping
    Mono<Rendering> home() {

        return Mono.just(Rendering.view("home.html")
            .modelAttribute("items", itemRepository.findAll())
            .modelAttribute("cart", cartRepository.findById("My Cart")
                .defaultIfEmpty(new Cart("My Cart")))
            .build());
    }
}
