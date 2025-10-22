package com.jpmc.midascore.model;

public class Balance {
    private Long id;
    private Double amount;

    public Balance() {
    }

    public Balance(Long id, Double amount) {
        this.id = id;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Balance{" +
                "id=" + id +
                ", amount=" + amount +
                '}';
    }
}