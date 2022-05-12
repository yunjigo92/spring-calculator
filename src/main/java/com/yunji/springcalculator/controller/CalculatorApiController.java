package com.yunji.springcalculator.controller;

import com.yunji.springcalculator.component.Calculator;
import com.yunji.springcalculator.component.ICalculator;
import com.yunji.springcalculator.dto.Request;
import com.yunji.springcalculator.dto.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CalculatorApiController {

    private final ICalculator calculator;


    @GetMapping("/sum")
    public int sum(@RequestParam int x, @RequestParam int y){
        return calculator.sum(x,y);
    }


    @PostMapping("/minus")
    public Response minus(@RequestBody Request request){

        int result = calculator.minus(request.getX(), request.getY());
        Response response = new Response();

        response.setResult(result);
        response.setResponse(new Response.Body());
        return response;
    }


}
