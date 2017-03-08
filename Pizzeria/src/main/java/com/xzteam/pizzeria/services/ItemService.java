package com.xzteam.pizzeria.services;

import java.util.List;

import com.xzteam.pizzeria.domain.Bucket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xzteam.pizzeria.domain.Client;
import com.xzteam.pizzeria.domain.Item;
import com.xzteam.pizzeria.repository.ItemRepository;

@Service
public class ItemService {
	@Autowired
	ItemRepository itemRepository;
	
	public List<Item> getAll(){
		return itemRepository.findAll();
	}
}