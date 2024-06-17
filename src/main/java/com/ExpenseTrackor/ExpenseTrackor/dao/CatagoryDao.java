package com.ExpenseTrackor.ExpenseTrackor.dao;
 
 

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ExpenseTrackor.ExpenseTrackor.model.Catagory;

@Repository
public interface CatagoryDao extends CrudRepository <Catagory,Integer>{
 
	

}
