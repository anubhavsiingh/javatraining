package com.coforge.training.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coforge.training.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
	
	List<Item> findAllItemsByUserId(Long userId);
}
