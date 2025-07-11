import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {
	private final ItemService service;

	public ItemController(ItemService service) {
		this.service = service;
	}

	@GetMapping
	public List<Item> getItems() {
		return service.getAllItems();
	}
}