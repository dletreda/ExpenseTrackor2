package com.ExpenseTrackor.ExpenseTrackor.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ExpenseTrackor.ExpenseTrackor.model.Catagory;
import com.ExpenseTrackor.ExpenseTrackor.service.CatagoryService;

@RestController
 
public class CatagoriesController {

    @Autowired
    private CatagoryService catagoryService;

    @PostMapping("/catagory")
    public ResponseEntity<Catagory> saveCatagory(@RequestBody Catagory catagory) {
        Catagory savedCatagory = catagoryService.saveCatagory(catagory);
        return new ResponseEntity<>(savedCatagory, HttpStatus.CREATED);
    }

    @GetMapping("/catagory")
    public ResponseEntity<List<Catagory>> getAllCatagories() {
        List<Catagory> catagories = catagoryService.getAllCatagories();
        return new ResponseEntity<>(catagories, HttpStatus.OK);
    }

    @GetMapping("/catagory/{id}")
    public ResponseEntity<Catagory> getCatagoryById(@PathVariable("id") int id) {
        Optional<Catagory> catagory = catagoryService.findCatagoryById(id);
        return new ResponseEntity<Catagory>(HttpStatus.OK);
    }

    @PutMapping("/catagory/{id}")
    public ResponseEntity<Catagory> updateCatagory(@PathVariable("id") int id, @RequestBody Catagory catagory) {
        catagory.setCatagoryId(id);
        Catagory updatedCatagory = catagoryService.updateCatagory(catagory);
        return new ResponseEntity<>(updatedCatagory, HttpStatus.OK);
    }

    @DeleteMapping("/catagory/{id}")
    public ResponseEntity<Void> deleteCatagory(@PathVariable("id") int id) {
        catagoryService.deleteCatagoryById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
