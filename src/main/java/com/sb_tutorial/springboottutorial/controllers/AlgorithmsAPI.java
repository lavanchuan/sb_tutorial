package com.sb_tutorial.springboottutorial.controllers;

import com.sb_tutorial.springboottutorial.algorithms.BigSorting;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class AlgorithmsAPI {

    @GetMapping("/big-sorting-api")
    public ResponseEntity<?> bigSorting(@RequestBody List<String> unsorting){
        return ResponseEntity.ok(BigSorting.bigSorting(unsorting));
    }
}
