package com.ExpenseTrackor.ExpenseTrackor.service;

import java.util.List;
import java.util.Optional;

import com.ExpenseTrackor.ExpenseTrackor.model.Catagory;

public interface CatagoryService {

    Catagory saveCatagory(Catagory catagory);

    List<Catagory> getAllCatagories();

 

    void deleteCatagoryById(int id);
    
    Catagory updateCatagory(Catagory catagory);
    Optional<Catagory> findCatagoryById(int id);
}
