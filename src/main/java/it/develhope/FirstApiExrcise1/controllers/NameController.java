package it.develhope.FirstApiExrcise1.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {
    private String name = "Arturo";

    @GetMapping(value = (""))
    public  String getName(){
        return name;
    }
    @PostMapping(value = "")
    public String postReverseName(){
        return new  StringBuilder().append(name).reverse().toString();
    }
}
