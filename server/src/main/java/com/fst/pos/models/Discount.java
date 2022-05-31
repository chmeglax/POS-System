package com.fst.pos.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

@Document(collection = "discount")
public class Discount {
    private Date startDate;
    private Date endDate;
    private float percentage;
    @CreatedDate
    public Date createdDate;
    @DBRef
    private List<Product> products;

    public Discount() {
    }

    public Discount(Date startDate, Date endDate, float percentage, List<Product> products) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.percentage = percentage;
        this.products = products;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Product> getProducts() {
        return products;
    }
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
