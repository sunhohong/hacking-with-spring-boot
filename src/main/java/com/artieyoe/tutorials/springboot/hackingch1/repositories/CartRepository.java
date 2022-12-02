package com.artieyoe.tutorials.springboot.hackingch1.repositories;

import com.artieyoe.tutorials.springboot.hackingch1.models.Cart;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CartRepository extends ReactiveCrudRepository<Cart, String> {

}
