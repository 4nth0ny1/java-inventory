import jakarta.persistence.*;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String DPCI;
	private String Name;
	private String Description;
	private float Price;
	private String Floor_Aisle;
	private String Floor_Location;
	private String Backstock_Location;
	private String Department;
	private String Sub_Department;

	// Getter and Setters;
}