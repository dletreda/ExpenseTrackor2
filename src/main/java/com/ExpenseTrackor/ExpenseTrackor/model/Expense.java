package com.ExpenseTrackor.ExpenseTrackor.model;

 
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "expense_id")
    private int expenseId;

    @ManyToOne
    @JoinColumn(name = "user_Id" )
    private User user;

    @ManyToOne
    @JoinColumn(name = "catagory_Id" )
    private Catagory catagory;
    
    
   
    private int amount;
    @Temporal(TemporalType.DATE)
 
    @JsonFormat(pattern = "MM/dd/yyyy")
    @Column(name = "date" )
    private Date date;

    @Column(name = "description")
    private String description;

  

    public Expense() {
		super();
	}

	public Expense(int expenseId, User user, Catagory catagory, int amount, Date date, String description) {
		super();
		this.expenseId = expenseId;
		this.user = user;
		this.catagory = catagory;
		this.amount = amount;
		this.date = date;
		this.description = description;
	}

	public Integer getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(Integer expenseId) {
        this.expenseId = expenseId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Catagory getCatagory() {
        return catagory;
    }

    public void setCatagory(Catagory catagory) {
        this.catagory = catagory;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
