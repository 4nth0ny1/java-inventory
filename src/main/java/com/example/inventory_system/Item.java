import jakarta.persistence.*;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private int quantity;

	// Getter and Setters;
}