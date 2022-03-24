package com.coforge.training.service;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.training.controller.ItemRestController;
import com.coforge.training.model.Item;
import com.coforge.training.repositories.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {
	private Logger log = LoggerFactory.getLogger(ItemServiceImpl.class);
	
	@Autowired
	private ItemRepository itemRepo;
	
	@Override
	public List<Item> findAllItems() {
		log.info("Inside Item microservice - Service Implementation");
		return itemRepo.findAll();
	}

	@Override
	@Transactional
	public Item saveNewItem(Item item) {
		// TODO Auto-generated method stub
		return itemRepo.save(item);
	}

	@Override
	public List<Item> findAllItemsByUserId(Long id) {
		// TODO Auto-generated method stub
		return itemRepo.findAllItemsByUserId(id);
	}

}
