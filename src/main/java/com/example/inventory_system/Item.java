package com.example.inventory_system;

import jakarta.persistence.*;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dpci;
    private String name;
    private String description;
    private float price;
    private String floorAisle;
    private String floorLocation;
    private String backstockLocation;
    private String department;
    private String subDepartment;

    // Getters
    public Long getId() { return id; }
    public String getDpci() { return dpci; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public float getPrice() { return price; }
    public String getFloorAisle() { return floorAisle; }
    public String getFloorLocation() { return floorLocation; }
    public String getBackstockLocation() { return backstockLocation; }
    public String getDepartment() { return department; }
    public String getSubDepartment() { return subDepartment; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setDpci(String dpci) { this.dpci = dpci; }
    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setPrice(float price) { this.price = price; }
    public void setFloorAisle(String floorAisle) { this.floorAisle = floorAisle; }
    public void setFloorLocation(String floorLocation) { this.floorLocation = floorLocation; }
    public void setBackstockLocation(String backstockLocation) { this.backstockLocation = backstockLocation; }
    public void setDepartment(String department) { this.department = department; }
    public void setSubDepartment(String subDepartment) { this.subDepartment = subDepartment; }

}