package com.example.inventory_system;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class PageController {

    private final ItemService itemService;

    public PageController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/items") // Not /api/items
    public String showItemsPage(Model model) {
        List<Item> items = itemService.getAllItems();
        model.addAttribute("items", items);
        return "items"; // renders src/main/resources/templates/items.html
    }
}
