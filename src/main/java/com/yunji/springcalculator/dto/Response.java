package com.yunji.springcalculator.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {

    private int result;

    private Body response;


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Body{
        private String resultCode = "OK";
    }
}
