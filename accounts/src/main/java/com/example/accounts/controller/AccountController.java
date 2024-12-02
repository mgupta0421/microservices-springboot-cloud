package com.example.accounts.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.accounts.dto.CustomerDto;
import com.example.accounts.dto.ResponseDto;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(path="/api", produces= MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class AccountController {

    


   @PostMapping("/create")
public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto){
    
    return ResponseEntity
        .status(HttpStatus.CREATED);
        .body(new ResponseDto("201", "Account created succesfully"))
}
}
