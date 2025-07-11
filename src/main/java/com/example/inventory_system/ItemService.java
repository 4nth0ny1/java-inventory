package com.example.inventory_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;

@Service
public class ItemService {
	@Autowired
    private ItemRepository repository;

	public ItemService(ItemRepository repository) {
		this.repository = repository;
	}

	public List<Item> getAllItems() {
		return repository.findAll();
	}

    public Optional<Item> getOneItem(Long id) {
        return repository.findById(id);
    }
	
}
