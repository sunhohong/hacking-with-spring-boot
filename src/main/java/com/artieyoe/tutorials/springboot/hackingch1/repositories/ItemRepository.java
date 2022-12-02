package com.artieyoe.tutorials.springboot.hackingch1.repositories;

import com.artieyoe.tutorials.springboot.hackingch1.models.Item;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ItemRepository extends ReactiveCrudRepository<Item, String> {

}
