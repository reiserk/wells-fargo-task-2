package com.example.demo.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    private String name;
    private String category;
    private Double purchPrice;
    private LocalDate purchDate;
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "portfolioId")
    private Portfolio portfolio;

    public Security() {}

    public Security(String name, String category, Double purchPrice, LocalDate purchDate, Integer quantity, Portfolio portfolio) {
        this.name = name;
        this.category = category;
        this.purchPrice = purchPrice;
        this.purchDate = purchDate;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }

    // Getters and setters
    public Long getSecurityId() { return securityId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public Double getPurchPrice() { return purchPrice; }
    public void setPurchPrice(Double purchPrice) { this.purchPrice = purchPrice; }
    public LocalDate getPurchDate() { return purchDate; }
    public void setPurchDate(LocalDate purchDate) { this.purchDate = purchDate; }
    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
    public Portfolio getPortfolio() { return portfolio; }
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
}
