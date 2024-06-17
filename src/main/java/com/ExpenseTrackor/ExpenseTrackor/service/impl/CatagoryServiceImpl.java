package com.ExpenseTrackor.ExpenseTrackor.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ExpenseTrackor.ExpenseTrackor.dao.CatagoryDao;
import com.ExpenseTrackor.ExpenseTrackor.model.Catagory;
import com.ExpenseTrackor.ExpenseTrackor.service.CatagoryService;
import com.ExpenseTrackor.ExpenseTrackorExceptions.CatagoryNotFoundException;

@Service
public class CatagoryServiceImpl implements CatagoryService {

    @Autowired
    private CatagoryDao catagoryDao;

    @Override
    public Catagory saveCatagory(Catagory catagory) {
        return catagoryDao.save(catagory);
    }

    @Override
    public List<Catagory> getAllCatagories() {
        return (List<Catagory>) catagoryDao.findAll();
    }

    @Override
    public Optional<Catagory> findCatagoryById(int id) {
    	
    	Optional<Catagory> cata= catagoryDao.findById(id);
		if(cata.isPresent()) {
			return Optional.of(cata.get());
		}else {
			throw new CatagoryNotFoundException("Customer is not avaiable with the given ID : "+ id);
		}
    }

    @Override
    public Catagory updateCatagory(Catagory catagory) {
        return catagoryDao.save(catagory);
    }

    @Override
    public void deleteCatagoryById(int id) {
        catagoryDao.deleteById(id);
    }
}
