package com.example.inventory_system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RootController {
	@GetMapping("/")
	public String home() {
		return "Inventory API is running. Try /api/items";
	}
}