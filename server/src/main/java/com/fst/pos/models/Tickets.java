package com.fst.pos.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

@Document(collection = "tickets")
public class Tickets {
    @Id
    private String id;
    @CreatedDate
    public Date createdDate;
    private float total;
    @DBRef
    private List<Product> productlist;

    public Tickets() {
    }

    public Tickets(String id, float total, List<Product> productlist) {
        this.id = id;
        this.total = total;
        this.productlist = productlist;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public List<Product> getProductlist() {
        return productlist;
    }

    public void setProductlist(List<Product> productlist) {
        this.productlist = productlist;
    }
}
