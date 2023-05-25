package com.example.springbootapp.config.controller.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class MyService {

    List<String> list = new ArrayList<>() ;
    {
        list.add("Razdeepak");
        list.add("Eneesha");
        list.add("Bhubaneswar");
        list.add("Andhra Pradesh");
    }
    public List<String > show(){
        return list;
    }

    public String add(String name){
        boolean b =list.add(name);
        if(b) return "Added";
        else return "Unsuccessful";
    }

    public String delete(String name){
        boolean b =list.remove(name);
        if(b) return "Added";
        else return "Unsuccessful";
    }
}
