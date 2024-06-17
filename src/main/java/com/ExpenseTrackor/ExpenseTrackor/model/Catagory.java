package com.ExpenseTrackor.ExpenseTrackor.model;

import javax.persistence.*;

@Entity
@Table(name = "Categories")  
public class Catagory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")  
    private int catagoryId;

    @Column(name = "category_name")  
    private String catagoryName;
 
    public Catagory() {
        
    }

    public Catagory(int catagoryId, String catagoryName) {
        this.catagoryId = catagoryId;
        this.catagoryName = catagoryName;
    }

    public int getCatagoryId() {
        return catagoryId;
    }

    public void setCatagoryId(int catagoryId) {
        this.catagoryId = catagoryId;
    }

    public String getCatagoryName() {
        return catagoryName;
    }

    public void setCatagoryName(String catagoryName) {
        this.catagoryName = catagoryName;
    }
}
