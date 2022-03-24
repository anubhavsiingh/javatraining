package com.coforge.training.service;

import java.util.List;

import com.coforge.training.model.Item;

public interface ItemService {
	public List<Item> findAllItems();

	Item saveNewItem(Item item);

	List<Item> findAllItemsByUserId(Long id);
}
