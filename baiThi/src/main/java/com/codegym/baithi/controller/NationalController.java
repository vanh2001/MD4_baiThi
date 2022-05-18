package com.codegym.baithi.controller;

import com.codegym.baithi.model.National;
import com.codegym.baithi.service.national.INationalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/national")
public class NationalController {
    @Autowired
    private INationalService nationalService;

    @GetMapping()
    public ResponseEntity<Iterable<National>> getAllNational(){
        return new ResponseEntity<>(nationalService.findAll(), HttpStatus.OK);
    }


}
