package com.globant.project.foodAplication.model.product;

import com.globant.project.foodAplication.model.category.Category;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fantasy_name")
    private String fantasyName;

    private Category category;

    private String description;

    private String price;

    private Boolean available;

    @Column(unique = true,
            columnDefinition = "BINARY(16)")
    private UUID uuid;

    public Product() { this.uuid = UUID.randomUUID(); }

    public Long getId() {
        return id;
    }

    public String getFantasyName() {
        return fantasyName;
    }

    public Category getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public Boolean getAvailable() {
        return available;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFantasyName(String fantasyName) {
        this.fantasyName = fantasyName;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
