package com.example.exercisespringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class welcomeController {
//- GET /name : returns “My name is .......”
   @GetMapping("/name")
    public String name(){
        return "My name is Reemas";
    }
//GET /age : returns “My age is ........”
    @GetMapping ("/age")
    public String age(){
       return "My age is 22";
    }
    //GET /check/status : returns “Everything OK”
    @GetMapping ("/cheack/me")
    public String cheackMe(){
       return "Everything OK";
    }
    //GET /health : returns “Server health is up and running” -
    @GetMapping ("/health")
    public String health(){
       return "Server health is up and running";
    }
    ArrayList<String>names=new ArrayList<>();
    //Get /names : return array of names
    @GetMapping("/names")
    public ArrayList<String>getNames(){
        names.add("Reemas");
        names.add("Yahia");
        return names;
    }
}
