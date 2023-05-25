package com.example.springbootapp.config.controller;
import com.example.springbootapp.config.controller.service.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {
    @Autowired
    MyService service;
    @GetMapping("/show")
    public ResponseEntity<List<String>> show(){
        return ResponseEntity.ok(service.show());
    }
    @PostMapping("/add/{name}")
    public ResponseEntity<String> add(@PathVariable String name){
        return ResponseEntity.ok(service.add(name));
    }

    @PutMapping("/delete/{name}")
    public ResponseEntity<String> delete(@PathVariable String name){
        return ResponseEntity.ok(service.delete(name));
    }
}
