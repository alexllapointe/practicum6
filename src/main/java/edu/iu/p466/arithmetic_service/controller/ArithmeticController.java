package edu.iu.p466.arithmetic_service.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edu.iu.p466.arithmetic_service.service.IArithmeticService;

@RestController
@CrossOrigin
public class ArithmeticController {

    IArithmeticService arithmeticService;

    public ArithmeticController(IArithmeticService arithmeticService){
        this.arithmeticService = arithmeticService;
    }

    @GetMapping("/")
    public String greetings(){
        return "Welcome to the Arithmetic service!";
    }

    @GetMapping("/{n}/{m}")
    public int add(@PathVariable int n, @PathVariable int m){
        return arithmeticService.add(n, m);
    }
}